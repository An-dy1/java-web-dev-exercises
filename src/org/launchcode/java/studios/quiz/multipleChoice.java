package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class multipleChoice extends Question {

  ArrayList<String> possibleAnswers;
  int correctAnswer;

  public multipleChoice(String questionText, ArrayList<String> possibleAnswers, int correctAnswer) {
    super(questionText);
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
  public int gradeAnswer(int answer) {
    if(answer == correctAnswer) {
      return 1;
    } else {
      return 0;
    }
  }

  @Override
  public int getAnswers() {
    Scanner answers = new Scanner(System.in);
    System.out.println("Please enter the number of the answer you would like to pick: ");

    // would need to add input validation here
    int answer = Integer.parseInt(answers.nextLine());
    return answer;
  }
}
