/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

import main.java.com.cc8850.projeto.Model.Login;
import main.java.com.cc8850.projeto.Model.DAO.DAOLogin;

/**
 *
 * @author Christian
 */
public class ControllerLogin {

    public Login validaLogin(String login, String senha, String priv) {
        DAOLogin daoLogin = new DAOLogin();
        return daoLogin.validaLogin(login, senha, priv);
    }

    public ArrayList<String> getPrivilegios() {
        DAOLogin daoLogin = new DAOLogin();
        return daoLogin.getPrivilegios();
    }

}
