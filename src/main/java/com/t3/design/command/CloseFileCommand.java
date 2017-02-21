package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 1:53 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class CloseFileCommand implements Command {
  FileSystemReceiver fileSystem;

  public CloseFileCommand(FileSystemReceiver fileSystem) {
    this.fileSystem = fileSystem;
  }

  public void execute() {
    this.fileSystem.closeFile();
  }
}
