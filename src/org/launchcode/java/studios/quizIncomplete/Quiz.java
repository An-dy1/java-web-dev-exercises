package org.launchcode.java.studios.quizIncomplete;

import java.util.ArrayList;

public class Quiz {

  /* GETTERS AND SETTERS */
  public ArrayList<Question> getListOfQuestions() {
    return listOfQuestions;
  }

  /* FIELDS */
  private ArrayList<Question> listOfQuestions;
  private int totalScore = 0;

  /* CONSTRUCTOR */
  public Quiz(ArrayList<Question> listOfQuestions) {
    this.listOfQuestions = listOfQuestions;
  }

  /* METHODS */
  public ArrayList<Question> addQuestionToQuiz(Question questionToAdd) {
    this.listOfQuestions.add(questionToAdd);
    return this.listOfQuestions;
  }

  public void runQuiz() {

    // elected for a regular for loop so that I would have access to the iterator easily - could get around this

    for(int i = 0; i < listOfQuestions.size(); i++) {

      listOfQuestions.get(i).printQuestion();
      listOfQuestions.get(i).displayPossibleAnswers();
      int answer = listOfQuestions.get(i).getAnswers();

      System.out.println("=======================");

      int points = listOfQuestions.get(i).gradeAnswer(answer);
      totalScore += points;

      if(points > 0) {
        System.out.println(String.format("That is correct! You have answered %o questions and gotten %o correct", i + 1, totalScore));
      } else {
        System.out.println(String.format("That's not quite right. Out of %o questions you have gotten %o correct", i + 1, totalScore));
      }

      System.out.println("Your total points are: " + totalScore);
    }
  }
}
