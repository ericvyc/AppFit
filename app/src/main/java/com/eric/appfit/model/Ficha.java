package com.eric.appfit.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ericvyc on 27/11/16.
 */

@DatabaseTable(tableName = "FICHA")
public class Ficha {

    @DatabaseField(generatedId = true, columnName = "ID")
    private Long id;

    @DatabaseField(columnName = "ID_USUARIO", foreignColumnName = "ID", foreign = true, foreignAutoRefresh = true)
    private Usuario usuario;

    public Ficha() {
    }

    public Ficha(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ficha(Long id, Usuario usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
