package com.t3.design.singleton;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/14/17 2:58 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class BillPughSingleton {
  private BillPughSingleton() {}

  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}
