package com.t3.design.composite;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 10:54 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Circle implements Shape {
  public void draw(String fillColor) {
    System.out.println("Drawing circle with color " + fillColor);
  }
}
