package cl.cc.reporting;

import cl.cc.zcsclient.mail.EmailInfo;
import cl.cc.zcsclient.mail.MessageHitInfo;
import cl.cc.zcsclient.mail.PartInfo;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author CyberCastle
 */
public class MailReport extends ExcelReport {

    public MailReport() {
        super();
        this.firstRow = 1;
        this.putEmptyStringIsNull = true;
    }

    public void fillSheet(List<Object> messages) {

// Se selecciona la primera hoja.
        this.setWorkingSheet(0);

        // Formato de las celdas con fechas
        CellStyle dateCellStyle = this.getCellByPosition("B2").getCellStyle();

        // Formato para el resto de las celdas
        CellStyle genericCellStyle = this.getCellByPosition("A2").getCellStyle();
        this.setGeneralCellStyle(genericCellStyle);

        Integer rowCount = this.firstRow;
        for (Object message : messages) {

            Row row = this.workingSheet.createRow(rowCount ++);
            MessageHitInfo _message = (MessageHitInfo) message;
            PartInfo part = (PartInfo) _message.getMpOrShrOrDlSubs().get(0);
            String sender = getFromAddress(_message.getE());
            Date messageDate = new Date(_message.getD());
            String subject = _message.getSu();
            String resume = _message.getFr();
            String content = getContentText(part);

            // Remitente
            this.setCellValue(row.createCell(0), sender);

            // Fecha Correo
            this.setCellValue(row.createCell(1), messageDate, dateCellStyle, null);

            // Asunto
            this.setCellValue(row.createCell(2), subject);

            // Resumen
            this.setCellValue(row.createCell(3), resume);

            // Mensage
            this.setCellValue(row.createCell(4), content);

            //System.out.println(String.format("ID: %s, Messagge: <<----->>\\n%s\\n<<----->>", getFromAddress(_message.getE()), new Date(_message.getD())));
        }
    }

    public String getFromAddress(List<EmailInfo> list) {
        return list.stream().filter(l -> l.getT().equals("f")).findFirst().get().getA();
    }

    public String getContentText(PartInfo part) {
        String content = part.getContent();
        if (content == null) {
            if ( ! part.getMp().isEmpty()) {
                content = getContentText(part.getMp().get(0));
            }
        }
        return content;
    }
}
