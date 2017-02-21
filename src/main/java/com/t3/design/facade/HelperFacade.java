package com.t3.design.facade;

import java.sql.Connection;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 4:57 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class HelperFacade {
  public static enum DBTypes {
    MYSQL, ORACLE;
  }

  public static enum ReportTypes {
    HTML, PDF;
  }

  public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
    Connection con = null;
    switch (dbType) {
      case MYSQL:
        con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        switch (reportType) {
          case HTML:
            mySqlHelper.generateMySqlHTMLReport(tableName, con);
            break;
          case PDF:
            mySqlHelper.generateMySqlPDFReport(tableName, con);
            break;
        }
        break;
      case ORACLE:
        con = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        switch (reportType) {
          case HTML:
            oracleHelper.generateOracleHTMLReport(tableName, con);
            break;
          case PDF:
            oracleHelper.generateOraclePDFReport(tableName, con);
            break;
        }
        break;
    }

  }
}
