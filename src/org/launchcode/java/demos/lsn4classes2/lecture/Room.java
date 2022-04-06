package org.launchcode.java.demos.lsn4classes2.lecture;

import java.util.ArrayList;

public class Room {

  // FIELDS
  private ArrayList<Dog> dogsInRoom;
  private String attendant;
  private String sizeOfDogs;
  private final Integer roomCapacity;
  // maximum number of dogs in room - will not change

  // create constructor - attendant and maxNumberOfDogs required
  public Room(String aAttendant, String sizeOfDogs, Integer roomCapacity) {
    this.attendant = aAttendant;
    this.sizeOfDogs = sizeOfDogs;
    this.roomCapacity = roomCapacity;
    this.dogsInRoom = new ArrayList<>();
  }

  // METHODS
  // print a room summary
  public void printRoomSummary() {
    String message = String.format("%s dog room: \nattendant: %s\ndogs in room:\n", this.sizeOfDogs, this.attendant);
    System.out.println(message);
    for (int i = 0; i < this.dogsInRoom.size(); i++) {
      System.out.println(dogsInRoom.get(i) + "\n");
    }
  }

  // check for dogs in room

  // add and remove dogs from room
  public void addDogToRoom(Dog dogToAdd) {
    // 1 - check if a dog is already added to room
    if ((dogsInRoom != null)) {
      for (Dog dog : dogsInRoom) {
        if (dogToAdd.equals(dog)) {
          System.out.println("Dog already in room");
          return;
        }
      }
    }

    dogsInRoom.add(dogToAdd);

  }
}
