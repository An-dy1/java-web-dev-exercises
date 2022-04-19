package org.launchcode.java.studios.quiz;

public abstract class Question {

  /* GETTERS AND SETTERS */

  /* FIELDS */
  private String questionText;
  private int pointValue;


  /* CONSTRUCTOR */
  public Question(String questionText, int aPointValue) {
    this.questionText = questionText;
    this.pointValue = aPointValue;
  }

  public void printQuestion() {
    System.out.println("======================");
    System.out.println(questionText);
  }

  public void setPointValue(int pointValue) {
    this.pointValue = pointValue;
  }

  public int getPointValue() {
    return this.pointValue;
  }


  public abstract void displayPossibleAnswers();

  public abstract int gradeAnswer(int answer);

  public abstract int getAnswers();


}
