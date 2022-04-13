package org.launchcode.java.demos.lsn6inheritance;

public class Main {

  public static void main(String[] args) {
    HouseCat felix = new HouseCat("Felix", 16);
    System.out.println(felix.purr());
    felix.eat();
    System.out.println(felix.isTired());
  }


}
