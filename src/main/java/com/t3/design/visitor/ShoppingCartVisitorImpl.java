package com.t3.design.visitor;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:43 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
  public int visit(Book book) {
    int cost = 0;
    //apply 5$ discount if book price is greater than 50
    if (book.getPrice() > 50) {
      cost = book.getPrice() - 5;
    }
    else cost = book.getPrice();
    System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
    return cost;
  }

  public int visit(Fruit fruit) {
    int cost = fruit.getPricePerKg() * fruit.getWeight();
    System.out.println(fruit.getName() + " cost = " + cost);
    return cost;
  }
}
