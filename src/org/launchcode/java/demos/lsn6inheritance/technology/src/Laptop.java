package org.launchcode.java.demos.lsn6inheritance.technology.src;

public class Laptop extends Computer {

  private String macOrPc;

  public Laptop(int screenSize, String amountOfMemory) {
    super(screenSize, amountOfMemory);
  }

  public Laptop(int screenSize, String amountOfMemory, String aMacOrPc) {
    super(screenSize, amountOfMemory);
    macOrPc = aMacOrPc;
  }
}
