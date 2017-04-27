package com.javarush.test.jun_golov;

import java.util.concurrent.Callable;

/**
 * Created by Катюха on 17.04.2017.
 */
public interface TransactionManager
{
    public <T> T doInTransaction(Callable<T> unitOfWork)
            throws Exception;
}
