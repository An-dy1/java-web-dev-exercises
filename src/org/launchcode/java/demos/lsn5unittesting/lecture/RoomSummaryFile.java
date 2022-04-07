package org.launchcode.java.demos.lsn5unittesting.lecture;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class RoomSummaryFile {

  public static boolean generateRoomSummaryFile(ArrayList<Dog> dogs, String fileDestination) {
    if (dogs != null) {
      try {
        FileWriter myWriter = new FileWriter(fileDestination);
        for (Dog dog : dogs) {
          myWriter.write(dog.toString() + "\n");
        }
        myWriter.close();
        System.out.println("Wrote the file");
        return true;

      } catch (IOException e) {
        System.out.println("An error has occurred");
        e.printStackTrace();
        return false;
      }
    } else {
      System.out.println("No dogs to print");
      return false;
    }


  }
}
