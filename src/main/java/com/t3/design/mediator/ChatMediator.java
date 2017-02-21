package com.t3.design.mediator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 2:26 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface ChatMediator {
  public void sendMessage(String msg, User user);
  void addUser(User user);
}
