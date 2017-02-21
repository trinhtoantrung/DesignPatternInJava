package com.t3.design.decorator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 10:50 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class LuxuryCar extends CarDecorator {
  public LuxuryCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of luxury cars");
  }
}
