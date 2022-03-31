package org.launchcode.java.studios.restaurantMenu;

import java.util.ArrayList;
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

  // *1 - A way to add and remove menu items - with bonus solution
  // better or different way?
  public void addMenuItem(MenuItem newItem) {
    boolean alreadyExists = false;

    for (int i = 0; i < items.size(); i++) {
      if (newItem.newEquals(items.get(i))) {
        System.out.println("the item '" + newItem.getDescription() + "' already exists");
        alreadyExists = true;
      }
    }

    if (!alreadyExists) {
      this.items.add(newItem);
    }

  }

  // * solution has this returning the new current list of items - that could be useful as well
  // * why public and not private?
  public void removeMenuItem(MenuItem itemToRemove) {
    int indexOfItemToRemove = -1;
    for (int i = 0; i < this.items.size(); i++) {
      if (items.get(i).equals(itemToRemove)) {
        indexOfItemToRemove = i;
      }
    }
    this.items.remove(indexOfItemToRemove);
    // return this.items;
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
    for (int i = 0; i < this.items.size(); i++) {
      System.out.println(items.get(i).getDescription());
    }
  }

}
