package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class trueOrFalse extends Question {

  // can only ever have two answers, one of which is true and one of which is false
  private String choiceOne = "true";
  private String choiceTwo = "false";
  private ArrayList<String> possibleAnswers = new ArrayList<>(Arrays.asList("true", "false"));


  public trueOrFalse(String type, String questionText, String correctAnswer) {
    super(type, questionText, correctAnswer);

  }
}
