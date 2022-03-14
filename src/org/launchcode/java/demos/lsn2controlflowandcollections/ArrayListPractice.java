package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        // instantiate the array list with values
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // alternatively:
//        ArrayList<Integer> otherNumbers = new ArrayList<>();
//        otherNumbers.add(1);
//        otherNumbers.add(2);
//        otherNumbers.add(3);
//        otherNumbers.add(4);
//        otherNumbers.add(5);
//        otherNumbers.add(6);
//        otherNumbers.add(7);

        ArrayList<String> myString = new ArrayList<>(Arrays.asList("once", "upon", "a", "time", "there", "lived", "a", "princess"));

        System.out.println(sumOdds(numbers));
        printWords(myString);


    }

    // note that this method is declared outside the main method
    // note the return type
    private static Integer sumOdds(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for(int number : numbers) {
            if(number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    // return type
    private static void printWords(ArrayList<String> string) {
        for(String word : string) {
            if(word.length() == 5) {
                System.out.println(word);
            }
        }
    }

}
