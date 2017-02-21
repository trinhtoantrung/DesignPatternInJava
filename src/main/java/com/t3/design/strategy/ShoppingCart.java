package com.t3.design.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:12 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ShoppingCart {
  // List of items;
  List<Item> items;

  public ShoppingCart() {
    items = new ArrayList<Item>();
  }

  public void addItem(Item newItem) {
    items.add(newItem);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public int caculateTotal() {
    int total = 0;

    for (Item item: items) {
      total += item.getPrice();
    }

    return total;
  }

  public void pay(PaymentStrategy payment) {
    int amount = caculateTotal();
    payment.pay(amount);
  }
}
