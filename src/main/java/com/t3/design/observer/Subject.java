package com.t3.design.observer;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/17/17 2:21 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface Subject {
  //methods to register and unregister observers
  public void register(Observer obj);

  public void unregister(Observer obj);

  //method to notify observers of change
  public void notifyObservers();

  //method to get updates from subject
  public Object getUpdate(Observer obj);
}
