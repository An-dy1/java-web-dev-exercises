package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;
import java.util.Map;

public class InfinityPoolProject extends PoolProject {

  private static final Map<String, Integer> availableModelsInfinity = Map.of(
      "Endless Pool", 8895,
      "Infinity Pool", 12360
  );

  public InfinityPoolProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  // would have inherited from pool project, which is inherited from installation project
  @Override
  public double generateQuote() {
    return 9873;
  }
}
