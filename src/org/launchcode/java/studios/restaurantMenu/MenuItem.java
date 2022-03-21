package org.launchcode.java.studios.restaurantMenu;

public class MenuItem {
  private double price;
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
}

