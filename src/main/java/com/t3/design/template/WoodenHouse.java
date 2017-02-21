package com.t3.design.template;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 11:11 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class WoodenHouse extends HouseTemplate {
  @Override
  public void buildPillars() {
    System.out.println("Building Pillars with Wood coating");
  }

  @Override
  public void buildWalls() {
    System.out.println("Building Wooden Walls");
  }
}
