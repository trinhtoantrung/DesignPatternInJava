package com.t3.design.proxy;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/15/17 1:52 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class CommandExecutorProxy implements CommandExecutor{
  private boolean isAdmin;
  private CommandExecutor executor;

  public CommandExecutorProxy(String user, String pwd) {
    if ("admin".equals(user) && "admin".equals(pwd)) {
      isAdmin = true;
    }

    executor = new CommandExecutorImpl();
  }

  public void runCommand(String cmd) throws Exception {
    if (isAdmin) {
      executor.runCommand(cmd);
    } else {
      if (cmd.trim().startsWith("rm")) {
        throw new Exception("rm command is not allowed for non-admin users");
      } else {
        executor.runCommand(cmd);
      }
    }
  }
}
