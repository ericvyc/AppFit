package com.eric.appfit.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ericvyc on 26/11/16.
 */

@DatabaseTable(tableName = "EXERCICIO")
public class Exercicio {

    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "NOME")
    private String nome;

    @DatabaseField(columnName = "DESCRICAO")
    private String descricao;

    @DatabaseField(columnName = "ID_TIPO_EXERCICIO", foreign = true, foreignAutoRefresh = true, foreignColumnName = "ID")
    private TipoExercicio tipoExercicio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoExercicio getTipoExercicio() {
        return tipoExercicio;
    }

    public void setTipoExercicio(TipoExercicio tipoExercicio) {
        this.tipoExercicio = tipoExercicio;
    }

    public Exercicio(String nome, String descricao, TipoExercicio tipoExercicio) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoExercicio = tipoExercicio;
    }

    public Exercicio() {
        super();
    }

    public Exercicio(Long id, String nome, String descricao, TipoExercicio tipoExercicio) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipoExercicio = tipoExercicio;
    }
}
