package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 11:42 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class UnixFileSystemReceiver implements FileSystemReceiver{
  public void openFile() {
    System.out.println("Opening file in unix OS");
  }

  public void writeFile() {
    System.out.println("Writing file in unix OS");
  }

  public void closeFile() {
    System.out.println("Closing file in unix OS");
  }
}
