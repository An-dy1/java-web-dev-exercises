package org.launchcode.java.studios.circlearea;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the radius of your circle? \n");
        Double radius = input.nextDouble();
        if(radius < 0 ) {
            System.out.println("");
        }

        Double area = Circle.getArea(radius);

        System.out.println("The area of your circle with radius " + radius + " is: " + area);
        input.close();
    }
}
