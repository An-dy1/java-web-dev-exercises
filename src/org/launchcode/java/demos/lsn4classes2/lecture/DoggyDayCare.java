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

    Room small = new Room();
    Room medium = new Room();
    Room large = new Room();

    // set size of dogs on each instance
    /**
     * small - millie, echo
     * medium - james, spot
     * large - barry, wesley
     */
    millie.setSize("largeish");

    // assign dogs to rooms based on size

    // print room summary of each room


  }
}
