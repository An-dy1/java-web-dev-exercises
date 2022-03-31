package org.launchcode.java.demos.lsn3classes1.lecture3;

import java.util.Date;
import java.util.HashMap;

public class Route {

  public Date getRideDate() {
    return rideDate;
  }

  public void setRideDate(Date rideDate) {
    this.rideDate = rideDate;
  }

  // 1
  private Date rideDate;

  public Double getRideLength() {
    return rideLength;
  }

  public void setRideLength(Double rideLength) {
    this.rideLength = rideLength;
  }

  private Double rideLength;

  public HashMap<Date, Double> getRideList() {
    return rideList;
  }

  public void setRideList(HashMap<Date, Double> rideList) {
    this.rideList = rideList;
  }

  private HashMap<Date, Double> rideList = new HashMap<>();

  public Route(Date date, Double length) {
    this.rideDate = date;
    this.rideLength = length;
  }

  public Double askForRideLength() {
    // 2 - instantiating the Bicycle class with a name of shadow
    Bicycle newBike = new Bicycle("Shadow", "road bike");
    System.out.println("Hey there, " + newBike.getBikeName() + " how many miles did you ride your bike today?");
    return (1.3);
  }

  // 3 - violates the single responsibility principle
  public void shareRideWithFriends() {
    // code to post complete ride details to social media
  }
}
