package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class trueOrFalse extends Question {

  private boolean correctAnswer;

  public trueOrFalse(String questionText, int aPointValue) {
    super(questionText, aPointValue);
    // correct answer boolean
    // possible answers always true or false
  }

  @Override
  public void displayPossibleAnswers() {

  }

  @Override
  public int gradeAnswer() {
    return 0;
  }

  @Override
  public void getAnswers() {

  }
}
