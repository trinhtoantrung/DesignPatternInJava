package com.t3.design.builder;

import org.junit.Test;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/14/17 2:09 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ComputerTest {
  @Test
  public void BuilderTest() {
    //Using builder to get the object in a single line of code and
    //without any inconsistent state or arguments management issues
    Computer comp = new Computer.ComputerBuilder(
        "500 GB", "2 GB").setBluetoothEnabled(true)
        .setGraphicsCardEnabled(true).build();
  }
}