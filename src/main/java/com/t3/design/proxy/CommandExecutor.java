package com.t3.design.proxy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 1:49 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface CommandExecutor {
  public void runCommand(String cmd) throws Exception;
}
