package com.t3.design.flyweight;

import java.awt.*;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 2:18 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface Shape {
  public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
