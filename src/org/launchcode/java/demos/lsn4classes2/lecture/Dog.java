package org.launchcode.java.demos.lsn4classes2.lecture;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Dog {

  // GETTERS AND SETTERS
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public Date getTimeOfFeeding() {
    return timeOfFeeding;
  }

  public void setTimeOfFeeding(Date timeOfFeeding) {
    this.timeOfFeeding = timeOfFeeding;
  }

  public String getSize() {
    return size;
  }

  // update this method to only set size if it is allowed
  // let the user know if their dog's size is invalid
  public void setSize(String size) {
    // create an array to hold our allowed sizes
    String[] allowedSizes = new String[3];
    allowedSizes[0] = "small";
    allowedSizes[1] = "medium";
    allowedSizes[2] = "large";

    String casedSize = size.toLowerCase();
    if (Arrays.asList(allowedSizes).contains(casedSize)) {
      this.size = casedSize;
    } else {
      System.out.println("Invalid size was entered" + casedSize);
    }

    this.size = size;
  }

  // FIELDS
  private String name;
  private String breed;
  private Integer age;
  private String ownerName;
  private Date timeOfFeeding;
  private String size;
  private static Integer nextIdNumber = 1;
  private Integer idNumber;
  // *1 add id field

  // CONSTRUCTOR
  public Dog(String name, String ownerName) {
    this.name = name;
    this.ownerName = ownerName;
    this.idNumber = nextIdNumber;
    nextIdNumber++;
    // *2 assign next idNumber to dog's id field
  }

  // METHODS
  // update last fed time
  // working with Date class
  public Date updateFeedTime() {
    Date today = Calendar.getInstance().getTime();
    this.timeOfFeeding = today;
    return today;
  }

  // update owner
  public String updateDogOwner() {
    return "placeholder";
  }

  // check for dog equality - two dogs are equal if they have the same name and owner
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dog dog = (Dog) o;
    return name.equals(dog.name) && ownerName.equals(dog.ownerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ownerName);
  }
}
