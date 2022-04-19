package org.launchcode.java.demos.lsn6inheritance.lectureComplete.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails.InfinityPoolProject;
import org.launchcode.java.demos.lsn6inheritance.lectureComplete.projectDetails.PoolProject;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstallationProjectInheritance {

  Date today = Calendar.getInstance().getTime();

  @Test
  public void poolDepthSetInSuperConstructorCorrectly() {
    PoolProject coolPool = new PoolProject(5, 10, 16, today);
    assertEquals(coolPool.getDepth(), 5, .001);
  }

  @Test
  public void infinityPoolAccessParentPoolMethodCorrectly() {
    InfinityPoolProject infinityPool = new InfinityPoolProject(3, 6, 9, today);

    // method in the Pool class
    infinityPool.setBelowGround();
    assertTrue(infinityPool.isBelowGround());
  }

  @Test
  public void infinityPoolAccessesParentInstalProjectMethodCorrectly() {
    InfinityPoolProject infinityPool = new InfinityPoolProject(3, 6, 9, today);
    String helloResponse = infinityPool.sayHello();

    // method in Installation Project class
    assertEquals("Hey there", helloResponse);
  }
}
