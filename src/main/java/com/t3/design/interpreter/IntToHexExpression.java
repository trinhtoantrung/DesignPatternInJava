package com.t3.design.interpreter;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 3:12 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class IntToHexExpression implements Expression {
  private int i;

  public IntToHexExpression(int i) {
    this.i = i;
  }

  public String interpret(InterpreterContext ic) {
    return ic.getHexadecimalFormat(i);
  }
}
