package com.t3.design.observer;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/17/17 2:23 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface Observer {
  //method to update the observer, used by subject
  public void update();

  //attach with subject to observe
  public void setSubject(Subject sub);
}
