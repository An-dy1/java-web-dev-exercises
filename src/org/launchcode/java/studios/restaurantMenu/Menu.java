package org.launchcode.java.studios.restaurantMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {

  // 1 - using the Date class
  private Date lastUpdated;
  private ArrayList<MenuItem> items;

  // 2 - constructor
  public Menu(Date d, ArrayList<MenuItem> i) {
    this.lastUpdated = d;
    this.items = i;
  }

  // 3 - getters and setters are near each other
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public void setItems(ArrayList<MenuItem> items) {
    this.items = items;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public ArrayList<MenuItem> getItems() {
    return items;
  }

  // *1 - Two ways to add and remove menu items - with bonus solution

//  public void addMenuItem(MenuItem newItem) {
//    boolean alreadyExists = false;
//
//    for (int i = 0; i < items.size(); i++) {
//      if (newItem.newEquals(items.get(i))) {
//        System.out.println("the item '" + newItem.getDescription() + "' already exists");
//        alreadyExists = true;
//      }
//    }
//
//    if (!alreadyExists) {
//      this.items.add(newItem);
//    }
//
//  }

  // *1 add menu item
  public void addMenuItem(MenuItem newItem) {
    for (MenuItem item : items) {
      if (newItem.newEquals(item)) {
        System.out.println("the item '" + newItem.getDescription() + "' already exists");
        return;
      }
    }
    this.items.add(newItem);

  }

  // *1 remove menu item
  // * solution has this returning the new current list of items - that could be useful as well
  // * why public and not private?

  public ArrayList<MenuItem> removeMenuItem(MenuItem itemToRemove) {
    int indexOfItemToRemove = -1;

    // why use the more verbose for loop syntax here?
    for (int i = 0; i < this.items.size(); i++) {
      if (items.get(i).equals(itemToRemove)) {
        indexOfItemToRemove = i;
        break;
      }
    }

    this.items.remove(indexOfItemToRemove);
    return this.items;
  }

  // *3 A way to tell when the menu was last updated
  public String returnLastUpdate() {
    return "The menu was last updated on " + this.lastUpdated;
  }

  // *4
  public void printMenuItem(MenuItem itemToPrint) {
    System.out.println(itemToPrint.getDescription());
  }

  // *5
  public void printAllMenuItems() {
    for (MenuItem item : items) {
      System.out.println(item.getDescription());
    }
  }

}
