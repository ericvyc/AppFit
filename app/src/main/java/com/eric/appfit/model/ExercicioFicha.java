package com.eric.appfit.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ericvyc on 27/11/16.
 */

@DatabaseTable(tableName = "EXERCICIO_FICHA")
public class ExercicioFicha {

    @DatabaseField(columnName = "ID", generatedId = true)
    private Long id;

    @DatabaseField(columnName = "ID_FICHA", foreignColumnName = "ID", foreign = true, foreignAutoRefresh = true)
    private Ficha ficha;

    @DatabaseField(columnName = "ID_EXERCICIO", foreignColumnName = "ID", foreign = true, foreignAutoRefresh = true)
    private Exercicio exercicio;

    public ExercicioFicha(Ficha ficha, Exercicio exercicio) {
        this.ficha = ficha;
        this.exercicio = exercicio;
    }

    public ExercicioFicha(Long id, Ficha ficha, Exercicio exercicio) {
        this.id = id;
        this.ficha = ficha;
        this.exercicio = exercicio;
    }

    public ExercicioFicha() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }
}
