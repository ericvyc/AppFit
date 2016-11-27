package com.eric.appfit.dao;

import android.content.Context;

import com.eric.appfit.base.GenericDao;
import com.eric.appfit.model.Usuario;

/**
 * Created by ericvyc on 26/11/16.
 */

public class UsuarioDao extends GenericDao<Usuario> {

    public UsuarioDao(Context context){
        super(context, Usuario.class);
    }

}
