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

    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String pQuestion, String[] pAnswers, String pCorrectAnswer) {
        question = pQuestion;
        answers = pAnswers;
        correctAnswer = Integer.parseInt(pCorrectAnswer);
    }
}
