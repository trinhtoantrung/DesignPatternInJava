package com.t3.design.strategy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:09 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class PaypalStrategy implements PaymentStrategy {
  private String emailId;
  private String password;

  public PaypalStrategy(String emailId, String password) {
    this.emailId = emailId;
    this.password = password;
  }

  public void pay(int amount) {
    System.out.println(amount + " paid using Paypal");
  }
}
