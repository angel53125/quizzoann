package com.hfad.quizzoann;

import java.util.ArrayList;

//ANgel Negron


public class Question {

    private String genre;
    private String question;
    private String answer;
    private ArrayList<String> choices = new ArrayList<String>();
    private String funFact;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getfunFact() {
        return funFact;
    }

    public void setfunFact(String funFact) {
        this.genre = funFact;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public Question(String genre, String question, String answer, ArrayList<String> choices,String fact) {
        this.genre = genre;
        this.question = question;
        this.answer = answer;
        this.choices = choices;
        this.funFact = fact;
    }




}
