package com.t3.design.command;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 1:59 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class FileSystemReceiverUtil {
  public static FileSystemReceiver getUnderlyingFileSystem(){
    String osName = System.getProperty("os.name");
    System.out.println("Underlying OS is: "+osName);
    if(osName.contains("Windows")){
      return new WindowsFileSystemReceiver();
    }else{
      return new UnixFileSystemReceiver();
    }
  }
}
