package com.example.android.quizapp;


public class Question {

    public String getQuestion() {
        return question;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getAnswers(int n) {
        return answers;
    }

    private final String question;
    private final String[] answers;
    private final int correctAnswer;

    public Question(String pQuestion, String[] pAnswers, String pCorrectAnswer) {
        question = pQuestion;
        answers = pAnswers;
        correctAnswer = Integer.parseInt(pCorrectAnswer);
    }
}
