package com.t3.design.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 10:32 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class SocketClassAdapterImplTest {
  @Test
  public void testSocketAdapter() throws Exception {
    SocketAdapter socketAdapter = new SocketClassAdapterImpl();
    Volt v3 = socketAdapter.get3Volt();
    Volt v12 = socketAdapter.get12Volt();
    Volt v120 = socketAdapter.get120Volt();

    System.out.println("v3 volts using class adapter = " + v3.getVolts());
    System.out.println("v12 volts using class adapter = " + v12.getVolts());
    System.out.println("v120 volts using class adapter = " + v120.getVolts());
  }
}