package org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HotTubProject extends InstallationProject {

  private static final Map<String, Integer> availableModels = Map.of(
      "Jacuzzi", 12500,
      "Hot Spring", 4500,
      "Cap Spa", 9450
  );

  public HotTubProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  @Override
  public double generateQuote() {
    return 1678.89;
  }
}
