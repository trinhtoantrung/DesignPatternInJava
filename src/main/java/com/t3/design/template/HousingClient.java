package com.t3.design.template;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 11:13 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class HousingClient {
  public static void main(String[] args) {
    HouseTemplate houseType = new WoodenHouse();

    //using template method
    houseType.buildHouse();
    System.out.println("************");

    houseType = new GlassHouse();

    houseType.buildHouse();
  }
}
