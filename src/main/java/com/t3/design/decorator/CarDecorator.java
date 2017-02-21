package com.t3.design.decorator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 10:34 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class CarDecorator implements Car{
  protected Car car;

  public CarDecorator(Car car) {
    this.car = car;
  }

  public void assemble() {
    this.car.assemble();
  }
}
