package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:00 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class FileSystemClient {

  public static void main(String[] args) {
    FileSystemReceiver receiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

    OpenFileCommand openFileCommand = new OpenFileCommand(receiver);
    FileInvoker invoker = new FileInvoker(openFileCommand);
    invoker.execute();

    WriteFileCommand writeFileCommand = new WriteFileCommand(receiver);
    invoker = new FileInvoker(writeFileCommand);
    invoker.execute();

    CloseFileCommand closeFileCommand = new CloseFileCommand(receiver);
    invoker = new FileInvoker(closeFileCommand);
    invoker.execute();
  }
}
