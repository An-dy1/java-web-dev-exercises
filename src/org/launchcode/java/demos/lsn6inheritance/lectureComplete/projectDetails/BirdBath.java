package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;

public class BirdBath extends InstallationProject {
  public BirdBath(double depth, double length, double width, Date desiredStartDate) {
    super(depth, length, width, desiredStartDate);
  }

  @Override
  public double generateQuote() {
    return 0;
  }
}
