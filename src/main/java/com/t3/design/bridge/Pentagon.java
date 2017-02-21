package com.t3.design.bridge;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 5:17 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Pentagon extends Shape {
  public Pentagon(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    System.out.println("Pentagon filled with color");
    color.applyColor();
  }
}
