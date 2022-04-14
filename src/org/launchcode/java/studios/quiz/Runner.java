package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class Runner {

  public static void main(String[] args) {

    ArrayList<Question> quizQuestions = new ArrayList<>();
    Quiz startingQuiz = new Quiz(quizQuestions);


    ArrayList<String> firstQuestionAnswers = new ArrayList<>();
    firstQuestionAnswers.add("peach");
    firstQuestionAnswers.add("cauliflower");
    firstQuestionAnswers.add("walnut");
    firstQuestionAnswers.add("pea");
    Question firstQuestion = new multipleChoice("Which of these is not a fruit?", 1);

    Question secondQuestion = new trueOrFalse("'A' is the most common letter used in the English language", 1);


    startingQuiz.addQuestionToQuiz(firstQuestion);


    startingQuiz.printQuestions();

    // add questions to quiz

    // run quiz:
    // 1. print each question
    // 2. capture each answer
    // 3. grade quiz to determine their score
  }
}
