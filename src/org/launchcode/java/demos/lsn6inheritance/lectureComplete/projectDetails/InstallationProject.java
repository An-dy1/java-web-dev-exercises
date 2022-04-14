package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;

public abstract class InstallationProject {

  private double depth;
  private double length;
  private double width;
  private Date desiredStartDate;

  public InstallationProject(double depth, double length, double width, Date desiredStartDate) {
    this.depth = depth;
    this.length = length;
    this.width = width;
    this.desiredStartDate = desiredStartDate;
  }

  public abstract double generateQuote();


}
