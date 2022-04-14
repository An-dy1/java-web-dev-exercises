package org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails;

import java.util.Date;
import java.util.Map;

public class PoolProject extends InstallationProject {

  private static final Map<String, Integer> availableModels = Map.of(
      "Pool Factory", 2546,
      "Royal Swimming Pool", 1999,
      "Walmart", 410
  );

  public PoolProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  @Override
  public double generateQuote() {
    return 12933;
  }
}
