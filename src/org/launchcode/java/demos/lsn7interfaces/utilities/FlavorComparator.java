package org.launchcode.java.demos.lsn7interfaces.utilities;

import org.launchcode.java.demos.lsn7interfaces.Cone;
import org.launchcode.java.demos.lsn7interfaces.Flavor;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

//  @Override
//  public int compare(Flavor o1, Flavor o2) {
//    // This returns an integer (negative, positive, or zero) depending on whether Flavor object o1 or o2 comes first, alphabetically.
//    return o1.getName().compareTo(o2.getName());
//  }

  @Override
  public int compare(Flavor o1, Flavor o2) {
    // This returns an integer (negative, positive, or zero) depending on whether Flavor object o1 or o2 comes first, alphabetically.
    return o2.getAllergens().size() - o1.getAllergens().size();
  }

}

