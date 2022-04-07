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

  // check for dogs in room

//  public void addDogToRoom(Dog dogToAdd) {
//    if (dogToAdd.getSize().toLowerCase() == this.sizeOfDogs.toLowerCase()) {
//      if ((dogsInRoom != null)) {
//        if (dogsInRoom.size() < this.roomCapacity) {
//          for (Dog dog : dogsInRoom) {
//            if (dogToAdd.equals(dog)) {
//              throw new IllegalArgumentException("Cannot add the same dog twice");
//            }
//          }
//        } else {
//          throw new IllegalArgumentException("Room is already at capacity");
//        }
//      }
//    } else {
//      throw new IllegalArgumentException("Dog is incorrect size");
//    }
//
//    dogsInRoom.add(dogToAdd);
//  }

  public void addDogToRoom(Dog dogToAdd) {
    // size
    // room empty or not
    // room not at capacity

    try {
      if (dogIsCorrectSize(dogToAdd) && !roomAtCapacity()) {
        if (dogsInRoom != null) {
          for (Dog dog : dogsInRoom) {
            if (dogToAdd.equals(dog)) {
              throw new IllegalArgumentException("Cannot add the same dog twice");
            }
          }
        }
      } else {
        throw new IllegalArgumentException("Cannot add dog");
      }

      dogsInRoom.add(dogToAdd);
      
    } catch (Exception e) {
      System.out.println(e);
    }


  }

  private boolean dogIsCorrectSize(Dog dogToCheck) {
    if (dogToCheck.getSize().toLowerCase() == this.sizeOfDogs.toLowerCase()) {
      return true;
    } else {
      throw new IllegalArgumentException("Dog is not correct size");
    }

  }

  private boolean roomAtCapacity() {
    return this.dogsInRoom.size() >= this.roomCapacity;
  }

  private boolean canAddDog(Dog dogToAdd) {
    if (!dogIsCorrectSize(dogToAdd)) {
      throw new IllegalArgumentException("Dog is not correct size");
    } else if (roomAtCapacity()) {
      throw new IllegalArgumentException("Room is at capacity");
    } else {
      return true;
    }
  }
}
