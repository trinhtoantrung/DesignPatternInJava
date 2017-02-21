package com.t3.design.state;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:21 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class TVStartState implements State {
  public void doAction() {
    System.out.println("TV is turned ON");
  }
}
