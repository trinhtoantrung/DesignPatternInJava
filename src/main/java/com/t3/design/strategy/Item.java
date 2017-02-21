package com.t3.design.strategy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:11 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Item {
  private String upcCode;
  private int price;

  public Item(String upcCode, int price) {
    this.upcCode = upcCode;
    this.price = price;
  }

  public String getUpcCode() {
    return upcCode;
  }

  public int getPrice() {
    return price;
  }
}
