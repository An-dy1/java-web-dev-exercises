package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class Quiz {

  /* GETTERS AND SETTERS */
  public ArrayList<Question> getListOfQuestions() {
    return listOfQuestions;
  }

  /* FIELDS */
  private ArrayList<Question> listOfQuestions;

  /* CONSTRUCTOR */
  public Quiz(ArrayList<Question> listOfQuestions) {
    this.listOfQuestions = listOfQuestions;
  }

  /* METHODS */
  public ArrayList<Question> addQuestionToQuiz(Question questionToAdd) {
    this.listOfQuestions.add(questionToAdd);
    return this.listOfQuestions;
  }

  public void printQuestions() {
    for (Question question : listOfQuestions) {
      
    }
  }
}
