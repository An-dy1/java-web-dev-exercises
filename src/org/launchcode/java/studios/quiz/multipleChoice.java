package org.launchcode.java.studios.quiz;

public class multipleChoice extends Question {


  public multipleChoice(String questionText, int aPointValue) {
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
