package com.t3.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/14/17 4:32 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Employees implements Cloneable {
  private List<String> empList;

  public Employees() {
    empList = new ArrayList<String>();
  }

  public Employees(List<String> empList) {
    this.empList = empList;
  }

  public void loadData() {
    // read all employees from database and put into list
    empList.add("Trung");
    empList.add("Cuong");
    empList.add("Hoai");
    empList.add("Tu");
  }

  public List<String> getEmpList() {
    return empList;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    List<String> temp = new ArrayList<String>();
    for (String emp: this.getEmpList()) {
      temp.add(emp);
    }

    return new Employees(temp);
  }
}
