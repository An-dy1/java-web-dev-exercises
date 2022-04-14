package org.launchcode.java.demos.lsn6inheritance.technology.src;

public class SmartPhone extends Computer {

  /* FIELDS */
  private String cellPhoneProvider;
  private String hapticsAreOn;

  /* GETTERS AND SETTERS */
  public String getCellPhoneProvider() {
    return cellPhoneProvider;
  }

  public void setCellPhoneProvider(String cellPhoneProvider) {
    this.cellPhoneProvider = cellPhoneProvider;
  }

  public String getHapticsAreOn() {
    return hapticsAreOn;
  }

  public void setHapticsAreOn(String hapticsAreOn) {
    this.hapticsAreOn = hapticsAreOn;
  }

  /* CONSTRUCTOR */
  public SmartPhone(int screenSize, String amountOfMemory, String cellPhoneProvider) {
    super(screenSize, amountOfMemory);
    this.cellPhoneProvider = cellPhoneProvider;
  }

  /* METHODS */

  public void makeACall() {
    System.out.println("Now calling");
  }
}
