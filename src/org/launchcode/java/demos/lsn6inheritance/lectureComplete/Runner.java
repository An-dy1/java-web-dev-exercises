package org.launchcode.java.demos.lsn6inheritance.lectureComplete;

import org.launchcode.java.demos.lsn6inheritance.lectureComplete.communication.CustomerInteractions;
import org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails.HotTubProject;
import org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails.InfinityPoolProject;
import org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails.InstallationProject;
import org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails.PoolProject;

import java.util.Calendar;
import java.util.Date;

public class Runner {

  public static void main(String[] args) {

    Date today = Calendar.getInstance().getTime();

    int poolTypeSelection = CustomerInteractions.askCustomerForProjectType();
    double[] dimensions = CustomerInteractions.askCusomterForDimensions();

    System.out.println("pool type: " + poolTypeSelection);
    System.out.println("dimensions: " + dimensions[0] + " " + dimensions[1] + " " + dimensions[2]);

    /*
     * When one class extends another a field or local variable of the type of the base class
     * may hold an object that is of the type of the child class.
     */
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

    // would we want to cast the new project?
    newProject.generateQuote();
    newProject.sayHello();

    /*
     * We can only call methods on a child class held in an instance of its parent class that are part of the parent class.
     * If we want access to the child's method's, and we are sure it is of the child class type, we can cast to access
     */
    InstallationProject infinityPoolExample = new InfinityPoolProject(10, 11, 12, today);
    infinityPoolExample.generateQuote();
    ((InfinityPoolProject) infinityPoolExample).setBelowGround();

  }
}
