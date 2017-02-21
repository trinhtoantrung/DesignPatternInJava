package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 1:47 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class WindowsFileSystemReceiver implements FileSystemReceiver {
  public void openFile() {
    System.out.println("Opening file in window OS");
  }

  public void writeFile() {
    System.out.println("Writing file in window OS");
  }

  public void closeFile() {
    System.out.println("Closing file in window OS");
  }
}
