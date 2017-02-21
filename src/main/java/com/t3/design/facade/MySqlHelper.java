package com.t3.design.facade;

import java.sql.Connection;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 4:55 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class MySqlHelper {
  public static Connection getMySqlDBConnection() {
    //get MySql DB connection using connection parameters
    return null;
  }

  public void generateMySqlPDFReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }

  public void generateMySqlHTMLReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }
}
