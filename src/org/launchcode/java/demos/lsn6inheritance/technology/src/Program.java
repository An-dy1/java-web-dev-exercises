package org.launchcode.java.demos.lsn6inheritance.technology.src;

public class Program {

  public static void main(String[] args) {

    Computer myComputer = new Computer(4, "256");
    SmartPhone mySmartPhone = new SmartPhone(6, "Hi", "Bye");

    System.out.println("smart phone id is: " + mySmartPhone.getDeviceId());
    System.out.println("computer id is: " + myComputer.getDeviceId());

  }
}
