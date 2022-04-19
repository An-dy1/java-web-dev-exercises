package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;
import java.util.Map;

public class InfinityPoolProject extends PoolProject {

  private static final Map<String, Integer> availableModelsInfinity = Map.of(
      "Endless Pool", 8895,
      "Infinity Pool", 12360
  );
  private boolean isMultiSpeed;
  private double jetSpeed;

  public InfinityPoolProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  // would have inherited from pool project, which is inherited from installation project
  @Override
  public double generateQuote() {
    System.out.println("A infinity pool quote");
    return 9873;
  }

  public void increaseJetSpeed(double increaseToSpeed) {
    System.out.println("Increasing jet speed in the infinity pool class to: " + increaseToSpeed);
    jetSpeed = increaseToSpeed;
  }
}
