package com.t3.design.interpreter;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 3:11 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class IntToBinaryExpression implements Expression {
  private int i;

  public IntToBinaryExpression(int i) {
    this.i = i;
  }

  public String interpret(InterpreterContext ic) {
    return ic.getBinaryFormat(this.i);
  }
}
