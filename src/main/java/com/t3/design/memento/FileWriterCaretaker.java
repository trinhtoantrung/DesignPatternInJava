package com.t3.design.memento;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/21/17 2:15 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class FileWriterCaretaker {
  private Object obj;

  public void save(FileWriterUtil fileWriter) {
    obj = fileWriter.save();
  }

  public void undo(FileWriterUtil fileWriter) {
    fileWriter.undoToLastSave(obj);
  }
}
