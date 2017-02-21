package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:41 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface FileSystemReceiver {
  public void openFile();
  public void writeFile();
  public void closeFile();
}