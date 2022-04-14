package org.launchcode.java.demos.lsn6inheritance.lectureComplete.communication;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerInteractions {

  // static methods so I can just access them without instantiating this class

  public static int askCustomerForProjectType() {

    int allowedChoices[] = {1, 2, 3};

    Scanner customerAnswer = new Scanner(System.in);
    System.out.println("What kind of project are you interested in building? Enter 1 for a regular pool, 2 for an infinity pool, or 3 for a hot tub.");

    String poolSelection = customerAnswer.nextLine();
    // would also need to do a protection for if the string could not be parsed into an integer (hasNextInt)

    int poolSelectionInt = Integer.parseInt(poolSelection);

    while (!Arrays.asList(allowedChoices).contains(poolSelectionInt)) {
      System.out.println("Not a valid choice, please enter a 1, 2, or 3");
      poolSelectionInt = customerAnswer.nextInt();
    }

    return poolSelectionInt;

  }

  public static double[] askCusomterForDimensions() {
    double poolDimensions[] = new double[3];
    Scanner customerAnswer = new Scanner(System.in);

    System.out.println("What will be the depth of your pool?");
    Double poolDepth = Double.parseDouble(customerAnswer.nextLine());

    System.out.println("What will be the length of your pool?");
    Double poolLength = Double.parseDouble(customerAnswer.nextLine());

    System.out.println("What will be the width of your pool?");
    Double poolWidth = Double.parseDouble(customerAnswer.nextLine());

    poolDimensions[0] = poolDepth;
    poolDimensions[1] = poolLength;
    poolDimensions[2] = poolWidth;

    return poolDimensions;

  }
}
