package org.launchcode.java.demos.lsn2controlflowandcollections.lecture2;

import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // let's assume we don't have to do validation bc our user will follow the directions carefully:
    System.out.println("What is your preferred thermostat temperature? Enter 1 for 50-60 degress; enter 2 for 60-70:");
    int thermo = input.nextInt();
    String message = null;

    // temp between 50-60: positively polar
    // temp between 60-70: cool as a cucumber
    // temp between 70-80: tropical times
    // temp between 80-90: hot and humid

    // 1, code the above with if-else statement
//    if (thermo <= 60) {
//      System.out.println("positively polar");
//    } else if (thermo <= 70) {
//      System.out.println("cool as a cucumber");
//    } else if (thermo <= 80) {
//      System.out.println("tropical times");
//    } else {
//      System.out.println("hot and humid");
//    }

    // 2, code the above with a switch
    switch (thermo) {
      case 1:
        message = "positively polar";
        break;
      case 2:
        message = "cool as a cucumber";
        break;
      case 3:
        message = "tropical times";
        break;
    }

    System.out.println(message);

    input.close();
  }
}
