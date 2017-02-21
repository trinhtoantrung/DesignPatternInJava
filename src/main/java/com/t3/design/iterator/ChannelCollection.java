package com.t3.design.iterator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/21/17 10:51 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface ChannelCollection {
  public void addChannel(Channel c);

  public void removeChannel(Channel c);

  public ChannelIterator iterator(ChannelTypeEnum type);
}
