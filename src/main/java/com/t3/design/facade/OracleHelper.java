package com.t3.design.facade;

import java.sql.Connection;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 4:56 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class OracleHelper {
  public static Connection getOracleDBConnection() {
    //get Oracle DB connection using connection parameters
    return null;
  }

  public void generateOraclePDFReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }

  public void generateOracleHTMLReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }
}
