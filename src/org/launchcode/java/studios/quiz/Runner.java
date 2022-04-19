package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

  public static void main(String[] args) {

    ArrayList<Question> quizQuestions = new ArrayList<>();
    Quiz startingQuiz = new Quiz(quizQuestions);

    ArrayList<String> firstQuestionAnswers = new ArrayList<>(Arrays.asList("peach", "cauliflower", "walnut", "pea"));
    // we aren't zero-indexing the correct answer index value here because the users' input choices will start at 1
    int firstQuestionCorrectAnswer = 2;
    Question firstQuestion = new multipleChoice("Which of these is not a fruit?", 1, firstQuestionAnswers, firstQuestionCorrectAnswer);


    ArrayList<String> secondQuestionAnswers = new ArrayList<>(Arrays.asList("red", "blue", "yellow", "brown"));
    int secondQuestionCorrectAnswer = 4;
    Question secondQuestion = new multipleChoice("Which M&M color is the rarest?", 1, secondQuestionAnswers, secondQuestionCorrectAnswer);


    Question thirdQuestion = new trueOrFalse("'A' is the most common letter used in the English language", 1, 2);


    startingQuiz.addQuestionToQuiz(firstQuestion);
    startingQuiz.addQuestionToQuiz(secondQuestion);
    startingQuiz.addQuestionToQuiz(thirdQuestion);

    startingQuiz.runQuiz();

    // add questions to quiz

    // run quiz:
    // 1. print each question
    // 2. capture each answer
    // 3. grade quiz to determine their score
  }
}
