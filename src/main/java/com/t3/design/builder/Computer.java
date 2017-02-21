package com.t3.design.builder;

/**
 * Creation of Builder.
 * <p/>
 * Created by tttrinh
 * Created date 2/14/17 1:55 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class Computer {
  // required parameters
  private String HDD;
  private String RAM;

  // optional parameters
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;

  public String getHDD() {
    return HDD;
  }

  public String getRAM() {
    return RAM;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }

  private Computer(ComputerBuilder builder) {
    this.HDD = builder.HDD;
    this.RAM = builder.RAM;
    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  // Builder Class
  public static class ComputerBuilder {
    // required parameters
    private String HDD;
    private String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String HDD, String RAM) {
      this.HDD = HDD;
      this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
      isGraphicsCardEnabled = graphicsCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
      isBluetoothEnabled = bluetoothEnabled;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}
