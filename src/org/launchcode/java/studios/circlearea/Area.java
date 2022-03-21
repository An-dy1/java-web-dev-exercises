package org.launchcode.java.studios.circlearea;

import java.util.Scanner;

public class Area {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What's the radius of your circle?");
    double radius;
    radius = input.nextDouble();

    // 1 - add validation for if a user enters a negative number

    // 2 extend validation with a while loop

    // 3 extend validation with a do-while loop

    double area = Circle.getArea(radius);
    System.out.println("Your circle's area is: " + area);
    input.close();

  }
}
