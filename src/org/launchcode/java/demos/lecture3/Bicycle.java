package org.launchcode.java.demos.lecture3;

public class Bicycle {

  // 1
  public String getBikeName() {
    return bikeName;
  }

  // 2
  public Bicycle(String name, String type) {
    this.bikeName = name;
    this.bikeType = type;
  }

  // 3
  public String bikeName;
  public String bikeType;

  // 4
//  public String printBikeInfo() {
//    System.out.println("This is a " + this.bikeType + " named ");
//  }
  

}
