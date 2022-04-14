package org.launchcode.java.demos.lsn6inheritance.technology.src;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractIdManager {

  private int Id;

  public AbstractIdManager() {
    this.Id = ThreadLocalRandom.current().nextInt(0, 100);
  }

  public int getId() {
    return this.Id;
  }
}
