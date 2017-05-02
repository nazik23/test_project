package com.javarush.test.jun_golov;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Катюха on 20.04.2017.
 */
public abstract class AbstractDao<T>
{
    protected Connection getConnection() throws DBException {
        return TransactionManagerImpl.getConnection();
    }

    protected Connection getSerializableConnection() throws DBException
    {
        try {
            Connection result = getConnection();
            result.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            result.setAutoCommit(false);
            return result;
        } catch (SQLException e) {
            throw new DBException("Can't create connection", e);
        }
    }

}
