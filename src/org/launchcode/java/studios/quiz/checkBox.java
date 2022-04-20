package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class checkBox extends Question {

  private ArrayList<String> possibleAnwers;
  private ArrayList<Integer> correctAnswers;


  public checkBox(String questionText, int aPointValue, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
    super(questionText, aPointValue);
    this.possibleAnwers = possibleAnswers;
    this.correctAnswers = correctAnswers;
  }

  @Override
  public void displayPossibleAnswers() {
    System.out.println("There could be more than one possible answer, with at least one correct answer.");
    for(int i = 0; i < possibleAnwers.size(); i++) {
      System.out.println(i + 1 + " " + possibleAnwers.get(i));
    }

  }

  @Override
  public int gradeAnswer(int answer) {
    return 0;
  }

  @Override
  public int getAnswers() {
    ArrayList<Integer> usersAnswers = new ArrayList<>();
    System.out.println("Enter your first answer by entering its number (1, 2, 3 or 4).");
    Scanner userAnswer = new Scanner(System.in);
    String anAnswer;
    do {
      anAnswer = userAnswer.nextLine();
      System.out.println("anAnswer is: " + anAnswer);
      usersAnswers.add(Integer.parseInt(anAnswer));
    } while(anAnswer != "");

    if(usersAnswers == correctAnswers) {
      System.out.println("Answers are correct");
      return 1;
    } else {
      System.out.println("Answers are incorrect");
      return 0;
    }
  }
}
