package com.javarush.test.jun_golov;

import java.util.List;

/**
 * Created by Катюха on 17.04.2017.
 */
public class Quiz
{
    private final int id;
    private String caption;
    private String description;
    private List<Question> questions;

    public Quiz(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", questions=" + questions +
                '}';
    }

}
