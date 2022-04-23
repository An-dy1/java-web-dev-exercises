package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class checkBox extends Question {

  private ArrayList<String> possibleAnwers;
  private ArrayList<Integer> correctAnswers;


  public checkBox(String questionText, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
    super(questionText);
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
  public int gradeAnswer(int points) {
    return points;
  }

  @Override
  public int getAnswers() {
    ArrayList<Integer> usersAnswers = new ArrayList<>();
    System.out.println("Enter your first answer by entering its number (1, 2, 3 or 4).");
    Scanner userAnswer = new Scanner(System.in);
    String anAnswer;
    do {
      anAnswer = userAnswer.nextLine();
      if(!anAnswer.equals("")) {
        usersAnswers.add(Integer.parseInt(anAnswer));
      }
    } while(!anAnswer.equals(""));

    System.out.println("user answers: " + usersAnswers);
    System.out.println("correct answers: " + correctAnswers);

    // have to grade within the checkbox's get answer function, unlike the other question child types, because the correct answers are an array of ints
    // could update this to give a point for each correct answer

    if(usersAnswers.equals(correctAnswers)) {
      System.out.println("Answers are correct");
      return 1;
    } else {
      System.out.println("Answers are incorrect");
      return 0;
    }
  }
}
