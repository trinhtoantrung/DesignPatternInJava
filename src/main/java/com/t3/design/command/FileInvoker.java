package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 1:56 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class FileInvoker {
  public Command command;

  public FileInvoker(Command command) {
    this.command = command;
  }

  public void execute() {
    this.command.execute();
  }
}
