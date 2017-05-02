package com.javarush.test.jun_golov;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Катюха on 20.04.2017.
 */
public interface UserDao
{
    public List<User> selectAll() throws DBException, SQLException;

    public int deleteById(int id) throws DBException;

    public void insert(User user) throws DBException;
}
