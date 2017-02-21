package com.t3.design.bridge;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 5:15 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Triangle extends Shape {
  public Triangle(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    System.out.println("Triangle filled with color");
    color.applyColor();
  }
}
