/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dal.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author janae
 */
public class VerOrdemDeServico extends javax.swing.JFrame {

    Connection conn = new Conexao().connect();
    PreparedStatement pstm;
    ResultSet rs;

    /**
     * Creates new form VerOrdemDeServico
     */
    public VerOrdemDeServico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisualizarOrdemServi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Visualiza Ordem De Serviço");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/mecanico (2) 128PX.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton1.setText("Concluidas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton2.setText("Ativas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblVisualizarOrdemServi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF do Cliente", "CPF do Mecancio", "Valor", "Serviço"
            }
        ));
        tblVisualizarOrdemServi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblVisualizarOrdemServiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblVisualizarOrdemServi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TelaMecanico tm = new TelaMecanico();
        tm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblVisualizarOrdemServiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblVisualizarOrdemServiAncestorAdded
        atualizarTabela();
    }//GEN-LAST:event_tblVisualizarOrdemServiAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblVisualizarOrdemServi.getModel();
        ArrayList<model.Orcamento> lista = new ArrayList();
        model.getDataVector().removeAllElements();
        try {

            String sql = "select * from tbl_orçamento where Pronto = 1 and OrdemServico = 1";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            lista.clear();
            while (rs.next()) {
                model.Orcamento orca = new model.Orcamento();
                orca.setId_orcamento(rs.getInt("Id_Orçamento"));
                orca.setValor(rs.getString("Valor"));
                orca.setCpfCliente(rs.getString("CPF_Cliente"));
                orca.setCpfMecanico(rs.getString("CPF_Mecanico"));
                orca.setServiços(rs.getString("Serviço"));
                lista.add(orca);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        for (model.Orcamento o : lista) {
            Object[] dados = {o.getId_orcamento(), o.getValor(), o.getCpfCliente(), o.getCpfMecanico(), o.getServiços()};
            model.addRow(dados);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tblVisualizarOrdemServi.getModel();
        ArrayList<model.Orcamento> lista = new ArrayList();
        model.getDataVector().removeAllElements();
        try {

            String sql = "select * from tbl_orçamento where OrdemServico = 1 and Pronto = 0";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            lista.clear();
            while (rs.next()) {
                model.Orcamento orca = new model.Orcamento();
                orca.setId_orcamento(rs.getInt("Id_Orçamento"));
                orca.setValor(rs.getString("Valor"));
                orca.setCpfCliente(rs.getString("CPF_Cliente"));
                orca.setCpfMecanico(rs.getString("CPF_Mecanico"));
                orca.setServiços(rs.getString("Serviço"));
                lista.add(orca);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        for (model.Orcamento o : lista) {
            Object[] dados = {o.getId_orcamento(), o.getValor(), o.getCpfCliente(), o.getCpfMecanico(), o.getServiços()};
            model.addRow(dados);
        }
    }

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
            java.util.logging.Logger.getLogger(VerOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerOrdemDeServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVisualizarOrdemServi;
    // End of variables declaration//GEN-END:variables
}
