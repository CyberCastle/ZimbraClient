package cl.cc.reporting;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author CyberCastle
 */
public class ExcelReport extends AbstractReport {

    protected final static String DEFAULT_DATE_CELL_FORMAT = "dd-mmm-yyyy";

    protected Workbook book;
    protected Sheet workingSheet;
    protected Integer firstRow;
    protected Integer firstColumn;
    protected String dateCellFormat;
    protected DataFormat dataFormat;
    protected FormulaEvaluator formulaEvaluator;
    protected CellStyle generalCellStyle;
    protected boolean putEmptyStringIsNull;

    public ExcelReport() {
        super();
        this.firstRow = 0;
        this.firstColumn = 0;
        putEmptyStringIsNull = false;
    }

    public void setDateCellFormat(String dateCellFormat) {
        this.dateCellFormat = dateCellFormat;
    }

    public void setPutEmptyStringIsNull(boolean putEmptyStringIsNull) {
        this.putEmptyStringIsNull = putEmptyStringIsNull;
    }

    @Override
    public void loadBase() throws ReportException {
        try {
            this.book = new XSSFWorkbook(this.baseDocument);
            this.dataFormat = book.createDataFormat();
        } catch (IOException e) {
            throw new ReportException("Error to load base document.", "Rprt - 02", e);
        }
    }

    public void loadTemplate(InputStream template) throws IOException, ReportException {
        this.setBaseDocument(template);
        this.loadBase();
    }

    public void setWorkingSheet(Integer sheet) {
        this.workingSheet = this.book.getSheetAt(sheet);
        this.workingSheet.setForceFormulaRecalculation(true);
    }

    public void setFirstRow(Integer firstRow) {
        this.firstRow = firstRow;
    }

    public void setFirstColumn(Integer firstColumn) {
        this.firstColumn = firstColumn;
    }

    public void setGeneralCellStyle(CellStyle generalCellStyle) {
        this.generalCellStyle = generalCellStyle;
    }

    // Completamos la hoja
    public void fillSheet(List<?> beans, List<String> fieldNames) throws ReportException {

        Integer rowCount = this.firstRow;
        String _dateCellFormat = DEFAULT_DATE_CELL_FORMAT;
        if (this.dateCellFormat != null) {
            _dateCellFormat = this.dateCellFormat;
        }

        // Se setea el formato que tendrá la fecha
        CellStyle cs = this.createCellStyle(_dateCellFormat);
        try {
            for (Object bean : beans) {
                Row row = this.workingSheet.createRow(rowCount ++);
                for (int column = 0; column < fieldNames.size(); column ++) {
                    Cell cell = row.createCell(firstColumn + column);
                    Object cellValue = PropertyUtils.getProperty(bean, fieldNames.get(column));
                    this.setCellValue(cell, cellValue, cs, null);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new ReportException("Error to fill the document.", "Rprt - 03", e);
        }
    }

    public void addFormula(String cellPosition, String formula) {
        Cell cell = this.getCellByPosition(cellPosition);
        cell.setCellFormula(formula);
    }

    public void setCellValue(String cellPosition, Object cellValue) {
        this.setCellValue(cellPosition, cellValue, null, null);
    }

    public void setCellValue(String cellPosition, Object cellValue, String dateFormat, String numberFormat) {
        CellStyle dateCellStyle = null;
        CellStyle numberCellStyle = null;

        // Se añade estilo para las fechas
        if (dateFormat != null) {
            dateCellStyle = this.createCellStyle(dateFormat);
        }

        // Se añade estilo para los números
        if (numberFormat != null) {
            numberCellStyle = this.createCellStyle(numberFormat);
        }
        this.setCellValue(this.getCellByPosition(cellPosition), cellValue, dateCellStyle, numberCellStyle);
    }

    public void readRows(ReadRowCallBack callback) {
        this.workingSheet.rowIterator().forEachRemaining((Row row) -> {

            // Saltamos la primera columna
            if (row.getRowNum() < this.firstRow) {
                return;
            }
            countRows();
            callback.processRow(row);
        });
    }

    // Evaluador de fórmula excel
    public FormulaEvaluator getFormulaEvaluator() {
        if (this.formulaEvaluator == null) {
            this.formulaEvaluator = this.book.getCreationHelper().createFormulaEvaluator();
        }

        return this.formulaEvaluator;
    }

    @Override
    public void save(OutputStream out) throws ReportException {
        try {
            this.book.write(out);
        } catch (IOException e) {
            throw new ReportException("Error to save document.", "Rprt - 02", e);
        }
    }

    protected Cell getCellByPosition(String cellPosition) {
        CellReference cellReference = new CellReference(cellPosition);
        Row row = this.workingSheet.getRow(cellReference.getRow());

        if (row == null) {
            row = this.workingSheet.createRow(this.workingSheet.getLastRowNum());
        }

        Cell cell = row.getCell(cellReference.getCol());
        // No existe la celda, hay que crearla
        if (cell == null) {
            cell = row.createCell(this.firstColumn + row.getLastCellNum());
        }
        return cell;
    }

    protected void setCellValue(Cell cell, Object cellValue) {
        this.setCellValue(cell, cellValue, this.generalCellStyle, this.generalCellStyle);
    }

    protected void setCellValue(Cell cell, Object cellValue, CellStyle dateCellStyle, CellStyle numberCellStyle) {
        if (cellValue == null) {

            // Si este flag está activado, la celda se llenará con un espacio
            // en caso de que el valor pasado sea nulo
            if (putEmptyStringIsNull) {
                cellValue = "";
            } else {
                return;
            }
        }

        if (cellValue instanceof Date) {
            // Guardamos el valor como una fecha, con formato pre-establecido
            cell.setCellValue((Date) cellValue);
            if (dateCellStyle != null) {
                cell.setCellStyle(dateCellStyle);
            }
        } else if (cellValue instanceof Number) {
            // Guardamos el valor como un número, con formato pre-establecido
            cell.setCellValue(((Number) cellValue).doubleValue());
            if (numberCellStyle != null) {
                cell.setCellStyle(numberCellStyle);
            }
        } else {
            // Guardamos el resto como texto
            cell.setCellValue(cellValue.toString());
            // Estilo general
            if (this.generalCellStyle != null) {
                cell.setCellStyle(this.generalCellStyle);
            }
        }

    }

    protected CellStyle createCellStyle(String dataFormat) {
        CellStyle cs = this.book.createCellStyle();
        cs.setDataFormat(this.dataFormat.getFormat(dataFormat));
        return cs;
    }

    // Para mantener un registro de las columnas procesadas.
    private Integer rowIndex = 1;

    private void countRows() {
        this.rowIndex ++;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    // Piece of code obtain from here: http://stackoverflow.com/a/35324693
    public void autoSizeColumns() {
        int numberOfSheets = this.book.getNumberOfSheets();
        for (int i = 0; i < numberOfSheets; i ++) {
            Sheet sheet = this.book.getSheetAt(i);
            int numberOfRows = sheet.getPhysicalNumberOfRows();
            if (numberOfRows > 0) {
                for (int j = 0; j < numberOfRows; j ++) {
                    Row row = sheet.getRow(j);
                    if (row != null) {
                        Iterator<Cell> cellIterator = row.cellIterator();
                        while (cellIterator.hasNext()) {
                            Cell cell = cellIterator.next();
                            int columnIndex = cell.getColumnIndex();
                            sheet.autoSizeColumn(columnIndex);
                        }
                        break;
                    }
                }
            }
        }
    }
}
