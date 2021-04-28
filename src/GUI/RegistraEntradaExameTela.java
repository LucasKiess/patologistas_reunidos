
package GUI;

import Beans.MateriaisBeans;
import Controller.MateriaisController;
import Utilitarios.Corretores;
import Utilitarios.LimiteDigitos;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class RegistraEntradaExameTela extends javax.swing.JFrame {

    Date DataAtual;
    SimpleDateFormat FormatoData; 
    MateriaisBeans materiaisB;
    MateriaisController materiaisC;
    int CodigoMaterial;
    
   
    public RegistraEntradaExameTela() {
        initComponents();
        DataAtual = new Date();
        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText(FormatoData.format(DataAtual));
        
        materiaisB = new MateriaisBeans();
        materiaisC = new MateriaisController();
        
        
        txtQtd.setDocument(new LimiteDigitos(2));
        
        limparCampos();
    }
    
    
    final void popularBeans(){
        materiaisB.setDescricao(cbFrasco.getSelectedItem().toString());
        materiaisB.setQuantidade(Integer.parseInt(txtQtd.getText()));
        materiaisB.setData(Corretores.ConverterParaSQL(txtData.getText()));
    }
    
    final void limparCampos(){
        cbFrasco.setSelectedIndex(0);
        txtQtd.setText("0");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbFrasco = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnRegistraEntrada = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada de Exames");
        setPreferredSize(new java.awt.Dimension(410, 206));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Selecione o tipo de material e a quantidade que foi recebida.");

        cbFrasco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Frasco Pequeno", "Frasco Médio", "Frasco Grande", "Envelope CP", "Lâmina", "Requisição CP" }));
        cbFrasco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbFrascoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbFrascoMouseClicked(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        txtQtd.setText("0");
        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdKeyTyped(evt);
            }
        });

        btnRegistraEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnRegistraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraEntradaActionPerformed(evt);
            }
        });

        jLabel3.setText("Data:");

        txtData.setEditable(false);
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtData))
                            .addComponent(cbFrasco, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnRegistraEntrada)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFrasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistraEntrada))
                .addGap(68, 68, 68))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyTyped
        //
        String caracAceitos = "0987654321";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtQtdKeyTyped

    private void btnRegistraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraEntradaActionPerformed
        // botão para registrar entrada
        popularBeans();
        boolean confirma = materiaisC.verificaDadosRegistraEntrada(materiaisB);
        if(confirma == true){
           limparCampos();
           dispose(); 
        }
        
    }//GEN-LAST:event_btnRegistraEntradaActionPerformed

    private void txtDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataKeyTyped

    private void cbFrascoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFrascoMousePressed
        
    }//GEN-LAST:event_cbFrascoMousePressed

    private void cbFrascoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFrascoMouseClicked
       // quando selecionar o cb muda o código no campo de texto
        
    }//GEN-LAST:event_cbFrascoMouseClicked

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
            java.util.logging.Logger.getLogger(RegistraEntradaExameTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraEntradaExameTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraEntradaExameTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraEntradaExameTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraEntradaExameTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistraEntrada;
    private javax.swing.JComboBox<String> cbFrasco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
