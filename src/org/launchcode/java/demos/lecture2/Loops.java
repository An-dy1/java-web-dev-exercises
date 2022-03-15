package org.launchcode.java.demos.lecture2;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("We like big words and we cannot lie. Please enter a big word:");
        String word = input.nextLine();

        // continue to prompt the user for a new word if it's shorter than 12 characters
        // is a while loop or do-while loop more appropriate?


        System.out.println("Nice, I love the word " + word);

        // then, print each letter in the word on a new line
        // after that, break vs continue if the letter is 'a'

        input.close();
    }
}
