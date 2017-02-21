package com.t3.design.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 1:59 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ProxyPatternTest {
  @Test
  public void testProxyPattern() throws Exception {
    CommandExecutor commandExecutor = new CommandExecutorProxy("trung", "password");
    try {
//      commandExecutor.runCommand("ls -ltr");
      commandExecutor.runCommand("rm abc.text");
    } catch (Exception e) {
      System.out.println("Exeption message: " + e.getMessage());
    }
  }
}