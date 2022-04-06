package org.launchcode.java.demos.lsn4classes2.lecture;

import java.util.HashMap;

public class DoggyDayCare {

  public static void main(String[] args) {

    Dog millie = new Dog("Millie", "Bobbie");
    Dog james = new Dog("King James", "Tony");
    Dog spot = new Dog("Spot", "Jennifer");
    Dog barry = new Dog("Barry", "Andie");
    Dog wesley = new Dog("Wesley", "Andie");
    Dog echo = new Dog("Echo", "Chae");

    // will need to update method once constructor for Room is finished
    Room small = new Room("AJ", "small", 12);
    Room medium = new Room("DJ", "medium", 15);
    Room large = new Room("CJ", "large", 20);

    // set size of dogs on each instance
    /**
     * small - millie, echo
     * medium - james, spot
     * large - barry, wesley
     */
    millie.setSize("small");
    echo.setSize("small");
    james.setSize("medium");
    spot.setSize("medium");
    barry.setSize("large");
    wesley.setSize("large");

    // assign dogs to rooms based on size
    small.addDogToRoom(millie);
    small.addDogToRoom(echo);
    small.addDogToRoom(millie);

    // print room summary of each room


  }
}
