package org.launchcode.java.demos.lsn5unittesting.lecture;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class RoomTest {

  // should be able to add a dog to an empty room - return true
  // should be able to add a new dog to a room with other dogs
  // should not be able to add the same dog twice
  // cannot add a dog over room capacity
  // should only be able to add a dog to a room if they are the correct size
  // others?

  Room small_room;

  Dog fancy;
  Dog randy;
  Dog mildred;
  Dog olive;
  Dog violet;
  Dog fancy_med;

  @Before
  public void createRoomAndDogs() {
    // create room object to test with
    small_room = new Room("Connie", "small", 4);

    // create dog objects
    fancy = new Dog("Fancy", "Richard", "small");
    fancy_med = new Dog("Fancy", "Richard", "medium");
    randy = new Dog("Randy", "Joe", "small");
    mildred = new Dog("Mildred", "Jane", "small");
    olive = new Dog("Olive", "Reese", "small");
    violet = new Dog("Violet", "John", "small");

  }

  @Test
  public void canAddDogToEmptyRoom() {
    small_room.addDogToRoom(fancy);
    small_room.printRoomSummary();

    assertEquals(1, small_room.getDogsInRoom().size());
  }

  @Test
  public void canAddNewDogToRoomWithDogs() {
    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(randy);
    assertEquals(2, small_room.getDogsInRoom().size());
    assertEquals("Randy", small_room.getDogsInRoom().get(1).getName());
  }

  @Test(expected = IllegalArgumentException.class)
  public void cannotAddSameDogTwice() {
    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(fancy);
    fail("Should not be able to add the same dog again");
  }

  @Test(expected = IllegalArgumentException.class)
  public void cannotAddDogOverRoomCapacity() {

    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(randy);
    small_room.addDogToRoom(mildred);
    small_room.addDogToRoom(olive);
    small_room.addDogToRoom(violet);


    fail("Cannot add more dogs than allowed by room capacity");
  }

  @Test()
  public void canAddDogsUpToRoomCapacity() {
    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(randy);
    small_room.addDogToRoom(mildred);
    small_room.addDogToRoom(olive);

    assertEquals(4, small_room.getDogsInRoom().size());
  }

  @Test(expected = IllegalArgumentException.class)
  public void cannotAddDogOfIncorrectSizeToRoom() {
    small_room.addDogToRoom(fancy_med);
    fail("Cannot add this size of dog to this room");
  }

}
