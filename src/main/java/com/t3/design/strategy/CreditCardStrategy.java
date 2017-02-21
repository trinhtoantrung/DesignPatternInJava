package com.t3.design.strategy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:07 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class CreditCardStrategy implements PaymentStrategy {

  private String name;
  private String cardNumber;
  private String cvv;
  private String dateOfExpiry;

  public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.dateOfExpiry = dateOfExpiry;
  }

  public void pay(int amount) {
    System.out.println(amount + " paid with credit/debit card");
  }
}
