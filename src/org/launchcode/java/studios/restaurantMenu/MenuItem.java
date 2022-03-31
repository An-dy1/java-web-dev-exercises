package org.launchcode.java.studios.restaurantMenu;

import java.util.Objects;

public class MenuItem {
  private double price;

  public String getDescription() {
    return description;
  }

  private String description;
  private String category;
  private boolean isNew;

  // 1 - could overload this constructor
  // 2 - don't like these parameter namings
  public MenuItem(double p, String d, String c, boolean iN) {
    this.price = p;
    this.description = d;
    this.category = c;
    this.isNew = iN;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  // 3 - using the 'argument' naming here but not elsewhere
  public void setNew(boolean aNew) {
    isNew = aNew;
  }

  // *5 a way to determine whether two menu items are equal
  public boolean newEquals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuItem menuItem = (MenuItem) o;
    return description.equals(menuItem.description);
  }

  // *2 a way to tell if a menu item is new
  // * why make this a String return type rather than boolean?
  public String checkIfNew() {
    if (this.isNew) {
      return "This is a new menu item";
    } else {
      return "This is not a new menu item";
    }
  }
}

