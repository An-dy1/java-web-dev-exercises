package org.launchcode.java.studios.quizIncomplete;

public abstract class Question {

  /* GETTERS AND SETTERS */

  /* FIELDS */
  private String questionText;


  /* CONSTRUCTOR */
  public Question(String questionText) {
    this.questionText = questionText;

  }

  // why not abstract method? implementation is the same for all questions, doesn't depend on a child class-specific field
  public void printQuestion() {
    System.out.println("======================");
    System.out.println(questionText);
  }

  public abstract void displayPossibleAnswers();

  public abstract int gradeAnswer(int answer);

  public abstract int getAnswers();


}
