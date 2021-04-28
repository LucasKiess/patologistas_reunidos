
package GUI;

import Beans.MateriaisBeans;
import Controller.MateriaisController;
import Utilitarios.Corretores;
import Utilitarios.LimiteDigitos;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class RegistraSaidaFrascoTela extends javax.swing.JFrame {

    Date DataAtual;
    SimpleDateFormat FormatoData; 
    MateriaisBeans materiaisB;
    MateriaisController materiaisC;
    int CodigoMaterial;
    
   
    public RegistraSaidaFrascoTela() {
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
    
    final void verificaQuantidade(){
        int qtd = Integer.parseInt(txtQtd.getText());
        String qtdAux = "0";
        if(cbFrasco.getSelectedItem().equals("Frasco Pequeno")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(0,2));
        }else if(cbFrasco.getSelectedItem().equals("Frasco Médio")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(1,2));
        }else if(cbFrasco.getSelectedItem().equals("Frasco Grande")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(2,2));
        }else if(cbFrasco.getSelectedItem().equals("Formol")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(3,2));
        }else if(cbFrasco.getSelectedItem().equals("Envelope CP")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(4,2));
        }else if(cbFrasco.getSelectedItem().equals("Lâmina")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(5,2));
        }else if(cbFrasco.getSelectedItem().equals("Requisição CP")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(6,2));
        }else if(cbFrasco.getSelectedItem().equals("Fixador")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(7,2));
        }else if(cbFrasco.getSelectedItem().equals("Escova Cervical")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(8,2));
        }else if(cbFrasco.getSelectedItem().equals("Espátula de Ayre")){
            qtdAux = String.valueOf(ControleMaterialTela.tblEstoque.getValueAt(9,2));
        }
        
        
        
        
        if(qtd > Integer.parseInt(qtdAux)){
            JOptionPane.showMessageDialog(null, "Não há estoque suficiente","Atenção",1);
            dispose();
        }else if(qtd <= Integer.parseInt(qtdAux)){
            popularBeans();
            boolean confirma = materiaisC.verificaDadosRegistraSaida(materiaisB);
            if(confirma == true){
               limparCampos();
               dispose(); 
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbFrasco = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnRegistraSaida = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saída de Frascos");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Selecione o tipo de material e a quantidade que está sendo enviada.");

        cbFrasco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Frasco Pequeno", "Frasco Médio", "Frasco Grande", "Formol", "Envelope CP", "Lâmina", "Requisição CP", "Fixador", "Escova Cervical", "Espátula de Ayre" }));

        jLabel2.setText("Quantidade:");

        txtQtd.setText("0");
        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdKeyTyped(evt);
            }
        });

        btnRegistraSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnRegistraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraSaidaActionPerformed(evt);
            }
        });

        jLabel3.setText("Data:");

        txtData.setEditable(false);

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
                                .addComponent(btnRegistraSaida)))))
                .addContainerGap(32, Short.MAX_VALUE))
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
                    .addComponent(btnRegistraSaida))
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

    private void btnRegistraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraSaidaActionPerformed
        // botão para registrar entrada
        verificaQuantidade();
    }//GEN-LAST:event_btnRegistraSaidaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistraSaidaFrascoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraSaidaFrascoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraSaidaFrascoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraSaidaFrascoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraSaidaFrascoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistraSaida;
    private javax.swing.JComboBox<String> cbFrasco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
