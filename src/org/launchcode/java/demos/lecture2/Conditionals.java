package org.launchcode.java.demos.lecture2;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // let's assume we don't have to do validation bc our user will follow the directions carefully:
        System.out.println("What is your preferred thermostat temperature? Enter a whole number between 50 and 90:");
        int thermo = input.nextInt();

        // temp between 50-60: positively polar
        // temp between 60-70: cool as a cucumber
        // temp between 70-80: tropical times
        // temp between 80-90: hot and humid

        input.close();
    }
}
