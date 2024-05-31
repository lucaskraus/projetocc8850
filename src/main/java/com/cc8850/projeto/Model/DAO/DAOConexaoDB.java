/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc8850.projeto.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class DAOConexaoDB {

    public Connection connection;

    public Connection getConexao() {
        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_projetocc8850" 
                    + "?verifyServerCertificate=true"
                    + "&useSSL=false"
                    + "&requireSSL=false"
                    + "&useTimezone=true&serverTimezone=UTC";

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, "freedb_projeto", "Bp8hy*X&VU&zbNr");
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.print(e.toString());
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.toString());
        } catch (SQLException e) {
            System.out.print(e.toString());
            JOptionPane.showMessageDialog(null, "Problemas de conexão: " + e.toString());
        }
        return null;
    }

    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
}
