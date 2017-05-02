package com.javarush.test.jun_golov;

import java.util.List;

/**
 * Created by Катюха on 20.04.2017.
 */
public interface BaseDao<T>
{
    public T selectById(int id) throws DBException; //NoSuchEntityException;

    public List<T> selectAll() throws DBException;

//    public void insert(T newEntity) throws DaoSystemException, DaoBusinessException;
//
//    public void update(T newEntity) throws DaoSystemException, DaoBusinessException;
//
//    public void deleteById(int id) throws DaoSystemException, NoSuchEntityException;
}
