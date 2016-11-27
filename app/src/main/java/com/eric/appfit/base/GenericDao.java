package com.eric.appfit.base;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ericvyc on 26/11/16.
 */

public class GenericDao<E> extends DataBaseHelper<E> {

    protected Dao<E, Integer> dao;
    private Class<E> type;

    public GenericDao(Context context, Class<E> type) {
        super(context);
        this.type = type;
        setDao();
    }

    protected void setDao() {
        try{
            dao = DaoManager.createDao(getConnectionSource(), type);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<E> getAll() {
        try{
            List<E> result = dao.queryForAll();
            return result;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public E getById(int id) {
        try{
            E obj = dao.queryForId(id);
            return obj;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void insert(E obj) {
        try{
            dao.create(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void delete(E obj) {
        try{
            dao.delete(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void update(E obj) {
        try{
            dao.update(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public QueryBuilder<E, Integer> queryBuilder(){
        return dao.queryBuilder();
    }

    public List<E> query(PreparedQuery<E> preparedQuery) throws SQLException {
        return dao.query(preparedQuery);
    }

}
