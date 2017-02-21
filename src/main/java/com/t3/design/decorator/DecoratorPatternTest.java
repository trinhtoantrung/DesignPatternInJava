package com.t3.design.decorator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 10:52 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class DecoratorPatternTest {
  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("\n*****");

    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
  }
}
