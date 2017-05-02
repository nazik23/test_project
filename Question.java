package com.javarush.test.jun_golov;

import java.util.List;

/**
 * Created by Катюха on 17.04.2017.
 */
public class Question
{
    private final int id;
    private String caption;
    private String question;
    private List<Answer> answers;
    private String explanation;

    public Question(int id) {
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                ", explanation='" + explanation + '\'' +
                '}';
    }
}
