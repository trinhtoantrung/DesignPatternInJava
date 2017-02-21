package com.t3.design.visitor;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:39 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Fruit implements ItemElement {
  private int pricePerKg;
  private int weight;
  private String name;

  public Fruit(int priceKg, int wt, String nm) {
    this.pricePerKg = priceKg;
    this.weight = wt;
    this.name = nm;
  }

  public int getPricePerKg() {
    return pricePerKg;
  }


  public int getWeight() {
    return weight;
  }

  public String getName() {
    return this.name;
  }

  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
