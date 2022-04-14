package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class trueOrFalse extends Question {

  private boolean answer;

  public trueOrFalse(String questionText, int aPointValue) {
    super(questionText, aPointValue);
  }

  @Override
  public void displayAnswers() {

  }

  @Override
  public int gradeAnswer() {
    return 0;
  }
}
