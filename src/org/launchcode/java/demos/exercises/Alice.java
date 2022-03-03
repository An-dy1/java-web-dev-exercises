package org.launchcode.java.demos.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hey, " + name);

        System.out.println("Out of curiousity, how far have you driven on your latest tank of gas? ");
        double miles = input.nextDouble();

        System.out.println("And how much gas have you used? ");
        double gas = input.nextDouble();

        double gasMileage = myGasMileage(miles, gas);
        System.out.println("Did you know your gas mileage is " + gasMileage + " per gallon?");

        System.out.println("Ok, last question. What word would you like to search for in the first paragraph of Alice in Wonderland? ");
        String word = input.nextLine();

        boolean wordInPara = searchForTerm(word);
        if(wordInPara) {
            System.out.println("Your word was found!");
        } else {
            System.out.println("Your word was not found");
        }

        input.close();
    }

    private static double myGasMileage(double distance, double gas) {
        return distance / gas;
    }

    private static boolean searchForTerm(String term) {
        String casedTerm = term.toLowerCase();
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String casedParagraph = paragraph.toLowerCase();
        if(casedParagraph.indexOf(casedTerm) > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static String removeFromPara(String term) {
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String newPara = paragraph.replace(term, "");

        return newPara;

    }

}

// solutions

//public class Alice {
//    public static void main(String[] args) {
//        String rawString = "Alice was beginning to get very tired of sitting " +
//                "by her sister on the bank, and of having nothing to do: once or twice she had " +
//                "peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
//                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
//        String firstSentence = rawString.toLowerCase();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a String to search for:");
//        String searchTerm = input.nextLine().toLowerCase();
//
//        // first task
//        Boolean result = firstSentence.contains(searchTerm);
//        System.out.println("The first sentence contains your search term: " + result);
//
//        // next task
//        Integer index = firstSentence.indexOf(searchTerm);
//        Integer length = searchTerm.length();
//        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
//        String modifiedSentence = firstSentence.replace(searchTerm, "");
//        System.out.println(modifiedSentence);
//    }
//}
