package com.t3.design.mediator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 2:28 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public abstract class User {
  protected ChatMediator mediator;
  protected String name;

  public User(ChatMediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  public abstract void send(String msg);
  public abstract void receive(String msg);

}
