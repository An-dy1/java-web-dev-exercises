package org.launchcode.java.studios.circlearea;

import java.util.Scanner;

public class Area {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What's the radius of your circle?");
    double radius;

    System.out.println("next double true or false?" + input.hasNextDouble());
    radius = input.nextDouble();

    System.out.println("next double true or false?" + input.hasNextDouble());
//    do {
//      System.out.println("Please enter a positive decimal number:");
//      while (!input.hasNextDouble()) {
//        System.out.println("That's a negative number, please enter another");
//      }
//      radius = input.nextDouble();
//    } while (radius <= 0);

//    do {
//      radius = input.nextDouble();
//      while (radius <= 0) {
//        System.out.println("That's a negative number, please enter another");
//        radius = input.nextDouble();
//      }
//    } while (!input.hasNextDouble());
//
//    radius = input.nextDouble();


//    while (!input.hasNextDouble()) {
//      System.out.println("That isn't a decimal, please enter another choice");
//      input.next();
//    }
//
//    radius = input.nextDouble();
//
//    while (radius <= 0) {
//      System.out.println("That is a negative number or 0, please enter another.");
//      input.next();
//    }
//
//    radius = input.nextDouble();

    // 1 - add validation for if a user enters a negative number
//    if (radius < 0) {
//      System.out.println("The chosen radius is invalid");
//    } else {
//      Double area = Circle.getArea(radius);
//      System.out.println("The area of your circle is " + area);
//    }

    // 2 extend validation with a while loop

    // 3 extend validation with a do-while loop

    double area = Circle.getArea(radius);
    System.out.println("Your circle's area is: " + area);
    input.close();

  }
}
