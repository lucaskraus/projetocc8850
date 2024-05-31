/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc8850.projeto.View;

import javax.swing.JFrame;

/**
 *
 * @author Christian
 */
public class frm_principal extends javax.swing.JFrame {

    public frm_cad_produto formCadProduto = null;
    public frm_cad_cliente formCadCliente = null;
    public frm_venda formVenda = null;
    public frm_login formLogin = null;

    public frm_rel_VendasEfetuadas formRelVendas = null;
    public frm_rel_VendasEfetuadas formRelPFMaisComprou = null;
    public frm_rel_VendasEfetuadas formRelPJMenosComprou = null;
    public frm_rel_VendasEfetuadas formRelProdutosVendidos = null;

    private void validaLogin() {
        if (formLogin == null) {
            formLogin = new frm_login(this, true);
            formLogin.setVisible(true);
        }
    }

    /**
     * Creates new form frm_principal
     */
    public frm_principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        validaLogin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemPessoa = new javax.swing.JMenuItem();
        jMenuCompra = new javax.swing.JMenu();
        jMenuItemEfetuarCompra = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemVendasEfetuada = new javax.swing.JMenuItem();
        jMenuItemPessoaMaisComprou = new javax.swing.JMenuItem();
        jMenuItemPessoaMenosComprou = new javax.swing.JMenuItem();
        jMenuItemProdutosVendidos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISVENDA - Sistema de Venda Diversos");

        jMenuCadastros.setText("Cadastro");

        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProduto);

        jMenuItemPessoa.setText("Cliente");
        jMenuItemPessoa.setActionCommand("");
        jMenuItemPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPessoaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemPessoa);

        jMenuBar2.add(jMenuCadastros);

        jMenuCompra.setText("Venda");
        jMenuCompra.setActionCommand("");

        jMenuItemEfetuarCompra.setText("Efetuar venda...");
        jMenuItemEfetuarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEfetuarCompraActionPerformed(evt);
            }
        });
        jMenuCompra.add(jMenuItemEfetuarCompra);

        jMenuBar2.add(jMenuCompra);

        jMenuRelatorio.setText("Relatório");

        jMenuItemVendasEfetuada.setText("Vendas Efetuadas");
        jMenuItemVendasEfetuada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasEfetuadaActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemVendasEfetuada);

        jMenuItemPessoaMaisComprou.setText("Cliente PF que mais efetuou compras");
        jMenuItemPessoaMaisComprou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPessoaMaisComprouActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemPessoaMaisComprou);

        jMenuItemPessoaMenosComprou.setText("Cliente PJ que efetuou menos compras");
        jMenuItemPessoaMenosComprou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPessoaMenosComprouActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemPessoaMenosComprou);

        jMenuItemProdutosVendidos.setText("Lista de itens em ordem pela quantidade vendida");
        jMenuItemProdutosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosVendidosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemProdutosVendidos);

        jMenuBar2.add(jMenuRelatorio);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("frmPrincipal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        if (formCadProduto == null) {
            formCadProduto = new frm_cad_produto();
        } else {
            formCadProduto.inicializaControles();
        }
        formCadProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPessoaActionPerformed
        if (formCadCliente == null) {
            formCadCliente = new frm_cad_cliente();
        } else {
            formCadCliente.inicializaControles();
        }
        formCadCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemPessoaActionPerformed

    private void jMenuItemEfetuarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEfetuarCompraActionPerformed
        if (formVenda == null) {
            formVenda = new frm_venda();
        } else {
            formVenda.inicializaControles();
        }
        formVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItemEfetuarCompraActionPerformed

    private void jMenuItemVendasEfetuadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasEfetuadaActionPerformed
        if (formRelVendas == null) {
            formRelVendas = new frm_rel_VendasEfetuadas();
            formRelVendas.inicializaControles();
        } else {
            formRelVendas.inicializaControles();
        }
        formRelVendas.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendasEfetuadaActionPerformed

    private void jMenuItemPessoaMaisComprouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPessoaMaisComprouActionPerformed
         if (formRelPFMaisComprou == null) {
            formRelPFMaisComprou = new frm_rel_VendasEfetuadas();
            formRelPFMaisComprou.setClientePFMaisComprou();
            formRelPFMaisComprou.inicializaControles();
        } else {
            formRelPFMaisComprou.inicializaControles();
        }
        formRelPFMaisComprou.setVisible(true);
    }//GEN-LAST:event_jMenuItemPessoaMaisComprouActionPerformed

    private void jMenuItemPessoaMenosComprouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPessoaMenosComprouActionPerformed
        if (formRelPJMenosComprou == null) {
            formRelPJMenosComprou = new frm_rel_VendasEfetuadas();
            formRelPJMenosComprou.setClientePJMenosComprou();
            formRelPJMenosComprou.inicializaControles();
        } else {
            formRelPJMenosComprou.inicializaControles();
        }
        formRelPJMenosComprou.setVisible(true);
    }//GEN-LAST:event_jMenuItemPessoaMenosComprouActionPerformed

    private void jMenuItemProdutosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosVendidosActionPerformed
        if (formRelProdutosVendidos == null) {
            formRelProdutosVendidos = new frm_rel_VendasEfetuadas();
            formRelProdutosVendidos.setRelacaoProdutos();
            formRelProdutosVendidos.inicializaControles();
        } else {
            formRelProdutosVendidos.inicializaControles();
        }
        formRelProdutosVendidos.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosVendidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuCompra;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemEfetuarCompra;
    private javax.swing.JMenuItem jMenuItemPessoa;
    private javax.swing.JMenuItem jMenuItemPessoaMaisComprou;
    private javax.swing.JMenuItem jMenuItemPessoaMenosComprou;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemProdutosVendidos;
    private javax.swing.JMenuItem jMenuItemVendasEfetuada;
    private javax.swing.JMenu jMenuRelatorio;
    // End of variables declaration//GEN-END:variables
}
