package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;
import java.util.Map;

public class HotTubProject extends InstallationProject {

  private boolean jetsAreOn = false;

  private static final Map<String, Integer> availableModels = Map.of(
      "Jacuzzi", 12500,
      "Hot Spring", 4500,
      "Cap Spa", 9450
  );

  public boolean jetsAreOn() {
    return jetsAreOn;
  }

  private static final boolean isAboveGround = true;

  public HotTubProject(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  // a method inherited from installation project
  @Override
  public double generateQuote() {
    System.out.println("A hot tub quote: ");
    return 1678.89;
  }

  // a method unique to hot tubs
  public void turnOnJets() {
    if (!jetsAreOn) {
      jetsAreOn = true;
    }
  }
}
