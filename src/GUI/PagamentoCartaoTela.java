
package GUI;

import Beans.PagamentoCartaoBeans;
import Controller.PagamentoCartaoController;
import Utilitarios.Corretores;
import Utilitarios.LimiteDigitos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class PagamentoCartaoTela extends javax.swing.JInternalFrame {

    
    DefaultTableModel Modelo;
    PagamentoCartaoController pagamentoC;
    PagamentoCartaoBeans pagamentoB;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public PagamentoCartaoTela() {
        initComponents();
        
        
        txtCpf.setDocument(new LimiteDigitos(14));
        txtCep.setDocument(new LimiteDigitos(9));
        btnExclui.setEnabled(false);
        pagamentoB = new PagamentoCartaoBeans();
        pagamentoC = new PagamentoCartaoController();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/aaaa");
        Modelo = (DefaultTableModel) tblRegistros.getModel();
        tblRegistros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        apresentarRegistros();
    }

    final void popularBeans(String cpfPronto,String cepPronto,String dataFormatadaSQL){
        pagamentoB.setExame(txtExame.getText());
        pagamentoB.setPaciente(txtPaciente.getText());
        pagamentoB.setCPF(cpfPronto);
        pagamentoB.setEndereco(txtEndereco.getText());
        pagamentoB.setCEP(cepPronto);
        pagamentoB.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
        pagamentoB.setData(dataFormatadaSQL);
    }
    
    final void limparCampos(){
       txtCodigo.setText("");
       txtExame.setText("");
       txtPaciente.setText("");
       txtCpf.setText("");
       txtEndereco.setText("");
       txtCep.setText("");
       txtValor.setText("");
       txtData.setDate(null);
       txtBuscaNome.setText("");
       txtBuscaExame.setText("");
       txtDataInicio.setDate(null);
       txtDataFim.setDate(null);
    }
    
    final void apresentarRegistros(){
        Modelo.setNumRows(0);
        pagamentoC.controleDePesquisa(Modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtExame = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtData = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        btnRegistra = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBuscaExame = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDataInicio = new com.toedter.calendar.JDateChooser();
        txtDataFim = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        btnBuscaData = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtDataInicio1 = new com.toedter.calendar.JDateChooser();
        txtDataFim1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGeraRelatorio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pagamentos com Cartão - Patologistas Reunidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setText("ID:");

        txtCodigo.setEditable(false);

        jLabel2.setText("Exame:");

        jLabel3.setText("Paciente:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Endereço completo:");

        jLabel6.setText("CEP:");

        jLabel7.setText("Valor:");

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        jLabel8.setText("Data:");

        btnRegistra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraActionPerformed(evt);
            }
        });

        btnExclui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_del.png"))); // NOI18N
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });

        btnLimpa.setText("Limpar");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEndereco))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtExame, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnRegistra)
                .addGap(117, 117, 117)
                .addComponent(btnExclui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpa)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistra)
                    .addComponent(btnExclui)
                    .addComponent(btnLimpa))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exame", "Paciente", "CPF", "Endereço", "CEP", "Valor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.getTableHeader().setReorderingAllowed(false);
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRegistrosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setResizable(false);
            tblRegistros.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRegistros.getColumnModel().getColumn(1).setResizable(false);
            tblRegistros.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblRegistros.getColumnModel().getColumn(2).setResizable(false);
            tblRegistros.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblRegistros.getColumnModel().getColumn(3).setResizable(false);
            tblRegistros.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblRegistros.getColumnModel().getColumn(4).setResizable(false);
            tblRegistros.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblRegistros.getColumnModel().getColumn(5).setResizable(false);
            tblRegistros.getColumnModel().getColumn(5).setPreferredWidth(30);
            tblRegistros.getColumnModel().getColumn(6).setResizable(false);
            tblRegistros.getColumnModel().getColumn(6).setPreferredWidth(20);
            tblRegistros.getColumnModel().getColumn(7).setResizable(false);
            tblRegistros.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        jLabel9.setText("Busca por nome:");

        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });

        jLabel10.setText("Busca por exame:");

        txtBuscaExame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaExameKeyReleased(evt);
            }
        });

        jLabel11.setText("Busca entre datas:");

        jLabel12.setText("-");

        btnBuscaData.setText("Buscar");
        btnBuscaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscaData))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtBuscaExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscaData, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel13.setText("Selecione o período:");

        jLabel14.setText("Início:");

        jLabel15.setText("Final:");

        btnGeraRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_report.png"))); // NOI18N
        btnGeraRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataFim1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeraRelatorio)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txtDataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataFim1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addComponent(btnGeraRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        setBounds(120, 10, 1100, 631);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraActionPerformed
        // botão para inserir
        if(!txtExame.getText().equals("")&&
           !txtPaciente.getText().equals("") &&
           !txtCpf.getText().equals("") &&
           !txtEndereco.getText().equals("") &&
           !txtCep.getText().equals("") && 
           !txtValor.getText().equals("") &&
           txtData.getDate() != null){
            //formatação do cpf
            String cpf = txtCpf.getText();
            String cpfPronto = cpf.substring(0, 3)+"."+cpf.substring(3, 6)+"."+cpf.substring(6, 9)+"-"+cpf.substring(9, 11);
            //formatação do cep
            String cep = txtCep.getText();
            String cepPronto = cep.substring(0,5)+"-"+cep.substring(5, 8);
            //formatação da data
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formato.format(txtData.getDate());
            String dataFormatadaSQL = Corretores.ConverterParaSQL(dataFormatada);
            
            popularBeans(cpfPronto,cepPronto,dataFormatadaSQL);
            boolean confirma = pagamentoC.verificaDados(pagamentoB);
            if(confirma == true){
                limparCampos();
                apresentarRegistros();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível registrar","Erro",0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos","Atenção",2);
        }
       
        
    }//GEN-LAST:event_btnRegistraActionPerformed

    private void tblRegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMousePressed
        // selecionando a tabela
        pagamentoB = pagamentoC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tblRegistros.getSelectedRow(), 0).toString()));
        txtCodigo.setText(pagamentoB.getCodigo()+"");
        txtExame.setText(pagamentoB.getExame());
        txtPaciente.setText(pagamentoB.getPaciente());
        txtCpf.setText(pagamentoB.getCPF());
        txtEndereco.setText(pagamentoB.getEndereco());
        txtCep.setText(pagamentoB.getCEP());
        txtValor.setText(pagamentoB.getValor().toString().replace(".", ","));
        try {
            txtData.setDate(formato.parse(pagamentoB.getData()));
        } catch (ParseException ex) {
            Logger.getLogger(CaixaEntradaTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnRegistra.setEnabled(false);
        btnExclui.setEnabled(true);
    }//GEN-LAST:event_tblRegistrosMousePressed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
        String caracAceitos = "0987654321,";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        // botão excluir
        //formatação do cpf
            String cpf = txtCpf.getText();
            String cpfPronto = cpf.substring(0, 3)+"."+cpf.substring(3, 6)+"."+cpf.substring(6, 9)+"-"+cpf.substring(9, 11);
            //formatação do cep
            String cep = txtCep.getText();
            String cepPronto = cep.substring(0,5)+"-"+cep.substring(5, 8);
            //formatação da data
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formato.format(txtData.getDate());
            String dataFormatadaSQL = Corretores.ConverterParaSQL(dataFormatada);
            
            popularBeans(cpfPronto,cepPronto,dataFormatadaSQL);
            pagamentoC.controleExclui(pagamentoB);
            limparCampos();
            apresentarRegistros();
            btnExclui.setEnabled(false);
            btnRegistra.setEnabled(true);
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        // botão de limpar
        limparCampos();
        apresentarRegistros();
        btnRegistra.setEnabled(true);
        btnExclui.setEnabled(false);
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
        // buscar pelo nome
       Modelo.setNumRows(0);
       pagamentoC.controlePesquisaDigitadaNome(txtBuscaNome.getText(), Modelo);
    }//GEN-LAST:event_txtBuscaNomeKeyReleased

    private void txtBuscaExameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaExameKeyReleased
        // buscar pelo exame
        Modelo.setNumRows(0);
        pagamentoC.controlePesquisaDigitadaExame(txtBuscaExame.getText(), Modelo);
    }//GEN-LAST:event_txtBuscaExameKeyReleased

    private void btnBuscaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaDataActionPerformed
        // buscar pela data
        if((txtDataInicio.getDate() == null)||(txtDataFim.getDate() == null)){
            JOptionPane.showMessageDialog(null, "Os campos data são obrigatórios.","Atenção",1);
        }else{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dataInicio = formato.format(txtDataInicio.getDate());
            String dataFim = formato.format(txtDataFim.getDate());
            String dataInicioSQL = Corretores.ConverterParaSQL(dataInicio);
            String dataFimSQL = Corretores.ConverterParaSQL(dataFim);

            Modelo.setNumRows(0);
            pagamentoC.controlePesquisaEntreDatas(Modelo, dataInicioSQL, dataFimSQL);
        }
    }//GEN-LAST:event_btnBuscaDataActionPerformed

    private void btnGeraRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraRelatorioActionPerformed
        //botao para gerar relatório
        if((txtDataInicio1.getDate() == null)||(txtDataFim1.getDate() == null)){
            JOptionPane.showMessageDialog(null, "Os campos data são obrigatórios!","Atenção",1);
        }else{
            SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
            String dataInicio = formato2.format(txtDataInicio1.getDate());
            String dataFim = formato2.format(txtDataFim1.getDate());
            String dataIniSQL = Corretores.ConverterParaSQL(dataInicio);
            String dataFimSQL = Corretores.ConverterParaSQL(dataFim);
            pagamentoC.verificaDataBuscaRelatorio(dataIniSQL, dataFimSQL);
        }
    }//GEN-LAST:event_btnGeraRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaData;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnGeraRelatorio;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnRegistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtBuscaExame;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtData;
    private com.toedter.calendar.JDateChooser txtDataFim;
    private com.toedter.calendar.JDateChooser txtDataFim1;
    private com.toedter.calendar.JDateChooser txtDataInicio;
    private com.toedter.calendar.JDateChooser txtDataInicio1;
    private javax.swing.JTextField txtEndereco;
    public javax.swing.JTextField txtExame;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
