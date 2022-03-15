package org.launchcode.java.demos.lecture2;

import java.io.*;
import java.util.*;

public class LectureExercise {

    public static void main(String[] args) {

        HashMap<String, Integer> inventoryFromFile = populateInventory();

        //iterate over HashMap entries to illustrate the populateInventory method
        for(Map.Entry<String, Integer> entry : inventoryFromFile.entrySet()){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("raspberries", "kidney beans", "oranges", "hawaiian rolls"));

        // next step: create a hashmap from this shoppingList by asking the user how many of each item they want
        HashMap<String, Integer> fullList = generateShoppingList(shoppingList);
        System.out.println(fullList);

        HashMap<String, Integer> finalList = new HashMap<>();
        // then, find out if enough items are in stock; create a list of in-stock items
        for(Map.Entry<String, Integer> desiredItem : fullList.entrySet()) {
            // get the corresponding entry in the inventoryFromFile
            Integer itemQuantity = inventoryFromFile.get(desiredItem.getKey());

            if(itemQuantity != 0 && itemQuantity >= desiredItem.getValue()) {
                finalList.put(desiredItem.getKey(), desiredItem.getValue());
            }
        }

        System.out.println("The final list is: " + finalList);
    }

    /**
     *
     * @return map a hashmap of the items in a stores inventory, along with their countsd
     */
    private static HashMap populateInventory() {

        HashMap<String, Integer> newMap = new HashMap<>();
        BufferedReader reader = null;

        try {
            // new file object
            File file = new File("/Users/andreajohnson/workspaces/learning/CoderGirl/java-practice/java-web-dev-exercises/src/org/launchcode/java/demos/lecture2/inventory.txt");

            // new BufferedReader from the file
            reader = new BufferedReader(new FileReader(file));

            String line;

            // read the file by line
            while((line = reader.readLine()) != null) {

                // split line by :
                String[] parts = line.split(":");

                // first part is item, second is inventory
                String name = parts[0].trim().toLowerCase();
                Integer number = Integer.parseInt(parts[1].trim());

                if(!name.equals("") && !number.equals("")) {
                    newMap.put(name, number);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return newMap;
    }

    private static HashMap generateShoppingList(ArrayList<String> list) {
        Scanner input = new Scanner(System.in);
        String quantity = null;
        HashMap<String, Integer> finalList = new HashMap<>();

        for(String item : list) {
            System.out.println("Please enter your desired quantity for " + item);
            quantity = input.nextLine();
            finalList.put(item.toLowerCase(), Integer.parseInt(quantity));
        }

        input.close();
        return finalList;
    }
}
