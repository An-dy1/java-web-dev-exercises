package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class multipleChoice extends Question {

  ArrayList<String> possibleAnswers;
  String correctAnswer;

  public multipleChoice(String questionText, int aPointValue, ArrayList<String> possibleAnswers, String correctAnswer) {
    super(questionText, aPointValue);
    this.possibleAnswers = possibleAnswers;
    this.correctAnswer = correctAnswer;
  }

  @Override
  public void displayPossibleAnswers() {
    System.out.println("There is only one correct answer. The possible answers are: ");
    for(int i = 0; i < possibleAnswers.size(); i++) {
      System.out.println((i + 1) + " " + possibleAnswers.get(i));
    }
  }

  @Override
  public int gradeAnswer() {
    return 0;
  }

  @Override
  public void getAnswers() {
    Scanner answers = new Scanner(System.in);
    System.out.println();
  }
}
