package org.launchcode.java.demos.lsn2controlflowandcollections.lecture2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {

  public static void main(String[] args) {

    // we are going to store a list of people and their pets as a hashmap
    // prompt a user to enter this information as long as they aren't entering a blank string for a person's name
    HashMap<String, Integer> peoplePets = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String newPerson;
    Integer numberPets;

    System.out.println("Please enter a person's name and the number of pets they have.");

    // first choice: while loop, or do while?

    input.close();
  }


}
