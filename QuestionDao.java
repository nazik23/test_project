package com.javarush.test.jun_golov;

import java.util.List;

/**
 * Created by Катюха on 20.04.2017.
 */
public interface QuestionDao
{
    public Question selectById(int id) throws DBException; //NoSuchEntityException;

    public List<Question> selectConnectedWithQuiz(int questionId) throws DBException;
}
