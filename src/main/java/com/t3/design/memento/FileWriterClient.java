package com.t3.design.memento;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/21/17 2:20 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class FileWriterClient {
  public static void main(String[] args) {
    FileWriterCaretaker caretaker = new FileWriterCaretaker();

    FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
    fileWriter.write("First Set of Data\n");
    System.out.println(fileWriter + "\n\n");

    // lets save the file
    caretaker.save(fileWriter);
    //now write something else
    fileWriter.write("Second Set of Data\n");

    //checking file contents
    System.out.println(fileWriter + "\n\n");

    //lets undo to last save
    caretaker.undo(fileWriter);

    //checking file content again
    System.out.println(fileWriter + "\n\n");
  }
}
