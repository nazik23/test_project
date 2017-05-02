package com.javarush.test.jun_golov;

/**
 * Created by Катюха on 17.04.2017.
 */
public class Answer
{
    private final int id;
    private String answer;
    private boolean correct;

    public Answer(int id, String answer, boolean correct) {
        this.id = id;
        this.answer = answer;
        this.correct = correct;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "QuizAnswer{" +
                "answer='" + answer + '\'' +
                ", correct=" + correct +
                '}';
    }
}
