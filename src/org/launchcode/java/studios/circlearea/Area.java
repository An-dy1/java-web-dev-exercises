package org.launchcode.java.studios.circlearea;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the radius of your circle?");

        double radius;
        do {
            System.out.println("Please enter a positive decimal:");
            while(!input.hasNextDouble()) {
                System.out.println("That is not a decimal, enter another choice:");
                input.next();
            }
            radius = input.nextDouble();
        } while(radius <= 0);

        System.out.println("Your radius is: " + radius);
        input.close();


    }
}



//System.out.println("Please enter a positive decimal for your radius: ");
//        while(!input.hasNextDouble()){
//        System.out.println("That isn't a decimal, enter another choice");
//        input.next();
//    }
//    radius = input.nextDouble();
//
//        while(radius <= 0) {
//        System.out.println("That is a negative number, please choose again: ");
//        radius = input.nextDouble();
//    }
//
//        System.out.println("Your radius is: " + radius);
//        input.close();
//}
