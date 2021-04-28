
package GUI;

import Beans.MateriaisBeans;
import Controller.MateriaisController;
import Utilitarios.LimiteDigitos;

/**
 *
 * @author lucas
 */
public class InsereEstoqueTela extends javax.swing.JFrame {

    MateriaisBeans materiaisB;
    MateriaisController materiaisC;
    
    
    public InsereEstoqueTela() {
        initComponents();
        
        materiaisB = new MateriaisBeans();
        materiaisC = new MateriaisController();
        
        txtQtd.setDocument(new LimiteDigitos(2));
    }

    final void popularBeans(){
        materiaisB.setDescricao(cbFrasco.getSelectedItem().toString());
        materiaisB.setQuantidade(Integer.parseInt(txtQtd.getText()));
    }
    
    final void limparCampos(){
        cbFrasco.setSelectedIndex(0);
        txtQtd.setText("0");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbFrasco = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnInsere = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserção de Estoque");
        setResizable(false);

        cbFrasco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Frasco Pequeno", "Frasco Médio", "Frasco Grande", "Formol", "Envelope CP", "Lâmina", "Requisição CP", "Fixador", "Escova Cervical", "Espátula de Ayre" }));

        jLabel2.setText("Quantidade:");

        txtQtd.setText("0");
        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdKeyTyped(evt);
            }
        });

        btnInsere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnInsere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsereActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Selecione o tipo de material e a quantidade a ser inserida.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInsere)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(cbFrasco, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFrasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsere)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsereActionPerformed
        // botão para inserir estoque
        popularBeans();
        boolean confirma = materiaisC.verificaDadosInsereEstoque(materiaisB);
        if(confirma == true){
            limparCampos();
            dispose();
        }
    }//GEN-LAST:event_btnInsereActionPerformed

    private void txtQtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyTyped
        // 
        String caracAceitos = "0987654321";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtQtdKeyTyped

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
            java.util.logging.Logger.getLogger(InsereEstoqueTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsereEstoqueTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsereEstoqueTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsereEstoqueTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsereEstoqueTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsere;
    private javax.swing.JComboBox<String> cbFrasco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
