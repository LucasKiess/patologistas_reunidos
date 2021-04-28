
package GUI;

import Utilitarios.LimiteDigitos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Beans.ListaTelefonicaBeans;
import Controller.ListaTelefonicaController;
import javax.swing.ListSelectionModel;

/**
 *
 * @author lucas
 */
public class ListaTelefonicaTela extends javax.swing.JInternalFrame {

    ListaTelefonicaBeans listaB;
    ListaTelefonicaController listaC;
    
    String CelularCompleto;
    String CelularPreHifen;
    String CelularPosHifen;
    String TelefoneCompleto;
    String TelefonePreHifen;
    String TelefonePosHifen;
    String DDDCelVolta;
    String CelularVoltaPreHifen;
    String CelularVoltaPosHifen;
    String CelularVoltaPronto;
    String DDDTelVolta;
    String TelefoneVoltaPreHifen;
    String TelefoneVoltaPosHifen;
    String TelefoneVoltaPronto;
    
    DefaultTableModel Modelo;
    
    
    public ListaTelefonicaTela() {
        initComponents();
        
        listaC = new ListaTelefonicaController();
        listaB = new ListaTelefonicaBeans();
        
        Modelo = (DefaultTableModel) tblContatos.getModel();
        
        txtDDDCel.setDocument(new LimiteDigitos(2));
        txtDDDTel.setDocument(new LimiteDigitos(2));
        txtTelefone.setDocument(new LimiteDigitos(8));
        txtCelular.setDocument(new LimiteDigitos(9));
        
        //chamando o metodo para popular a tabela assim que abrir a tela
        Modelo.setNumRows(0);
        listaC.controlePesquisa(Modelo);
        
        //fazendo com que a tabela só aceite uma seleção por vez
        tblContatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        limpaCampos();
        habilitarBotao(false);
        habilitarCampos(false);
       
    }
    
    
    
    final void tratarCelularCadastrar(){
        if(txtDDDCel.getText().equals("") && txtCelular.getText().equals("")){
            CelularCompleto = "";
        }else{
            CelularPreHifen = txtCelular.getText().substring(0, 5);
            CelularPosHifen = txtCelular.getText().substring(5, 9);
            CelularCompleto = "("+txtDDDCel.getText()+") "+CelularPreHifen+"-"+CelularPosHifen;
        }
    }
    
    //capta a string voltando do banco e retira os caracteres especiais
    final void tratarCelularPreencherCampo(){
        String celularFormatar = listaB.getCelular();
        if(!celularFormatar.equals("")){
            DDDCelVolta = celularFormatar.substring(1, 3);
            CelularVoltaPreHifen = celularFormatar.substring(5, 10);
            CelularVoltaPosHifen = celularFormatar.substring(11, 15);
            CelularVoltaPronto = CelularVoltaPreHifen+CelularVoltaPosHifen;
        }else{
            DDDCelVolta = "";
            CelularVoltaPronto ="";
        }
    }
    
    final void tratarTelefoneCadastrar(){
        if(txtDDDTel.getText().equals("") && txtTelefone.getText().equals("")){
            TelefoneCompleto = "";
        }else{
            TelefonePreHifen = txtTelefone.getText().substring(0,4);
            TelefonePosHifen = txtTelefone.getText().substring(4, 8);
            TelefoneCompleto = "("+txtDDDTel.getText()+") "+TelefonePreHifen+"-"+TelefonePosHifen;
        }
    }
    
    //capta a string voltando do banco e retira os caracteres especiais
    final void tratarTelefonePreencherCampo(){
        String telefoneFormatar = listaB.getTelefone();
        if(!telefoneFormatar.equals("")){
            DDDTelVolta = telefoneFormatar.substring(1, 3);
            TelefoneVoltaPreHifen = telefoneFormatar.substring(5, 9);
            TelefoneVoltaPosHifen = telefoneFormatar.substring(10, 14);
            TelefoneVoltaPronto = TelefoneVoltaPreHifen+TelefoneVoltaPosHifen;
        }else{
            DDDTelVolta = "";
            TelefoneVoltaPronto ="";
        }
    }
    
    
    
