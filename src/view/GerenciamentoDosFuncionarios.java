/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dal.Conexao;
import model.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author janae
 */
public class GerenciamentoDosFuncionarios extends javax.swing.JFrame {

    Funcionario func = new Funcionario();

    Connection conn = new Conexao().connect();
    PreparedStatement pstm;
    ResultSet rs;

    /**
     * Creates new form GerenciamentoDosFuncioanrios
     */
    public GerenciamentoDosFuncionarios() {
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

        btnCargo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnApagarCampos = new javax.swing.JButton();
        btnGerente = new javax.swing.JRadioButton();
        btnMecanico = new javax.swing.JRadioButton();
        btnAtendente = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFunc = new javax.swing.JTable();
        txtSenha = new javax.swing.JPasswordField();
        txtCPF = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Funcionários");
        setResizable(false);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Sistema de Gerençiamento De funcionarios");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/funcionarios 128px.png"))); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Senha :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Cargo:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("CPF :");

        btnAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Deletar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnApagarCampos.setBackground(new java.awt.Color(204, 204, 204));
        btnApagarCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApagarCampos.setText("Limpar Campos");
        btnApagarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCamposActionPerformed(evt);
            }
        });

        btnCargo.add(btnGerente);
        btnGerente.setText("Gerente");
        btnGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenteActionPerformed(evt);
            }
        });

        btnCargo.add(btnMecanico);
        btnMecanico.setText("Mecanico");
        btnMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMecanicoActionPerformed(evt);
            }
        });

        btnCargo.add(btnAtendente);
        btnAtendente.setText("Atendente");
        btnAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtendenteActionPerformed(evt);
            }
        });

        tblFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Cargo", "Senha"
            }
        ));
        tblFunc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblFuncAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFunc);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                        .addComponent(txtNome))
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(btnGerente)
                                .addGap(18, 18, 18)
                                .addComponent(btnMecanico)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtendente)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addGap(39, 39, 39)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(33, 33, 33)
                                .addComponent(btnApagarCampos))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel2)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGerente)
                            .addComponent(btnMecanico)
                            .addComponent(btnAtendente))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApagarCampos)
                    .addComponent(btnDelete)
                    .addComponent(jButton4)
                    .addComponent(btnAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaGerente telaGer = new TelaGerente();
        telaGer.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel dtmTabela = (DefaultTableModel) tblFunc.getModel();
        Object id = dtmTabela.getValueAt(tblFunc.getSelectedRow(), 0);
        try {
            String sql = "delete from tbl_funcionario where Id_Funcionario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setObject(1, id);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Deletado");
            atualizarTabela();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }     
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenteActionPerformed
        func.setCargo("Gerente");
    }//GEN-LAST:event_btnGerenteActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        func.setNome(txtNome.getText());
        func.setCPF(txtCPF.getText());
        func.setSenha(txtSenha.getText());
        func.setCargo(cargoAtual());

        cadastrarFuncionario(func.getNome(), func.getCPF(), func.getCargo(), func.getSenha());
        atualizarTabela();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMecanicoActionPerformed
        func.setCargo("Mecanico");
    }//GEN-LAST:event_btnMecanicoActionPerformed

    private void btnAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtendenteActionPerformed
        func.setCargo("Atendente");
    }//GEN-LAST:event_btnAtendenteActionPerformed

    private void tblFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblFunc.getModel();
        int selectedRowIndex = tblFunc.getSelectedRow();

        txtNome.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtCPF.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtSenha.setText(model.getValueAt(selectedRowIndex, 4).toString());
        String cargo = model.getValueAt(selectedRowIndex, 3).toString();
        switch (cargo) {
            case "Atendente" -> {
                btnAtendente.setSelected(true);
            }
            case "Mecanico" -> {
                btnMecanico.setSelected(true);
            }
            case "Gerente" -> {
                btnGerente.setSelected(true);
            }
        }
    }//GEN-LAST:event_tblFuncMouseClicked

    private void tblFuncAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblFuncAncestorAdded
        atualizarTabela();
    }//GEN-LAST:event_tblFuncAncestorAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tblFunc.getModel();
            int selectedRowIndex = tblFunc.getSelectedRow();

            String sql = " UPDATE tbl_funcionario SET Nome = ?, CPF = ?, Cargo = ?, Senha = ? WHERE Id_Funcionario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtNome.getText());
            pstm.setString(2, txtCPF.getText());
            pstm.setString(3, cargoAtual());
            pstm.setString(4, txtSenha.getText());
            pstm.setString(5, model.getValueAt(selectedRowIndex, 0).toString());
            JOptionPane.showMessageDialog(null, "Atualizado");

            pstm.execute();
            atualizarTabela();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code her
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnApagarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCamposActionPerformed
        txtNome.setText("");
        txtCPF.setText("");
        txtSenha.setText("");
        btnCargo.clearSelection();
    }//GEN-LAST:event_btnApagarCamposActionPerformed

    public void cadastrarFuncionario(String nome, String cpf, String cargo, String senha) {
        String sql = "insert into tbl_funcionario (Nome, CPF, Cargo, Senha) values (?,?,?,?)";

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, nome);
            pstm.setString(2, cpf);
            pstm.setString(3, cargo);
            pstm.setString(4, senha);

            pstm.execute();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na view : " + erro);
        }
    }

    public String cargoAtual() {
        if (btnAtendente.isSelected()) {
            return "Atendente";
        } else if (btnGerente.isSelected()) {
            return "Gerente";
        } else if (btnMecanico.isSelected()) {
            return "Mecanico";
        } else {
            return "";
        }
    }

    public void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tblFunc.getModel();
        ArrayList<Funcionario> lista = new ArrayList();
        model.getDataVector().removeAllElements();
        try {

            String sql = "select * from tbl_funcionario";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            lista.clear();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("Id_Funcionario"));
                funcionario.setNome(rs.getString("Nome"));
                funcionario.setCargo(rs.getString("Cargo"));
                funcionario.setSenha(rs.getString("Senha"));
                funcionario.setCPF(rs.getString("CPF"));
                lista.add(funcionario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        for (Funcionario f : lista) {
            Object[] dados = {f.getId(), f.getNome(), f.getCPF(), f.getCargo(), f.getSenha()};
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
            java.util.logging.Logger.getLogger(GerenciamentoDosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoDosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoDosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoDosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoDosFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagarCampos;
    private javax.swing.JRadioButton btnAtendente;
    private javax.swing.ButtonGroup btnCargo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JRadioButton btnGerente;
    private javax.swing.JRadioButton btnMecanico;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblFunc;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void btnAtendente(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
