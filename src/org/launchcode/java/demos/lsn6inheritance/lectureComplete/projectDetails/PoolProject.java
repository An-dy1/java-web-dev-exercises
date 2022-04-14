package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;
import java.util.Map;

public class PoolProject extends InstallationProject {

  private static final Map<String, Integer> availableModelsPool = Map.of(
      "Pool Factory", 2546,
      "Royal Swimming Pool", 1999,
      "Walmart", 410
  );
  private boolean isBelowGround = false;

  public PoolProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  // overloaded constructor
  public PoolProject(double depth, double length, double width, Date desiredStartDate, boolean isBelowGround) {
    super(depth, length, width, desiredStartDate);
    this.isBelowGround = isBelowGround;
  }

  // would have inherited from abstract installation project class
  @Override
  public double generateQuote() {
    // if actually implementing, we could do a calculation based on dimensions and whether the start date were soon or not
    // but for simplicity, I'm just hardcoding a value
    return 12933;
  }

  public boolean setBelowGround() {
    this.isBelowGround = true;
    return true;
  }
}
