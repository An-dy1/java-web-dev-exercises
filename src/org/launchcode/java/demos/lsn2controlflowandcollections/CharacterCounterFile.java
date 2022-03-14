package org.launchcode.java.demos.lsn2controlflowandcollections;

// 1 - import classes to help us handle a file
import java.io.File; // import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounterFile {

    public static void main(String[] args) {
        // 2 - try catch getting and reading a file; Scanner will throw an error if the fileNotFound excpetion isn't handled
        String myString = null;
        HashMap<Character, Integer> characterCounts = new HashMap<>();


        try {
            File myStringFile = new File("/Users/andreajohnson/workspaces/learning/CoderGirl/java-practice/java-web-dev-exercises/src/org/launchcode/java/demos/lsn2controlflowandcollections/string.txt");

            // 3 previously we passed Scanner our console input; now we're passing it a file
            Scanner stringReader = new Scanner(myStringFile);
            
            // 4 read the text file by line and as long as there are new lines, add its value to myString
            while(stringReader.hasNextLine()) {
                myString = stringReader.nextLine();
            }

        } catch(FileNotFoundException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }

        // 5 - do the same thing
        char[] charactersInString = myString.toLowerCase().toCharArray();
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
    }
}
