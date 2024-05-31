/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc8850.projeto.Controller;

import java.util.ArrayList;

import com.cc8850.projeto.Model.ClienteCompra;
import com.cc8850.projeto.Model.ItemVendido;
import com.cc8850.projeto.Model.Venda;
import com.cc8850.projeto.Model.DAO.DAOVenda;

/**
 *
 * @author Christian
 */
public class ControllerVenda {

    public ArrayList<Venda> getVendas() {
        DAOVenda srv = new DAOVenda();
        return srv.getAll();
    }

    public void persistirBanco(Venda venda) {
        DAOVenda srv = new DAOVenda();
        srv.insert(venda);
    }

    public ArrayList<ClienteCompra> getClientePFMaisComprou() {
        DAOVenda srv = new DAOVenda();
        return srv.getClientePFMaisComprou();
    }

    public ArrayList<ClienteCompra> getClientePJMenosComprou() {
        DAOVenda srv = new DAOVenda();
        return srv.getClientePJMenosComprou();
    }

    public ArrayList<ItemVendido> getProdutosVendidos() {
        DAOVenda srv = new DAOVenda();
        return srv.getProdutosVendidos();
    }

    public String toString() {
        String res = "";
        for (Venda o : this.getVendas()) {
            res += o.toString() + "\n";
        }
        return res;
    }

}
