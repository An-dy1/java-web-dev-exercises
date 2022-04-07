package org.launchcode.java.studios.restaurantMenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

  public static void main(String[] args) {

    MenuItem menuItem1 = new MenuItem(15.55, "Chicken in a creamy lemon sauce with capers", "chicken", false);
    MenuItem menuItem2 = new MenuItem(14.00, "Portabello tacos with goat cheese", "vegetarian", true);
    MenuItem menuItem3 = new MenuItem(16.75, "Snow crab cakes", "seafood", false);
    MenuItem menuItem4 = new MenuItem(13.00, "Caesar salad with homemade dressing", "salads", true);
    MenuItem menuItem5 = new MenuItem(13.00, "Caesar salad with homemade dressing", "salads", true);

    Date today = Calendar.getInstance().getTime();
    ArrayList<MenuItem> menuItemsToAdd = new ArrayList<>();

    // one way to get items in the April menu
//    menuItemsToAdd.add(menuItem1);
//    menuItemsToAdd.add(menuItem2);
//    menuItemsToAdd.add(menuItem3);
//    menuItemsToAdd.add(menuItem4);
//
    Menu aprilMenu = new Menu(today, menuItemsToAdd);

    // second way to get items in the April menu
    // * this chunk of code suggests an improvement to the Menu class - what?

    // studio - add menu items with bonus solution
    aprilMenu.addMenuItem(menuItem1);
    aprilMenu.addMenuItem(menuItem2);
    aprilMenu.addMenuItem(menuItem3);
    aprilMenu.addMenuItem(menuItem4);
    aprilMenu.addMenuItem(menuItem5);

    // studio - remove menu items
    aprilMenu.removeMenuItem(menuItem4);

    // studio - check if a menu item is new
    System.out.println(menuItem1.checkIfNew());

    // tell when the menu was last updated
    System.out.println("Menu was last updated on: " + aprilMenu.getLastUpdated());

    // print all menu items
    System.out.println("Here are all of the menu items: \n");
    aprilMenu.printAllMenuItems();

    // print a single menu item
    System.out.println("Might I suggest the: \n");
    aprilMenu.printMenuItem(menuItem2);

//    aprilMenu.removeMenuItem(menuItem4);
  }
}
