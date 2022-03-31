package org.launchcode.java.demos.lsn3classes1.lecture3;

public class Bicycle {

  // 1 getter - method
  public String getBikeName() {
    return bikeName;
  }

  public void setBikeName(String bikeName) {
    this.bikeName = bikeName;
  }

  // 3 - fields
  public String bikeName;

  public String getBikeType() {
    return bikeType;
  }

  public String bikeType;


  // 2 - constructor
  public Bicycle(String name, String type) {
    this.bikeName = name;
    this.bikeType = type;
  }

  public Bicycle(String name) {
    this(name, null);
  }


  // 4 - method - access modifier
  public void printBikeInfo() {
    System.out.println("This is a " + this.bikeType + " named ");
  }


}
