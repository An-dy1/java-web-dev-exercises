package org.launchcode.java.demos.lsn7interfaces.utilities;

import org.launchcode.java.demos.lsn7interfaces.Cone;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

  @Override
  public int compare(Cone o1, Cone o2) {
//     note, the error I got was slightly different from that in the text book
    if(o1.getCost() - o2.getCost() > 0) {
      return 1;
    } else if(o1.getCost() - o2.getCost() < 0) {
      return -1;
    } else {
      return 0;
    }
  }
}
