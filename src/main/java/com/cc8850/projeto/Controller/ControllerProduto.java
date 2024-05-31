/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc8850.projeto.Controller;

import java.util.ArrayList;

import com.cc8850.projeto.Model.Produto;
import com.cc8850.projeto.Model.DAO.DAOProduto;

/**
 *
 * @author Christian
 */
public class ControllerProduto {

    public ArrayList<Produto> getProdutos() {
        DAOProduto srv = new DAOProduto();
        return srv.getAll();
    }

    public void persistirBanco(Produto produto, boolean insert, boolean edit, boolean delete) {
        DAOProduto srvProduto = new DAOProduto();
        if (insert) {
            srvProduto.insert(produto);
            srvProduto.setCodigoBancoProduto(produto);
        }
        if (edit) {
            srvProduto.update(produto);
        }
        if (delete) {
            srvProduto.delete(produto);
        }
    }

    public Produto getProduto(int id) {
        DAOProduto srv = new DAOProduto();
        return srv.getProduto(id);
    }

    public String toString() {
        String res = "";
        ArrayList<Produto> lista = getProdutos();
        for (Produto o : lista) {
            res += o.toString() + "\n";
        }
        return res;
    }

}
