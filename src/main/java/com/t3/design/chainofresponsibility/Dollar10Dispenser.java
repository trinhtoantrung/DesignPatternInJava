package com.t3.design.chainofresponsibility;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 4:25 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Dollar10Dispenser implements DispenseChain {
  private DispenseChain chain;

  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  public void dispense(Currency currency) {
    if (currency.getAmount() >= 10) {
      int num = currency.getAmount() / 10;
      int remainder = currency.getAmount() % 10;
      System.out.println("Dispensing " + num + " 10$ note");
      if (remainder != 0) this.chain.dispense(new Currency(remainder));
    }
    else {
      this.chain.dispense(currency);
    }
  }
}
