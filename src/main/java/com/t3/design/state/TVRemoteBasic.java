package com.t3.design.state;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:19 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class TVRemoteBasic {
  private String state = "";

  public void setState(String state) {
    this.state = state;
  }

  public void doAction() {
    if (state.equalsIgnoreCase("ON")) {
      System.out.println("TV is turned ON");
    }
    else if (state.equalsIgnoreCase("OFF")) {
      System.out.println("TV is turned OFF");
    }
  }

  public static void main(String args[]) {
    TVRemoteBasic remote = new TVRemoteBasic();

    remote.setState("ON");
    remote.doAction();

    remote.setState("OFF");
    remote.doAction();
  }
}
