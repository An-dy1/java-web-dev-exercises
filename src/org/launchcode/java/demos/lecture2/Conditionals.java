package org.launchcode.java.demos.lecture2;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // let's assume we don't have to do validation bc our user will follow the directions carefully:
        System.out.println("What is your preferred thermostat temperature? Enter a whole number between 50 and 100:");
        Integer thermo = input.nextInt();
    }
}
