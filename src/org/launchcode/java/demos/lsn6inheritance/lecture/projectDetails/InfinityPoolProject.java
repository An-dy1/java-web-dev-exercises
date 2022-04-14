package org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails;

import java.util.Date;
import java.util.Map;

public class InfinityPoolProject extends PoolProject {

  private static final Map<String, Integer> availableModels = Map.of(
      "Endless Pool", 8895,
      "Infinity Pool", 12360
  );

  public InfinityPoolProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  @Override
  public double generateQuote() {
    return 9873;
  }
}
