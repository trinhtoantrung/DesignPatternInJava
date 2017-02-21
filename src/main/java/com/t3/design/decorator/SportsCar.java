package com.t3.design.decorator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 10:48 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class SportsCar extends CarDecorator{
  public SportsCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of sport cars");
  }
}
