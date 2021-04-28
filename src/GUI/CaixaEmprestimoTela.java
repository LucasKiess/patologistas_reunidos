
package GUI;

import Beans.EmprestimoBeans;
import Controller.EmprestimoController;
import Utilitarios.Corretores;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class CaixaEmprestimoTela extends javax.swing.JInternalFrame {

    Date data;
    EmprestimoBeans emprestimoB;
    EmprestimoController emprestimoC;
    DefaultTableModel Modelo;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public CaixaEmprestimoTela(){
        initComponents();
        
        
        
        emprestimoB = new EmprestimoBeans();
        emprestimoC = new EmprestimoController();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = new Date();
        
        Modelo = (DefaultTableModel) tblLista.getModel();
        tblLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        String dataAtual = formato.format(data);
        txtData.setDate(data);
        
        calcularPendente();
    }
    
    final void apresentarRegistros(){
        Modelo.setNumRows(0);
        emprestimoC.controlePesquisa(Modelo);
    }
    
    final void calcularPendente(){
        String Situacao = "Pendente";
        double total = emprestimoC.controleTotalPendente(Situacao);
        txtTotal.setText(String.valueOf(total));        
        apresentarRegistros();
    }

    final void popularBeans(){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(txtData.getDate());
        String dataFormatadaSQL = Corretores.ConverterParaSQL(dataFormatada);
        String situacao;
        
        if(rbPendente.isSelected()){
            situacao = "Pendente";
        }else{
            situacao = "Pago";
        }
       emprestimoB.setNome(txtNome.getText());
       emprestimoB.setValor(Double.parseDouble(txtValor.getText().replace(",",".")));
       emprestimoB.setData(dataFormatadaSQL);
       emprestimoB.setSituacao(situacao);
        
    }
    
    final void limparCampos(){
        txtCod.setText("");
        txtNome.setText("");
        txtValor.setText("0");
        txtData.setDate(data);
        rbPendente.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        rbPendente = new javax.swing.JRadioButton();
        rbPago = new javax.swing.JRadioButton();
        btnRegistra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empréstimo - Caixa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista completa");

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Registro", "Pessoa", "Valor", "Data", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblListaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblLista);
        if (tblLista.getColumnModel().getColumnCount() > 0) {
            tblLista.getColumnModel().getColumn(0).setResizable(false);
            tblLista.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblLista.getColumnModel().getColumn(1).setResizable(false);
            tblLista.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblLista.getColumnModel().getColumn(2).setResizable(false);
            tblLista.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblLista.getColumnModel().getColumn(3).setResizable(false);
            tblLista.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblLista.getColumnModel().getColumn(4).setResizable(false);
            tblLista.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_refresh.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Total pendente");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Novo registro");

        jLabel4.setText("Cod:");

        jLabel5.setText("Nome:");

        jLabel6.setText("Valor");

        jLabel7.setText("Data");

        jLabel8.setText("Situação");

        buttonGroup1.add(rbPendente);
        rbPendente.setSelected(true);
        rbPendente.setText("Pendente");

        buttonGroup1.add(rbPago);
        rbPago.setText("Pago");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(btnRegistra)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnEdita))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbPendente)))
                                .addGap(18, 18, 18)
                                .addComponent(rbPago)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(rbPendente)
                        .addComponent(rbPago))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdita, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(400, 20, 550, 598);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraActionPerformed
        // TODO add your handling code here:
        popularBeans();
        boolean confirma = emprestimoC.verificarDados(emprestimoB);
        if(confirma == true){
            limparCampos();
            apresentarRegistros();
            calcularPendente();
        }
    }//GEN-LAST:event_btnRegistraActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        // TODO add your handling code here:
        popularBeans();
        boolean confirma = emprestimoC.verificarDadosEditar(emprestimoB);
        if(confirma == true){
           limparCampos();
           btnRegistra.setEnabled(true);
           btnEdita.setEnabled(false);
           apresentarRegistros();
           calcularPendente();
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void tblListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMousePressed
        // TODO add your handling code here:
        emprestimoB = emprestimoC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tblLista.getSelectedRow(), 0).toString()));
        txtCod.setText(emprestimoB.getCodigo()+"");
        txtNome.setText(emprestimoB.getNome());
        txtValor.setText(emprestimoB.getValor().toString().replace(".", ","));
        try {
            txtData.setDate(formato.parse(emprestimoB.getData()));
        } catch (ParseException ex) {
            Logger.getLogger(CaixaEntradaTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        String situacao = emprestimoB.getSituacao();
        if(situacao.equals("Pendente")){
            rbPendente.setSelected(true);
        }else{
            rbPago.setSelected(true);
        }
        btnEdita.setEnabled(true);
        btnRegistra.setEnabled(false);
    }//GEN-LAST:event_tblListaMousePressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        apresentarRegistros();
        btnEdita.setEnabled(false);
        limparCampos();
        String Situacao = "Pendente";
        double total = emprestimoC.controleTotalPendente(Situacao);
        txtTotal.setText(String.valueOf(total));        
        apresentarRegistros();
        calcularPendente();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegistra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbPago;
    private javax.swing.JRadioButton rbPendente;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtCod;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
