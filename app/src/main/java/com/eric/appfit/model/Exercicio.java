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

    public Exercicio() {
        super();
    }

    public Exercicio(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
