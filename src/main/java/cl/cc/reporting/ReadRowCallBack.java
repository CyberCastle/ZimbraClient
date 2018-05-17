package cl.cc.reporting;

import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author CyberCastle
 */
public interface ReadRowCallBack {

    public void processRow(Row row);
}
