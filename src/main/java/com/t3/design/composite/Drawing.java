package com.t3.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 10:57 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Drawing implements Shape{
  private List<Shape> shapes = new ArrayList<Shape>();

  public void draw(String fillColor) {
    for (Shape shape: shapes) {
      shape.draw(fillColor);
    }
  }

  public void add(Shape s) {
    shapes.add(s);
  }

  public void remove(Shape e) {
    shapes.remove(e);
  }

  public void clear() {
    System.out.println("Clear all");
    shapes.clear();
  }
}
