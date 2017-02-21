package com.t3.design.chainofresponsibility;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/16/17 4:16 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface DispenseChain {
  void setNextChain(DispenseChain nextChain);
  void dispense(Currency currency);
}
