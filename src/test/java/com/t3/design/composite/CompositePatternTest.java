package com.t3.design.composite;

import org.junit.Test;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 11:03 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class CompositePatternTest {
  @Test
  public void testCompositePattern() throws Exception {
    Shape triangle1 = new Triangle();
    Shape triangle2 = new Triangle();
    Shape circle1 = new Circle();

    Drawing drawing = new Drawing();

    drawing.add(triangle1);
    drawing.add(triangle2);
    drawing.add(circle1);
    drawing.draw("red");

    drawing.clear();

    drawing.add(triangle1);
    drawing.add(triangle2);
    drawing.draw("green");
  }
}