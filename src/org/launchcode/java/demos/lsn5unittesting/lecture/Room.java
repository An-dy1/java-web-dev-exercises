package org.launchcode.java.demos.lsn5unittesting.lecture;

import java.util.ArrayList;

public class Room {

  public ArrayList<Dog> getDogsInRoom() {
    return dogsInRoom;
  }

  public void setDogsInRoom(ArrayList<Dog> dogsInRoom) {
    this.dogsInRoom = dogsInRoom;
  }

  public String getAttendant() {
    return attendant;
  }

  public void setAttendant(String attendant) {
    this.attendant = attendant;
  }

  public String getSizeOfDogs() {
    return sizeOfDogs;
  }

  public void setSizeOfDogs(String sizeOfDogs) {
    this.sizeOfDogs = sizeOfDogs;
  }

  public Integer getRoomCapacity() {
    return roomCapacity;
  }

  // FIELDS
  private ArrayList<Dog> dogsInRoom;
  private String attendant;
  private String sizeOfDogs;
  private final Integer roomCapacity;

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

  public void createRoomSummaryFile() {
    RoomSummaryFile.generateRoomSummaryFile(dogsInRoom, "/Users/andreajohnson/workspaces/learning/CoderGirl/java-practice/java-web-dev-exercises/src/org/launchcode/java/demos/lsn5unittesting/lecture/summary.txt");
  }

  public void addDogToRoom(Dog dogToAdd) {
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
