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
public class ShoppingCartClient {

  public static void main(String[] args) {
    ItemElement[] items = new ItemElement[]{new Book(20, "1234"), new Book(100, "5678"),
        new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

    int total = calculatePrice(items);
    System.out.println("Total Cost = " + total);
  }

  private static int calculatePrice(ItemElement[] items) {
    ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
    int sum = 0;
    for (ItemElement item : items) {
      sum = sum + item.accept(visitor);
    }
    return sum;
  }
}
