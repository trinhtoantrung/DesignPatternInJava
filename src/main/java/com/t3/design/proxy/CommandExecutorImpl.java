package com.t3.design.proxy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 1:50 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class CommandExecutorImpl implements CommandExecutor {
  public void runCommand(String cmd) throws Exception {
    Runtime.getRuntime().exec(cmd);
    System.out.println(cmd + " command executed");
  }
}
