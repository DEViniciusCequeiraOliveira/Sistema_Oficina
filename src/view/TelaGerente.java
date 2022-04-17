/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;

/**
 *
 * @author janae
 */
public class TelaGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerente
     */
    public TelaGerente() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGerenFuncio = new javax.swing.JButton();
        BotaoOrdenGerente = new javax.swing.JButton();
        ButaoClienteGerente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Gerente");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/gerentes 128px.png"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);

        btnGerenFuncio.setBackground(new java.awt.Color(204, 204, 204));
        btnGerenFuncio.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnGerenFuncio.setText("Funcionarios");
        btnGerenFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenFuncioActionPerformed(evt);
            }
        });

        BotaoOrdenGerente.setBackground(new java.awt.Color(204, 204, 204));
        BotaoOrdenGerente.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        BotaoOrdenGerente.setText("Ordem de Serviço");
        BotaoOrdenGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOrdenGerenteActionPerformed(evt);
            }
        });

        ButaoClienteGerente.setBackground(new java.awt.Color(204, 204, 204));
        ButaoClienteGerente.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        ButaoClienteGerente.setText("Clientes");
        ButaoClienteGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoClienteGerenteActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/grupo-de-pessoas-16px.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/servico 16px.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setForeground(new java.awt.Color(50, 205, 50));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/cliente 16px.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ButaoClienteGerente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGerenFuncio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoOrdenGerente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSair)
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnGerenFuncio))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoOrdenGerente)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ButaoClienteGerente)))
                    .addComponent(jLabel4))
                .addGap(30, 30, 30))
        );

        btnGerenFuncio.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        TelaLogin tlLogin = new TelaLogin();
        tlLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void ButaoClienteGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoClienteGerenteActionPerformed
        VerCliente verClien = new VerCliente();
        verClien.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButaoClienteGerenteActionPerformed

    private void BotaoOrdenGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOrdenGerenteActionPerformed
        OrdemDeServico ordServ = new OrdemDeServico();
        ordServ.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoOrdenGerenteActionPerformed

    private void btnGerenFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenFuncioActionPerformed
        GerenciamentoDosFuncionarios genFunc = new GerenciamentoDosFuncionarios();
        genFunc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGerenFuncioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoOrdenGerente;
    private javax.swing.JButton ButaoClienteGerente;
    private javax.swing.JButton btnGerenFuncio;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assets/essavai.png")));
    }
}
