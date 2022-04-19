package org.launchcode.java.demos.lsn6inheritance.technology.src;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractIdManager {

  static int Id;

  public AbstractIdManager() {
//    this.Id = ThreadLocalRandom.current().nextInt(0, 100);
    this.Id = Id;
  }

  public int getId() {
    return this.Id;
  }

  public int incrementId() {
    this.Id = ++Id;
    return Id;
  }
}
