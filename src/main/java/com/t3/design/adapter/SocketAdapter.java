package com.t3.design.adapter;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 10:11 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface SocketAdapter {
  public Volt get120Volt();
  public Volt get12Volt();
  public Volt get3Volt();
}
