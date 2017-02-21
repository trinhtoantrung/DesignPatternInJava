package com.t3.design.state;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:22 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class TVStopState implements State {
  public void doAction() {
    System.out.println("TV is turned OFF");
  }
}
