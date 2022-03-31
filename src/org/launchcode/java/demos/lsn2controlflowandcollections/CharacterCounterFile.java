package org.launchcode.java.demos.lsn2controlflowandcollections;

// 1 - import classes to help us handle a file

import java.io.File; // import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounterFile {

  public static void main(String[] args) {
    // 2 declare variables to hold the String we want to count characters in, and the HashMap that will hold the characters and their counts
    String stringToCount = null;
    HashMap<Character, Integer> characterCounts = new HashMap<>();

    try {
      File myStringFile = new File("/Users/andreajohnson/workspaces/learning/CoderGirl/java-practice/java-web-dev-exercises/src/org/launchcode/java/demos/lsn2controlflowandcollections/string.txt");

      // 3 super bonus: previously we passed Scanner our console input; now we're passing it a file
      // 3.5 what happens if we omit the catch block?
      Scanner stringReader = new Scanner(myStringFile);

      // 4 read the text file by line and as long as there are new lines, add its value to myString
      while (stringReader.hasNextLine()) {
        stringToCount += stringReader.nextLine();
      }

      stringReader.close();

    } catch (FileNotFoundException exception) {
      System.out.println("An error occurred.");
      exception.printStackTrace();
    }

    // 5 - bonus 1: make the character counts case-insensitive by making all characters lowercase; then turn the string into a character array
    char[] charactersInString = stringToCount.toLowerCase().toCharArray();
    for (char character : charactersInString) {
      // bonus 3: exclude non-alphabet characters using the isLetter method on the Character class
      // could also use RegEx here to compare each character to a list of valid characterss
      boolean isLetter = Character.isLetter(character);
      if (isLetter) {
        // if the character is already in the characterCounts hashMap, create a new key for it, and increment its value by one
        if (characterCounts.containsKey(character)) {
          characterCounts.put(character, characterCounts.get(character) + 1);
        }
        // otherwise, just put the character as a key in the hashMap and set its value to 1
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
