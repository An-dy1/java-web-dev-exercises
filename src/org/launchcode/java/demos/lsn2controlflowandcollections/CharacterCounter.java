package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharacterCounter {

    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
//        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        char[] charactersInString = testString.toCharArray();

        // bonus 1: prompt the user to enter the string
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string.");
        // bonus 2: make the character counts case-insensitive
        String testString = input.nextLine().toLowerCase();
        char[] charactersInString = testString.toCharArray();

        for (char character : charactersInString) {
            // bonus 3: exclude non-alphabet characters
            boolean isLetter = Character.isLetter(character);
            if(isLetter) {
                if (characterCounts.containsKey(character)) {
                    characterCounts.put(character, characterCounts.get(character) + 1);
                }
                else {
                    characterCounts.put(character, 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

        input.close();
    }

}
