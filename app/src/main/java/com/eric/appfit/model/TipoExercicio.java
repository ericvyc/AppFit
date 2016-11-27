package com.eric.appfit.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ericvyc on 27/11/16.
 */
@DatabaseTable(tableName = "TIPO_EXERCICIO")
public class TipoExercicio {

    @DatabaseField(columnName = "ID", generatedId = true)
    private Long id;

    @DatabaseField(columnName = "DESCRICAO")
    private String descricao;

    public TipoExercicio(String descricao) {
        this.descricao = descricao;
    }

    public TipoExercicio(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public TipoExercicio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
