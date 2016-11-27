package com.eric.appfit.base;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.eric.appfit.model.Exercicio;
import com.eric.appfit.model.ExercicioFicha;
import com.eric.appfit.model.Ficha;
import com.eric.appfit.model.TipoExercicio;
import com.eric.appfit.model.Usuario;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by ericvyc on 26/11/16.
 */

public class DataBaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "db_appfit_mobile";
    private static final int DATABASE_VERSION = 2;
    private Dao<Exercicio, Long> exercicioDao;
    private Dao<ExercicioFicha, Long> exercicioFichaDao;
    private Dao<Ficha, Long> fichaDao;
    private Dao<TipoExercicio, Long> tipoExercicioDao;
    private Dao<Usuario, Long> usuarioDao;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource src) {
        try{
            TableUtils.createTable(src, Exercicio.class);
            TableUtils.createTable(src, ExercicioFicha.class);
            TableUtils.createTable(src, Ficha.class);
            TableUtils.createTable(src, TipoExercicio.class);
            TableUtils.createTable(src, Usuario.class);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource src, int oldVersion, int newVersion) {
        try{
            TableUtils.dropTable(src, Exercicio.class, true);
            TableUtils.dropTable(src, ExercicioFicha.class, true);
            TableUtils.dropTable(src, Ficha.class, true);
            TableUtils.dropTable(src, TipoExercicio.class, true);
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

    public Dao<Exercicio, Long> getExercicioDao() throws SQLException {
        if(exercicioDao == null){
            exercicioDao = getDao(Exercicio.class);
        }
        return exercicioDao;
    }

    public Dao<ExercicioFicha, Long> getExercicioFichaDao() throws SQLException {
        if(exercicioFichaDao == null){
            exercicioFichaDao = getDao(ExercicioFicha.class);
        }
        return exercicioFichaDao;
    }

    public Dao<Ficha, Long> getFichaDao() throws SQLException {
        if(fichaDao == null){
            fichaDao = getDao(Ficha.class);
        }
        return fichaDao;
    }

    public Dao<TipoExercicio, Long> getTipoExercicioDao() throws SQLException {
        if(tipoExercicioDao == null){
            tipoExercicioDao = getDao(TipoExercicio.class);
        }
        return tipoExercicioDao;
    }

    public Dao<Usuario, Long> getUsuarioDao() throws SQLException {
        if(usuarioDao == null){
            usuarioDao = getDao(Usuario.class);
        }

        return usuarioDao;
    }

}
