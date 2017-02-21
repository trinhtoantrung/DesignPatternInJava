package com.t3.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 2:32 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ChatMediatorImpl implements ChatMediator {
  private List<User> users;

  public ChatMediatorImpl() {
    users = new ArrayList<User>();
  }

  public void sendMessage(String msg, User user) {
    for (User receivedUser: users) {
      if (receivedUser != user) {
        receivedUser.receive(msg);
      }
    }
  }

  public void addUser(User user) {
    users.add(user);
  }
}
