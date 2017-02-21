package com.t3.design.iterator;

/**
 * Creation of DesignPatterInJava.
 * <p/>
 * Created by tttrinh
 * Created date 2/21/17 10:47 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Channel {
  private double frequency;
  private ChannelTypeEnum TYPE;

  public Channel(double frequency, ChannelTypeEnum TYPE) {
    this.frequency = frequency;
    this.TYPE = TYPE;
  }

  public double getFrequency() {
    return frequency;
  }

  public ChannelTypeEnum getTYPE() {
    return TYPE;
  }

  @Override
  public String toString() {
    return "Frequency: " + frequency + ", type: " + TYPE;
  }
}
