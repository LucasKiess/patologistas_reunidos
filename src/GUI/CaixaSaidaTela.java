
package GUI;

import Beans.CaixaBeans;
import Controller.CaixaController;
import Utilitarios.Corretores;
import Utilitarios.LimiteDigitos;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class CaixaSaidaTela extends javax.swing.JInternalFrame {

    CaixaController caixaC;
    CaixaBeans caixaB;
    DefaultTableModel Modelo;
    Date Data;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public CaixaSaidaTela() {
        initComponents();
        
        
        tblCaixa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        caixaC = new CaixaController();
        caixaB = new CaixaBeans();
        Modelo = (DefaultTableModel) tblCaixa.getModel();
        
        limpaCampos();
        apresentarRegistros();
        somarTotal();
        
    }
    
    final void popularBeans(){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(txtData.getDate());
        String dataSQL = Corretores.ConverterParaSQL(dataFormatada);
        
        caixaB.setDescricao(txtDescricao.getText());
        caixaB.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
        caixaB.setData(dataSQL);
       
    }
    
    final void limpaCampos(){
        txtCod.setText("");
        txtDescricao.setText("");
        txtValor.setText("0");
        txtDataInicio.setDate(null);
        txtDataFim.setDate(null);
    }
    
    final void somarTotal(){
        Double soma = 0.0;
        String somaAux = "";
        DecimalFormat df = new DecimalFormat("##.##");
       try{
        for(int i=0; i< tblCaixa.getRowCount(); i++){
            somaAux = String.valueOf(tblCaixa.getValueAt(i, 2));
            soma = soma + Double.parseDouble(somaAux);
            
        }
           txtTotal.setText(df.format(soma)+"");
            
       }catch(Exception e){
           System.out.println(e);
       }
           
    }
    final void apresentarRegistros(){
        Modelo.setNumRows(0);
        caixaC.controlePesquisaSaida(Modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaixa = new javax.swing.JTable();
        txtDataInicio = new com.toedter.calendar.JDateChooser();
        txtDataFim = new com.toedter.calendar.JDateChooser();
        btnBusca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        btnRegistra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnDeleta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Entrada de Despesa - Caixa");

        tblCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Registro", "Descrição", "Valor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCaixaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCaixa);
        if (tblCaixa.getColumnModel().getColumnCount() > 0) {
            tblCaixa.getColumnModel().getColumn(0).setResizable(false);
            tblCaixa.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCaixa.getColumnModel().getColumn(1).setResizable(false);
            tblCaixa.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCaixa.getColumnModel().getColumn(2).setResizable(false);
            tblCaixa.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblCaixa.getColumnModel().getColumn(3).setResizable(false);
            tblCaixa.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Busque registros específicos pelo intervalo de datas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 0));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBusca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBusca)
                        .addComponent(btnReset)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Novo Registro");

        jLabel4.setText("Nº Registro");

        txtCod.setEnabled(false);

        jLabel5.setText("Descrição");

        jLabel6.setText("Valor");

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        jLabel7.setText("Data");

        btnRegistra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraActionPerformed(evt);
            }
        });

        btnEdita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_edit.png"))); // NOI18N
        btnEdita.setEnabled(false);
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });

        btnDeleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_del.png"))); // NOI18N
        btnDeleta.setEnabled(false);
        btnDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescricao))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(41, 41, 41)
                                .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnEdita)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeleta)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistra)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleta)
                    .addComponent(btnEdita))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))))
        );

        setBounds(250, 80, 897, 509);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        if((txtDataInicio.getDate() == null)||(txtDataFim.getDate() == null)){
            JOptionPane.showMessageDialog(null, "Os campos data são obrigatórios.","Atenção",1);
        }else{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dataInicio = formato.format(txtDataInicio.getDate());
            String dataFim = formato.format(txtDataFim.getDate());
            String dataInicioSQL = Corretores.ConverterParaSQL(dataInicio);
            String dataFimSQL = Corretores.ConverterParaSQL(dataFim);

            Modelo.setNumRows(0);
            caixaC.controlePesquisaEntreDataCaixaSaida(Modelo, dataInicioSQL, dataFimSQL);
            somarTotal();
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraActionPerformed
        // botão de registrar
        //verificação se o campo data está vazio
        if(txtData.getDate() == null){
            JOptionPane.showMessageDialog(null, "O campo data é obrigatório.","Atenção",2);
        }else{
            popularBeans();
            boolean confirma = caixaC.verificaDadosCaixaSaida(caixaB);
            if(confirma == true){
                limpaCampos();
                apresentarRegistros();
                somarTotal();
                btnEdita.setEnabled(false);
                btnDeleta.setEnabled(false);
                txtDescricao.grabFocus();
            }
        }
    }//GEN-LAST:event_btnRegistraActionPerformed

    private void tblCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCaixaMousePressed
        // evento de clique na tabela
        caixaB = caixaC.controlePreencherCamposSaida(Integer.parseInt(Modelo.getValueAt(tblCaixa.getSelectedRow(), 0).toString()));
        txtCod.setText(caixaB.getCodigo()+"");
        txtDescricao.setText(caixaB.getDescricao());
        txtValor.setText(caixaB.getValor().toString().replace(".", ","));
        try {
            txtData.setDate(formato.parse(caixaB.getData()));
        } catch (ParseException ex) {
            Logger.getLogger(CaixaSaidaTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        btnRegistra.setEnabled(false);
        btnEdita.setEnabled(true);
        btnDeleta.setEnabled(true);
    }//GEN-LAST:event_tblCaixaMousePressed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
        String caracAceitos = "0987654321,";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        // TODO add your handling code here:
        popularBeans();
        boolean confirma = caixaC.verificaDadosEditarCaixaSaida(caixaB);
        if(confirma == true){
            limpaCampos();
            apresentarRegistros();
            somarTotal();
            btnRegistra.setEnabled(true);
            btnEdita.setEnabled(false);
            btnDeleta.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaActionPerformed
        // TODO add your handling code here:
        popularBeans();
        caixaC.controleExcluiCaixaSaida(caixaB);
        limpaCampos();
        apresentarRegistros();
        somarTotal();
        btnRegistra.setEnabled(true);
        btnEdita.setEnabled(false);
        btnDeleta.setEnabled(false);
    }//GEN-LAST:event_btnDeletaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        apresentarRegistros();
        limpaCampos();
        somarTotal();
        btnRegistra.setEnabled(true);
        btnEdita.setEnabled(false);
        btnDeleta.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnDeleta;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnRegistra;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCaixa;
    private javax.swing.JTextField txtCod;
    private com.toedter.calendar.JDateChooser txtData;
    private com.toedter.calendar.JDateChooser txtDataFim;
    private com.toedter.calendar.JDateChooser txtDataInicio;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
