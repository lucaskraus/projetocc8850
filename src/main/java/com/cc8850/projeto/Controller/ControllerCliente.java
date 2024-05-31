/*
 
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
package com.cc8850.projeto.Controller;

import java.util.ArrayList;

import com.cc8850.projeto.Model.Cliente;
import com.cc8850.projeto.Model.DAO.DAOCliente;

/**
 *
 
@author Christian*/
public class ControllerCliente {

    public ArrayList<Cliente> getClientes() {
        DAOCliente srv = new DAOCliente();
        return srv.getAll();
    }

    public Cliente getCliente(int id) {
        DAOCliente srv = new DAOCliente();
        return srv.getCliente(id);
    }

    public void persistirBanco(Cliente pessoa, boolean insert, boolean edit, boolean delete) {
        DAOCliente srv = new DAOCliente();
        if (insert) {
            srv.insert(pessoa);
            srv.setCodigoBancoCliente(pessoa);
        }
        if (edit) {
            srv.update(pessoa);
        }
        if (delete) {
            srv.delete(pessoa);
        }
    }

    public String toString() {
        String res = "";
        ArrayList<Cliente> lista = this.getClientes();
        for (Cliente o : lista) {
            res += o.toString() + "\n";
        }
        return res;
    }

}