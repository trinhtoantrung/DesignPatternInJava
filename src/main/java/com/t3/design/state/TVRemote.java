package com.t3.design.state;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:24 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class TVRemote {

  public static void main(String[] args) {
    TVContext context = new TVContext();
    State tvStartState = new TVStartState();
    State tvStopState = new TVStopState();

    context.setTvState(tvStartState);
    context.doAction();


    context.setTvState(tvStopState);
    context.doAction();
  }
}
