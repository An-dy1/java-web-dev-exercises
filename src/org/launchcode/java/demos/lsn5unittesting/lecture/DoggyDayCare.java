package org.launchcode.java.demos.lsn5unittesting.lecture;

public class DoggyDayCare {

  public static void main(String[] args) {

    Dog millie = new Dog("Millie", "Bobbie");
    Dog james = new Dog("King James", "Tony");
    Dog spot = new Dog("Spot", "Jennifer");
    Dog barry = new Dog("Barry", "Andie");
    Dog wesley = new Dog("Wesley", "Andie");
    Dog echo = new Dog("Echo", "Chae");

    // will need to update method once constructor for Room is finished
    Room small = new Room("AJ", "small", 3);
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
    james.setSize("small");
    spot.setSize("small");
    barry.setSize("large");
    wesley.setSize("large");

    // assign dogs to rooms based on size
    small.addDogToRoom(millie);
    small.addDogToRoom(millie);
    small.addDogToRoom(millie);
    small.addDogToRoom(echo);
    small.addDogToRoom(james);

    small.addDogToRoom(spot);

//    small.addDogToRoom(millie);

    small.printRoomSummary();

    small.createRoomSummaryFile();

    // print room summary of each room


  }
}
