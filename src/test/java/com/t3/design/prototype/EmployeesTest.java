package com.t3.design.prototype;

import org.junit.Test;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/14/17 4:50 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class EmployeesTest {

  @Test
  public void testPrototype() throws Exception {
    Employees employees = new Employees();
    employees.loadData();

    Employees employees1 = (Employees) employees.clone();
    Employees employees2 = (Employees) employees.clone();
    employees1.getEmpList().add("Naruto");
    employees2.getEmpList().remove("Hoai");

    System.out.println("Employees list: " + employees.getEmpList());
    System.out.println("Employees1 list: " + employees1.getEmpList());
    System.out.println("Employees2 list: " + employees2.getEmpList());
  }
}