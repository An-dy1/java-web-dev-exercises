package org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
