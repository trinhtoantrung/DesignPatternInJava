package com.t3.design.bridge;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 5:20 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class BridgePatternTest {
  public static void main(String[] args) {
    Shape tri = new Triangle(new RedColor());
    tri.applyColor();

    Shape pent = new Pentagon(new GreenColor());
    pent.applyColor();
  }
}
