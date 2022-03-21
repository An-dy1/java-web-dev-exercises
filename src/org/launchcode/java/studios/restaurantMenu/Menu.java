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
}
