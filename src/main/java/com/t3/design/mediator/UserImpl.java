package com.t3.design.mediator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 2:35 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class UserImpl extends User {
  public UserImpl(ChatMediator mediator, String name) {
    super(mediator, name);
  }

  public void send(String msg) {
    System.out.println(this.name + ": Sending Message=" + msg);
    mediator.sendMessage(msg, this);
  }

  public void receive(String msg) {
    System.out.println(this.name+": Received Message:"+msg);
  }
}