    final void popularBeans(){
        listaB.setNome(txtNomeTelefone.getText());
        listaB.setCelular(CelularCompleto);
        listaB.setTelefone(TelefoneCompleto);
        listaB.setDetalhes(txtDetalhesTelefone.getText());
    }
    
    final void limpaCampos(){
        txtCodTelefone.setText("");
        txtNomeTelefone.setText("");
        txtDDDCel.setText("");
        txtCelular.setText("");
        txtDDDTel.setText("");
        txtTelefone.setText("");
        txtDetalhesTelefone.setText("");
    }
    
    final void habilitarCampos(boolean valor){
        txtNomeTelefone.setEnabled(valor);
        txtDDDCel.setEnabled(valor);
        txtCelular.setEnabled(valor);
        txtDDDTel.setEnabled(valor);
        txtTelefone.setEnabled(valor);
        txtDetalhesTelefone.setEnabled(valor);
    }
    
    final void habilitarBotao(boolean valor){
        btnAdiciona.setEnabled(false);
        btnEdita.setEnabled(false);
        btnExclui.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodTelefone = new javax.swing.JTextField();
        txtNomeTelefone = new javax.swing.JTextField();
        txtDetalhesTelefone = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAdiciona = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLimpa = new javax.swing.JButton();
        txtTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDDDCel = new javax.swing.JTextField();
        txtDDDTel = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContatos = new javax.swing.JTable();
        txtBuscaContato = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista Telefônica - Patologistas Reunidos");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Nº registro:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Celular:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Detalhes:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        txtCodTelefone.setEditable(false);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_add2.png"))); // NOI18N
        btnNovo.setToolTipText("Novo Registro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnAdiciona.setToolTipText("Inserir");
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });

        btnEdita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_edit.png"))); // NOI18N
        btnEdita.setToolTipText("Editar");
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });

        btnExclui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_del.png"))); // NOI18N
        btnExclui.setToolTipText("Excluir");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Para inserir novo, clique no botão +");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Para limpar campos, clique no botão X");

        btnLimpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_limpa.png"))); // NOI18N
        btnLimpa.setToolTipText("Limpar campos");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        txtDDDCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDDDCelKeyTyped(evt);
            }
        });

        txtDDDTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDDDTelKeyTyped(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Somente");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("números");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnAdiciona)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdita)
                                .addGap(18, 18, 18)
                                .addComponent(btnExclui))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDetalhesTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomeTelefone)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtDDDCel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDDDTel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDDDCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDDDTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addGap(10, 10, 10)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDetalhesTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdiciona)
                    .addComponent(btnEdita)
                    .addComponent(btnExclui))
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addComponent(btnLimpa))
                .addGap(16, 16, 16))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contatos"));

        tblContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Nome", "Celular", "Telefone", "Detalhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblContatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblContatos);
        if (tblContatos.getColumnModel().getColumnCount() > 0) {
            tblContatos.getColumnModel().getColumn(0).setResizable(false);
            tblContatos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblContatos.getColumnModel().getColumn(1).setResizable(false);
            tblContatos.getColumnModel().getColumn(1).setPreferredWidth(170);
            tblContatos.getColumnModel().getColumn(2).setResizable(false);
            tblContatos.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblContatos.getColumnModel().getColumn(3).setResizable(false);
            tblContatos.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblContatos.getColumnModel().getColumn(4).setResizable(false);
            tblContatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        txtBuscaContato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaContatoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaContatoKeyReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_busca.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Procure o contato pelo nome, ou selecione um contato para editar/remover.");

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
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBuscaContato, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(0, 309, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtBuscaContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        // botao limpa campos:
        limpaCampos();
        habilitarBotao(false);
        habilitarCampos(false);
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        // botao de cadastro
        //o primeiro if verificar se o ddd é diferente de vazio e se tem menos que 2 caracteres, se verdadeiro exibe a mensagem
        if(!txtDDDCel.getText().equals("") && txtDDDCel.getText().length()< 2 || !txtDDDTel.getText().equals("")&& txtDDDTel.getText().length()<2){
            JOptionPane.showMessageDialog(null, "O DDD está incorreto","Atenção",1);
        }else{
            tratarCelularCadastrar();
            tratarTelefoneCadastrar();
            popularBeans();
            boolean confirma = listaC.verificarDados(listaB);
            if(confirma == true){
                limpaCampos();
                habilitarBotao(false);
                habilitarCampos(false);
                Modelo.setNumRows(0);
                listaC.controlePesquisa(Modelo);
            }
        }
    }//GEN-LAST:event_btnAdicionaActionPerformed

    private void txtDDDCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDCelKeyTyped
        // evento para aceitar somente número
        String caracAceitos = "0987654321";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtDDDCelKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        // evento para aceitar somente número
        String caracAceitos = "0987654321";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtDDDTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDTelKeyTyped
        // evento para aceitar somente número
        String caracAceitos = "0987654321";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtDDDTelKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        // evento para aceitar somente número
        String caracAceitos = "0987654321";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // botão novo registro
        limpaCampos();
        habilitarCampos(true);
        btnAdiciona.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tblContatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContatosMousePressed
        // evento de clique na tabela
        listaB = listaC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tblContatos.getSelectedRow(), 0).toString()));
        tratarCelularPreencherCampo();
        tratarTelefonePreencherCampo();
        txtCodTelefone.setText(listaB.getCodigo()+"");
        txtNomeTelefone.setText(listaB.getNome());
        txtDDDCel.setText(DDDCelVolta);
        txtCelular.setText(CelularVoltaPronto);
        txtDDDTel.setText(DDDTelVolta);
        txtTelefone.setText(TelefoneVoltaPronto);
        txtDetalhesTelefone.setText(listaB.getDetalhes());
        habilitarCampos(true);
        btnEdita.setEnabled(true);
        btnExclui.setEnabled(true);
    }//GEN-LAST:event_tblContatosMousePressed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        // botão para editar
        //o primeiro if verificar se o ddd é diferente de vazio e se tem menos que 2 caracteres, se verdadeiro exibe a mensagem
        if(!txtDDDCel.getText().equals("") && txtDDDCel.getText().length()< 2 || !txtDDDTel.getText().equals("")&& txtDDDTel.getText().length()<2){
            JOptionPane.showMessageDialog(null, "O DDD está incorreto","Atenção",1);
        }else{
            tratarCelularCadastrar();
            tratarTelefoneCadastrar();
            popularBeans();
            boolean confirma = listaC.verificarDadosEditar(listaB);
            if(confirma == true){
                limpaCampos();
                habilitarBotao(false);
                habilitarCampos(false);
                Modelo.setNumRows(0);
                listaC.controlePesquisa(Modelo);
            }
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        // botão para excluir registro
        popularBeans();
        listaC.excluirItem(listaB);
        limpaCampos();
        Modelo.setNumRows(0);
        listaC.controlePesquisa(Modelo);
        habilitarCampos(false);
        habilitarBotao(false);
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void txtBuscaContatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaContatoKeyReleased
        // TODO add your handling code here:
        Modelo.setNumRows(0);
        listaC.controlePesquisaDigitada(txtBuscaContato.getText(), Modelo);
    }//GEN-LAST:event_txtBuscaContatoKeyReleased

    private void txtBuscaContatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaContatoKeyPressed
        // TODO add your handling code here:
        Modelo.setNumRows(0);
        listaC.controlePesquisaDigitada(txtBuscaContato.getText(), Modelo);
    }//GEN-LAST:event_txtBuscaContatoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiciona;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblContatos;
    private javax.swing.JTextField txtBuscaContato;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodTelefone;
    private javax.swing.JTextField txtDDDCel;
    private javax.swing.JTextField txtDDDTel;
    private javax.swing.JTextField txtDetalhesTelefone;
    private javax.swing.JTextField txtNomeTelefone;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
