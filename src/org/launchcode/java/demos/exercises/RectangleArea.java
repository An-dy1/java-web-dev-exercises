package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle (whole numbers only): ");
        Integer length = input.nextInt();
        System.out.println("What is the width of your rectangle (whole numbers only): ");
        Integer width = input.nextInt();
        input.close();

        Integer area = calculateArea(length, width);
        System.out.println("The area of your rectangle is: " + area + "sq ft");


    }

    public static Integer calculateArea(Integer length, Integer width) {
        return length * width;
    }
}
