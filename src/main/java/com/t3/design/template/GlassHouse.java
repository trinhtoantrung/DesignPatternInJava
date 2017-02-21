package com.t3.design.template;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 11:12 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class GlassHouse extends HouseTemplate{
  @Override
  public void buildPillars() {
    System.out.println("Building Pillars with glass coating");
  }

  @Override
  public void buildWalls() {
    System.out.println("Building Glass Walls");
  }
}
