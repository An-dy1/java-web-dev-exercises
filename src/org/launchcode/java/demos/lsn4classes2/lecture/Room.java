package org.launchcode.java.demos.lsn4classes2.lecture;

import java.util.ArrayList;

public class Room {

  // FIELDS
  private ArrayList<Dog> dogsInRoom;
  private String attendant;
  private String sizeOfDogs;
  // maximum number of dogs in room - will not change

  // create constructor - attendant and maxNumberOfDogs required

  // METHODS
  // print a room summary
  public void printRoomSummary() {
    String message = String.format("%s room: \nattendant: %s\ndogs in room:\n", this.sizeOfDogs, this.attendant);
    System.out.println(message);
    for (int i = 0; i < this.dogsInRoom.size(); i++) {
      System.out.println(dogsInRoom.get(i) + "\n");
    }
  }

  // check for dogs in room

  // add and remove dogs from room
  public void addDogToRoom(Dog name) {

  }
}
