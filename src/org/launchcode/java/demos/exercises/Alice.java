package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hey, " + name);
        input.close();


    }


}
