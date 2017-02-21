package com.t3.design.flyweight;

import java.awt.*;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 2:26 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Oval implements Shape {
  // intrinsic property
  private boolean fill;

  public Oval(boolean fill) {
    this.fill = fill;
    System.out.println("Creating oval object with fill = " + fill);
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
    circle.setColor(color);
    circle.drawOval(x, y, width, height);
    if (fill) {
      circle.fillOval(x, y, width, height);
    }
  }
}
