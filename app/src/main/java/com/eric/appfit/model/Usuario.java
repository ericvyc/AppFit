package com.eric.appfit.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ericvyc on 26/11/16.
 */

@DatabaseTable(tableName = "USUARIO")
public class Usuario {

    @DatabaseField(columnName = "ID", generatedId = true)
    private Long id;

    @DatabaseField(columnName = "NOME")
    private String nome;

    @DatabaseField(columnName = "EMAIL")
    private String email;

    @DatabaseField(columnName = "SENHA")
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
