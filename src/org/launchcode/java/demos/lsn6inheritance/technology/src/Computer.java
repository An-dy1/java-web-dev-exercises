package org.launchcode.java.demos.lsn6inheritance.technology.src;

public class Computer {

  /* FIELDS */
  private int screenSize;
  private String amountOfMemory;
  private boolean hasBuiltInCamera;
  private boolean isOn;

  /* GETTERS AND SETTERS */
  public int getScreenSize() {
    return screenSize;
  }

  public void setScreenSize(int screenSize) {
    this.screenSize = screenSize;
  }

  public String getAmountOfMemory() {
    return amountOfMemory;
  }

  public void setAmountOfMemory(String amountOfMemory) {
    this.amountOfMemory = amountOfMemory;
  }

  public boolean isHasBuiltInCamera() {
    return hasBuiltInCamera;
  }

  public void setHasBuiltInCamera(boolean hasBuiltInCamera) {
    this.hasBuiltInCamera = hasBuiltInCamera;
  }

  public Computer(int screenSize, String amountOfMemory) {
    this.screenSize = screenSize;
    this.amountOfMemory = amountOfMemory;
  }

  public boolean turnOn() {
    if (!isOn) {
      isOn = true;
    }
    return true;
  }

  public boolean turnOff() {
    if (isOn) {
      isOn = false;
    }
    return false;
  }
}
