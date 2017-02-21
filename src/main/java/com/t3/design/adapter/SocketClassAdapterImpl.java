package com.t3.design.adapter;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 10:25 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
  public Volt get120Volt() {
    return getVolt();
  }

  public Volt get12Volt() {
    return convertVolt(getVolt(),10);
  }

  public Volt get3Volt() {
    return convertVolt(getVolt(), 40);
  }

  private Volt convertVolt(Volt v, int i) {
    return new Volt(v.getVolts()/i);
  }
}
