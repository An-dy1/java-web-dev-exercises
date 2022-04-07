package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static junit.framework.TestCase.*;

public class CarTest {

  //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
  @Test
  public void emptyTest() {
    assertEquals(19, 19, .001);
  }

  Car test_car;

  @Before
  public void createCar() {
    test_car = new Car("Toyota", "Prius", 10, 50);
  }

  //TODO: constructor sets gasTankLevel properly
  @Test
  public void constructorSetsTankSize() {
    assertEquals(10, test_car.getGasTankLevel(), .001);
  }

  @Test
  public void tankSizeNotZero() {
    assertFalse(test_car.getGasTankLevel() == 0);
  }

  @Test
  public void tankSizeGreaterThanZero() {
    assertTrue(test_car.getGasTankLevel() > 0);
  }

  //TODO: gasTankLevel is accurate after driving within tank range
  @Test
  public void testDrive() {
    test_car.drive(50);
    assertEquals(9, test_car.getGasTankLevel(), .001);
  }

  @Test
  public void testDriveAgain() {
    test_car.drive(50);
    assertEquals(8, test_car.getGasTankLevel(), .001);
  }

  //TODO: gasTankLevel is accurate after attempting to drive past tank range
  @Test
  public void testDriveOutsideRange() {
    test_car.drive(500);
    assertEquals(0, test_car.getGasTankLevel(), .001);
  }

  //TODO: can't have more gas than tank size, expect an exception
  @Test(expected = IllegalArgumentException.class)
  public void testGasOverfillException() {
    test_car.addGas(15);
    fail("Car should not be able to take more gas than its tank size");
  }

}
