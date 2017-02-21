package com.t3.design.state;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:23 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class TVContext implements State{
    private State tvState;

  public State getTvState() {
    return tvState;
  }

  public void setTvState(State tvState) {
    this.tvState = tvState;
  }

  public void doAction() {
    this.tvState.doAction();
  }
}
