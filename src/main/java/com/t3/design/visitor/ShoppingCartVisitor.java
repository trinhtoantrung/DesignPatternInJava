package com.t3.design.visitor;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/20/17 2:42 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface ShoppingCartVisitor {
  int visit(Book book);

  int visit(Fruit fruit);
}
