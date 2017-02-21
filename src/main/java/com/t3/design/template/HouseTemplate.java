package com.t3.design.template;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 11:08 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public abstract class HouseTemplate {
  public final void buildHouse() {
    buildFoundation();
    buildPillars();
    buildWalls();
    buildWindows();
  }

  // default implementation
  private void buildWindows() {
    System.out.println("Building class windows");
  }

  // methods to be implemented by subclass
  public abstract void buildPillars();
  public abstract void buildWalls();

  private void buildFoundation() {
    System.out.println("Building foundation with cement,iron rods and sand");
  }
}
