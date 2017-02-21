package com.t3.design.strategy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:19 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ShoppingCartTest {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    Item item1 = new Item("1234", 10);
    Item item2 = new Item("5678", 40);

    cart.addItem(item1);
    cart.addItem(item2);

    //pay by paypal
    cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

    //pay by credit card
    cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
  }
}
