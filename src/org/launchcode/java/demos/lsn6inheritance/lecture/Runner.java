package org.launchcode.java.demos.lsn6inheritance.lecture;

import org.launchcode.java.demos.lsn6inheritance.lecture.communication.CustomerInteractions;
import org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails.HotTubProject;
import org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails.InfinityPoolProject;
import org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails.InstallationProject;
import org.launchcode.java.demos.lsn6inheritance.lecture.projectDetails.PoolProject;

import java.util.Calendar;
import java.util.Date;

public class Runner {

  public static void main(String[] args) {

    int poolTypeSelection = CustomerInteractions.askCustomerForProjectType();
    double[] dimensions = CustomerInteractions.askCusomterForDimensions();

    System.out.println("pool type: " + poolTypeSelection);
    System.out.println("dimensions: " + dimensions[0] + " " + dimensions[1] + " " + dimensions[2]);

    Date today = Calendar.getInstance().getTime();

    InstallationProject newProject = null;

    switch (poolTypeSelection) {
      case 1:
        newProject = new PoolProject(dimensions[0], dimensions[1], dimensions[2], today);
        break;
      case 2:
        newProject = new InfinityPoolProject(dimensions[0], dimensions[1], dimensions[2], today);
        break;
      case 3:
        newProject = new HotTubProject(dimensions[0], dimensions[1], dimensions[2], today);
        break;
    }

    newProject.generateQuote();
  }
}
