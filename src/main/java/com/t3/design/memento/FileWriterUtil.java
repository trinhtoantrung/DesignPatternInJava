package com.t3.design.memento;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/21/17 2:06 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class FileWriterUtil {
  private String fileName;
  private StringBuilder content;

  public FileWriterUtil(String fileName) {
    this.fileName = fileName;
    this.content = new StringBuilder();
  }

  @Override
  public String toString() {
    return this.content.toString();
  }

  public void write(String str) {
    content.append(str);
  }

  public Memento save() {
    return new Memento(this.fileName, this.content);
  }

  public void undoToLastSave(Object obj) {
    Memento memento = (Memento) obj;
    this.fileName = memento.fileName;
    this.content = memento.content;
  }

  private class Memento {
    String fileName;
    StringBuilder content;

    public Memento(String fileName, StringBuilder content) {
      this.fileName = fileName;
      this.content = content;
    }
  }
}
