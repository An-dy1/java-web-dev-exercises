package org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails;

import java.util.Date;

public abstract class InstallationProject {

  private double depth;
  private double length;
  private double width;

  public double getDepth() {
    return depth;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public Date getDesiredStartDate() {
    return desiredStartDate;
  }

  private Date desiredStartDate;

  public InstallationProject(double depth, double length, double width, Date desiredStartDate) {
    this.depth = depth;
    this.length = length;
    this.width = width;
    this.desiredStartDate = desiredStartDate;
  }

  public abstract double generateQuote();

  // non-abstract methods are inherited but don't have to be implemented
  public String sayHello() {
    System.out.println("Hey there from the installation project class");
    return "Hey there";
  }


}
