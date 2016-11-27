package com.eric.appfit.base;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.eric.appfit.model.Exercicio;
import com.eric.appfit.model.Usuario;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by ericvyc on 26/11/16.
 */

public class DataBaseHelper<E> extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "db_appfit_mobile";
    private static final int DATABASE_VERSION = 1;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource src) {
        try{
            TableUtils.createTable(src, Exercicio.class);
            TableUtils.createTable(src, Usuario.class);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource src, int oldVersion, int newVersion) {
        try{
            TableUtils.dropTable(src, Exercicio.class, true);
            TableUtils.dropTable(src, Usuario.class, true);
            onCreate(db, src);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        super.close();
    }

}
