package com.t3.design.chainofresponsibility;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 4:12 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Currency {
  private int amount;

  public Currency(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }
}
