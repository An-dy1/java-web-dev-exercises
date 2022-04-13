package org.launchcode.java.demos.lsn5unittesting.lecture;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class RoomTest {


  Room small_room;

  Dog fancy;
  Dog randy;
  Dog mildred;
  Dog olive;
  Dog violet;
  Dog fancy_med;

  @Before
  public void createRoomAndDogs() {
    // room to test with
    small_room = new Room("Connie", "small", 4);

    // instantiate Dog objects
    fancy = new Dog("Fancy", "Richard", "small");
    fancy_med = new Dog("Fancy", "Richard", "medium");
    randy = new Dog("Randy", "Joe", "small");
    mildred = new Dog("Mildred", "Jane", "small");
    olive = new Dog("Olive", "Reese", "small");
    violet = new Dog("Violet", "John", "small");
  }

  // should be able to add a dog to an empty room
  @Test
  public void canAddDogToEmptyRoom() {
    small_room.addDogToRoom(fancy);
    // (expected, actual)
    assertEquals(1, small_room.getDogsInRoom().size());
  }

  // should be able to  add a new dog to a room that already has at least one dog
  @Test
  public void canAddDogToNonEmptyRoom() {
    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(randy);
    assertEquals(2, small_room.getDogsInRoom().size());
  }

  // should not be able to add the same dog twice
  @Test(expected = IllegalArgumentException.class)
  public void cannotAddSameDogTwice() {
    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(fancy);

    fail("Cannot add the same dog to the room twice");

  }

  // cannot add a dog if it brings the total over the room capacity
  @Test(expected = IllegalArgumentException.class)
  public void cannotAddDogOverRoomCapacity() {

    small_room.addDogToRoom(fancy);
    small_room.addDogToRoom(randy);
    small_room.addDogToRoom(mildred);
    small_room.addDogToRoom(olive);
    small_room.addDogToRoom(violet);

    fail("Cannot add dogs over room capacity");

  }

  // should only be able to add a dog to a room if they are the correct size
  @Test(expected = IllegalArgumentException.class)
  public void cannotAddIncorrectlySizedDogToRoom() {
    small_room.addDogToRoom(fancy_med);
    fail("Dog is incorrect size for room");
  }


}
