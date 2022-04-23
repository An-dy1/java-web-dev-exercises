package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class trueOrFalse extends Question {

  private int correctAnswer;

  public trueOrFalse(String questionText, int aCorrectAnswer) {
    super(questionText);
    this.correctAnswer = aCorrectAnswer;
  }

  @Override
  public void displayPossibleAnswers() {
    System.out.println("1 true \n2 false");
  }

  @Override
  public int gradeAnswer(int answer) {
    if(answer == correctAnswer) {
      return 1;
    } else {
      return 0;
    }
  }

  @Override
  public int getAnswers() {
    System.out.println("True or false? Enter 1 for true and 2 for false.");
    Scanner userAnswer = new Scanner(System.in);

    // no validation here yet, assuming they enter just a 1 or 2
    String stringAnswer = userAnswer.nextLine();
    return Integer.parseInt(stringAnswer);
  }
}
