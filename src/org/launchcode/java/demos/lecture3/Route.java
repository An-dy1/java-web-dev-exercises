package org.launchcode.java.demos.lecture3;

import java.util.Date;
import java.util.HashMap;

public class Route {

    // 1
    private Date rideDate;
    private Double rideLength;
    private HashMap<Date, Double> rideList = new HashMap<>();

    public Route(Date date, Double length) {
        this.rideDate = date;
        this.rideLength = length;
    }

    public Double askForRideLength() {
        // 2
        Bicycle newBike = new Bicycle("Shadow", "road bike");
        System.out.println("Hey there, " + newBike.getBikeName() + " how many miles did you ride your bike today?");
        return(1.3);
    }

    // 3
    public void shareRideWithFriends() {
        // code to post complete ride details to social media
    }
}
