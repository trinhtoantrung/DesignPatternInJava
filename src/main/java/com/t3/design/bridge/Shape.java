package com.t3.design.bridge;

import java.awt.*;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 5:14 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public abstract class Shape {
  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  abstract public void applyColor();
}
