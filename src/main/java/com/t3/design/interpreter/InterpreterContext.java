package com.t3.design.interpreter;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 3:07 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class InterpreterContext {
  public String getBinaryFormat(int i) {
    return Integer.toBinaryString(i);
  }

  public String getHexadecimalFormat(int i) {
    return Integer.toHexString(i);
  }
}
