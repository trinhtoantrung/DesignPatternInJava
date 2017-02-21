package com.t3.design.visitor;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:38 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Book implements ItemElement {
  private int price;
  private String isbnNumber;

  public Book(int cost, String isbn) {
    this.price = cost;
    this.isbnNumber = isbn;
  }

  public int getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
