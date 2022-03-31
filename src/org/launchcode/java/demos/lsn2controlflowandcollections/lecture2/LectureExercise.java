package org.launchcode.java.demos.lsn2controlflowandcollections.lecture2;

import java.io.*;
import java.util.*;

public class LectureExercise {

  public static void main(String[] args) {

    // get the store's inventory from a file
    HashMap<String, Integer> inventoryFromFile = populateInventory();

    //iterate over HashMap story inventory entries to illustrate the populateInventory method
    for (Map.Entry<String, Integer> entry : inventoryFromFile.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }

    // create the shopping list
    // could also ask the user for these items, or retrieve them from a file, but I'm hard-coding for simplicity's sake
    ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("raspberries", "kidney beans", "oranges", "hawaiian rolls"));

    // next step: create a hashmap from this shoppingList by asking the user how many of each item they want
    HashMap<String, Integer> fullList = generateShoppingList(shoppingList);

    // instantiate a new hashmap to hold the items that are in stock and have at least the user's desired quantity
    HashMap<String, Integer> finalList = new HashMap<>();

    // then, find out if enough items are in stock; create a map of in-stock items
    for (Map.Entry<String, Integer> desiredItem : fullList.entrySet()) {
      // get the corresponding entry in the inventoryFromFile
      Integer itemQuantity = inventoryFromFile.get(desiredItem.getKey());

      // account for items that are not in the inventory; items that are not in stock; and items that have fewer available than desired
      if (itemQuantity != null && itemQuantity != 0 && itemQuantity >= desiredItem.getValue()) {
        finalList.put(desiredItem.getKey(), desiredItem.getValue());
      }
    }

    System.out.println("The final list is: " + finalList);
  }

  /**
   * @return map a hashmap of the items in a stores inventory, along with their counts
   */
  private static HashMap populateInventory() {

    HashMap<String, Integer> newMap = new HashMap<>();
    BufferedReader reader = null;

    try {
      // new file object
      File file = new File("/Users/andreajohnson/workspaces/learning/CoderGirl/java-practice/java-web-dev-exercises/src/org/launchcode/java/demos/lecture2/inventory.txt");

      // new BufferedReader to read the file
      reader = new BufferedReader(new FileReader(file));

      String line;

      // read the file by line - have to readLine within the while loop or else it will trigger an infinite loop
      while ((line = reader.readLine()) != null) {

        // split line by :
        String[] parts = line.split(":");

        // first part is item, second is inventory
        String name = parts[0].trim().toLowerCase();
        Integer number = Integer.parseInt(parts[1].trim());

        if (!name.equals("")) {
          newMap.put(name, number);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    return newMap;
  }

  /**
   * @param list an arrayList to be turned into a map that includes the item and its corresponding desired amount
   * @return a hashmap of the shopping items with their desired quantity
   */
  private static HashMap generateShoppingList(ArrayList<String> list) {
    Scanner input = new Scanner(System.in);
    String quantity = null;
    HashMap<String, Integer> finalList = new HashMap<>();

    for (String item : list) {
      System.out.println("Please enter your desired quantity for " + item);
      quantity = input.nextLine();
      finalList.put(item.toLowerCase(), Integer.parseInt(quantity));
    }

    input.close();
    return finalList;
  }

}
