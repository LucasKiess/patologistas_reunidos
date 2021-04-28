
package GUI;

import Beans.ExameParticularBeans;
import Controller.ExameParticularController;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ExameParticularTela extends javax.swing.JInternalFrame {

    ExameParticularBeans exameB;
    ExameParticularController exameC;
    DefaultTableModel modeloViamao;
    DefaultTableModel modeloPoa;
    
    public ExameParticularTela() {
        initComponents();
        
        exameB = new ExameParticularBeans();
        exameC = new ExameParticularController();
        modeloViamao = (DefaultTableModel) tblExamesViamao.getModel();
        modeloPoa = (DefaultTableModel) tblExamesPoa.getModel();
        
        //chamando método para popular a tabela com a consulta do banco
        exameC.controlePesquisaViamao(modeloViamao);
        exameC.controlePesquisaPoa(modeloPoa);
        
        //fazer com que a tabela só aceite uma seleção por vez
        tblExamesViamao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblExamesPoa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void popularBeansParaViamao(){
        exameB.setExame(txtExameV.getText());
        exameB.setValor(Double.parseDouble(txtValorV.getText().replace(",", ".")));
        exameB.setObservacao(txtObservacaoV.getText());
    }
    
    final void popularBeansParaPoa(){
        exameB.setExame(txtExameP.getText());
        exameB.setValor(Double.parseDouble(txtValorP.getText().replace(",", ".")));
        exameB.setObservacao(txtObservacaoP.getText());
    }
    
    final void limparCamposViamao(){
        txtCodV.setText("");
        txtExameV.setText("");
        txtValorV.setText("0");
        txtObservacaoV.setText("");
    }
    
    final void limparCamposPoa(){
        txtCodP.setText("");
        txtExameP.setText("");
        txtValorP.setText("0");
        txtObservacaoP.setText("");
    }
    
    final void habilitarCamposViamao(boolean valor){
        txtExameV.setEnabled(valor);
        txtValorV.setEnabled(valor);
        txtObservacaoV.setEnabled(valor);
        btnAdicionarViamao.setEnabled(valor);
    }
    
    final void habilitarCamposPoa(boolean valor){
        txtExameP.setEnabled(valor);
        txtValorP.setEnabled(valor);
        txtObservacaoP.setEnabled(valor);
        btnAdicionarPoa.setEnabled(valor);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPai = new javax.swing.JTabbedPane();
        GuiaViamaoParticular = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodV = new javax.swing.JTextField();
        txtValorV = new javax.swing.JTextField();
        txtExameV = new javax.swing.JTextField();
        txtObservacaoV = new javax.swing.JTextField();
        btnEditarViamao = new javax.swing.JButton();
        btnExcluirViamao = new javax.swing.JButton();
        btnAdicionarViamao = new javax.swing.JButton();
        btnLimpaCamposViamao = new javax.swing.JButton();
        btnNovoViamao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExamesViamao = new javax.swing.JTable();
        txtBuscaViamao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        GuiaPoaParticular = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodP = new javax.swing.JTextField();
        txtValorP = new javax.swing.JTextField();
        txtExameP = new javax.swing.JTextField();
        txtObservacaoP = new javax.swing.JTextField();
        btnEditarPoa = new javax.swing.JButton();
        btnExcluirPoa = new javax.swing.JButton();
        btnAdicionarPoa = new javax.swing.JButton();
        btnLimpaCamposPoa = new javax.swing.JButton();
        btnNovoPoa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExamesPoa = new javax.swing.JTable();
        txtBuscaPoa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de Exames Particulares - Patologistas Reunidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nº registro:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Exame:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Observação:");

        txtCodV.setEditable(false);

        txtValorV.setText("0");
        txtValorV.setEnabled(false);
        txtValorV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorVKeyTyped(evt);
            }
        });

        txtExameV.setEnabled(false);

        txtObservacaoV.setEnabled(false);

        btnEditarViamao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_edit.png"))); // NOI18N
        btnEditarViamao.setToolTipText("Editar");
        btnEditarViamao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarViamao.setEnabled(false);
        btnEditarViamao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarViamaoActionPerformed(evt);
            }
        });

        btnExcluirViamao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_del.png"))); // NOI18N
        btnExcluirViamao.setToolTipText("Excluir");
        btnExcluirViamao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirViamao.setEnabled(false);
        btnExcluirViamao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirViamaoActionPerformed(evt);
            }
        });

        btnAdicionarViamao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnAdicionarViamao.setToolTipText("Adicionar");
        btnAdicionarViamao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarViamao.setEnabled(false);
        btnAdicionarViamao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarViamaoActionPerformed(evt);
            }
        });

        btnLimpaCamposViamao.setText("Limpar Campos");
        btnLimpaCamposViamao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaCamposViamaoActionPerformed(evt);
            }
        });

        btnNovoViamao.setText("Novo Registro");
        btnNovoViamao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoViamaoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodV, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorV, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtExameV))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtObservacaoV))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpaCamposViamao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovoViamao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarViamao)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarViamao)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirViamao)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExameV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtValorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacaoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoViamao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpaCamposViamao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarViamao)
                            .addComponent(btnExcluirViamao)
                            .addComponent(btnAdicionarViamao))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta - Selecione para editar ou remover"));

        tblExamesViamao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº registro", "Exame", "Valor", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExamesViamao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblExamesViamaoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblExamesViamao);
        if (tblExamesViamao.getColumnModel().getColumnCount() > 0) {
            tblExamesViamao.getColumnModel().getColumn(0).setResizable(false);
            tblExamesViamao.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblExamesViamao.getColumnModel().getColumn(1).setResizable(false);
            tblExamesViamao.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblExamesViamao.getColumnModel().getColumn(2).setResizable(false);
            tblExamesViamao.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblExamesViamao.getColumnModel().getColumn(3).setResizable(false);
            tblExamesViamao.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        txtBuscaViamao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaViamaoKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_busca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscaViamao, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscaViamao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GuiaViamaoParticularLayout = new javax.swing.GroupLayout(GuiaViamaoParticular);
        GuiaViamaoParticular.setLayout(GuiaViamaoParticularLayout);
        GuiaViamaoParticularLayout.setHorizontalGroup(
            GuiaViamaoParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaViamaoParticularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GuiaViamaoParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        GuiaViamaoParticularLayout.setVerticalGroup(
            GuiaViamaoParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaViamaoParticularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelPai.addTab("Viamão", GuiaViamaoParticular);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Nº registro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Exame:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Valor:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Observação:");

        txtCodP.setEditable(false);

        txtValorP.setText("0");
        txtValorP.setEnabled(false);
        txtValorP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorPKeyTyped(evt);
            }
        });

        txtExameP.setEnabled(false);

        txtObservacaoP.setEnabled(false);

        btnEditarPoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_edit.png"))); // NOI18N
        btnEditarPoa.setToolTipText("Editar");
        btnEditarPoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPoa.setEnabled(false);
        btnEditarPoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPoaActionPerformed(evt);
            }
        });

        btnExcluirPoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_del.png"))); // NOI18N
        btnExcluirPoa.setToolTipText("Excluir");
        btnExcluirPoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirPoa.setEnabled(false);
        btnExcluirPoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPoaActionPerformed(evt);
            }
        });

        btnAdicionarPoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_save.png"))); // NOI18N
        btnAdicionarPoa.setToolTipText("Adicionar");
        btnAdicionarPoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarPoa.setEnabled(false);
        btnAdicionarPoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPoaActionPerformed(evt);
            }
        });

        btnLimpaCamposPoa.setText("Limpar Campos");
        btnLimpaCamposPoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaCamposPoaActionPerformed(evt);
            }
        });

        btnNovoPoa.setText("Novo Registro");
        btnNovoPoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorP, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtExameP))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtObservacaoP, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpaCamposPoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovoPoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarPoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirPoa)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtValorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacaoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNovoPoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpaCamposPoa))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarPoa)
                            .addComponent(btnExcluirPoa)
                            .addComponent(btnAdicionarPoa))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta - Selecione para editar ou remover"));

        tblExamesPoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº registro", "Exame", "Valor", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExamesPoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblExamesPoaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblExamesPoa);
        if (tblExamesPoa.getColumnModel().getColumnCount() > 0) {
            tblExamesPoa.getColumnModel().getColumn(0).setResizable(false);
            tblExamesPoa.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblExamesPoa.getColumnModel().getColumn(1).setResizable(false);
            tblExamesPoa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblExamesPoa.getColumnModel().getColumn(2).setResizable(false);
            tblExamesPoa.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblExamesPoa.getColumnModel().getColumn(3).setResizable(false);
            tblExamesPoa.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        txtBuscaPoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaPoaKeyReleased(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_busca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscaPoa, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscaPoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GuiaPoaParticularLayout = new javax.swing.GroupLayout(GuiaPoaParticular);
        GuiaPoaParticular.setLayout(GuiaPoaParticularLayout);
        GuiaPoaParticularLayout.setHorizontalGroup(
            GuiaPoaParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuiaPoaParticularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GuiaPoaParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        GuiaPoaParticularLayout.setVerticalGroup(
            GuiaPoaParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaPoaParticularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelPai.addTab("Porto Alegre", GuiaPoaParticular);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPai)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPai)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarViamaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarViamaoActionPerformed
        // botao cadastro viamao
        popularBeansParaViamao();
        String tabelaDestino = "viamao";
        boolean confirma = exameC.verificarDados(tabelaDestino,exameB);
        if(confirma == true){
            limparCamposViamao();
            modeloViamao.setNumRows(0);
            exameC.controlePesquisaViamao(modeloViamao);
            habilitarCamposViamao(false);
        }
    }//GEN-LAST:event_btnAdicionarViamaoActionPerformed

    private void btnEditarViamaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarViamaoActionPerformed
        // botao editar viamao
        popularBeansParaViamao();
        String tabelaDestino = "viamao";
        boolean confirma = exameC.verificarDadosEditar(tabelaDestino, exameB);
        if(confirma == true){
            limparCamposViamao();
            modeloViamao.setNumRows(0);
            exameC.controlePesquisaViamao(modeloViamao);
            habilitarCamposViamao(false);
            btnEditarViamao.setEnabled(false);
            btnExcluirViamao.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditarViamaoActionPerformed

    private void btnExcluirViamaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirViamaoActionPerformed
        // botão exclui viamao
        popularBeansParaViamao();
        String tabelaDestino = "viamao";
        exameC.excluirItem(tabelaDestino, exameB);
        limparCamposViamao();
        modeloViamao.setNumRows(0);
        exameC.controlePesquisaViamao(modeloViamao);
        habilitarCamposViamao(false);
        btnEditarViamao.setEnabled(false);
        btnExcluirViamao.setEnabled(false);
        
    }//GEN-LAST:event_btnExcluirViamaoActionPerformed

    private void btnAdicionarPoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPoaActionPerformed
        // botão adicionar poa
        popularBeansParaPoa();
        String tabelaDestino = "poa";
        boolean confirma = exameC.verificarDados(tabelaDestino, exameB);
        if(confirma == true){
            limparCamposPoa();
            modeloPoa.setNumRows(0);
            exameC.controlePesquisaPoa(modeloPoa);
            habilitarCamposPoa(false);
        }
    }//GEN-LAST:event_btnAdicionarPoaActionPerformed

    private void btnEditarPoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPoaActionPerformed
        //botão editar poa
        popularBeansParaPoa();
        String tabelaDestino = "poa";
        boolean confirma = exameC.verificarDadosEditar(tabelaDestino, exameB);
        if(confirma == true){
            limparCamposPoa();
            modeloPoa.setNumRows(0);
            exameC.controlePesquisaPoa(modeloPoa);
            habilitarCamposPoa(false);
            btnEditarPoa.setEnabled(false);
            btnExcluirPoa.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditarPoaActionPerformed

    private void btnExcluirPoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPoaActionPerformed
        // botão excluir poa
        popularBeansParaPoa();
        String tabelaDestino = "poa";
        exameC.excluirItem(tabelaDestino, exameB);
        limparCamposPoa();
        modeloPoa.setNumRows(0);
        exameC.controlePesquisaPoa(modeloPoa);
        habilitarCamposPoa(false);
        btnEditarPoa.setEnabled(false);
        btnExcluirPoa.setEnabled(false);
    }//GEN-LAST:event_btnExcluirPoaActionPerformed

    private void txtBuscaViamaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaViamaoKeyReleased
        // evento de busca pela caixa de texto
        modeloViamao.setNumRows(0);
        exameC.controlePesquisaDigitadaViamao(txtBuscaViamao.getText(), modeloViamao);
    }//GEN-LAST:event_txtBuscaViamaoKeyReleased

    private void txtBuscaPoaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaPoaKeyReleased
        // evento de busca pela caixa de texto
        modeloPoa.setNumRows(0);
        exameC.controlePesquisaDigitadaPoa(txtBuscaPoa.getText(), modeloPoa);
    }//GEN-LAST:event_txtBuscaPoaKeyReleased

    private void tblExamesViamaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamesViamaoMousePressed
        // clique na tabela para editar, excluir, habilitar botoes
        exameB = exameC.controlePreencherCamposViamao(Integer.parseInt(modeloViamao.getValueAt(tblExamesViamao.getSelectedRow(), 0).toString()));
        txtCodV.setText(exameB.getCodigo()+"");
        txtExameV.setText(exameB.getExame());
        txtValorV.setText(exameB.getValor().toString().replace(".", ","));
        txtObservacaoV.setText(exameB.getObservacao());
        btnEditarViamao.setEnabled(true);
        btnExcluirViamao.setEnabled(true);
        habilitarCamposViamao(true);
        btnAdicionarViamao.setEnabled(false);
    }//GEN-LAST:event_tblExamesViamaoMousePressed

    private void tblExamesPoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamesPoaMousePressed
        //  clique na tabela para editar, excluir, habilitar botoes
        exameB = exameC.controlePreencherCamposPoa(Integer.parseInt(modeloPoa.getValueAt(tblExamesPoa.getSelectedRow(), 0).toString()));
        txtCodP.setText(exameB.getCodigo()+"");
        txtExameP.setText(exameB.getExame());
        txtValorP.setText(exameB.getValor().toString().replace(".", ","));
        txtObservacaoP.setText(exameB.getObservacao());
        btnEditarPoa.setEnabled(true);
        btnExcluirPoa.setEnabled(true);
        habilitarCamposPoa(true);
        btnAdicionarPoa.setEnabled(false);
    }//GEN-LAST:event_tblExamesPoaMousePressed

    private void txtValorVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorVKeyTyped
        // evento para aceitar somente número e virgula
        String caracAceitos = "0987654321,";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorVKeyTyped

    private void txtValorPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPKeyTyped
        // evento para aceitar somente número e virgula
        String caracAceitos = "0987654321,";
        if(!caracAceitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorPKeyTyped

    private void btnLimpaCamposViamaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaCamposViamaoActionPerformed
        // botao limpa campos viamao:
        limparCamposViamao();
        btnEditarViamao.setEnabled(false);
        btnExcluirViamao.setEnabled(false);
        btnAdicionarViamao.setEnabled(false);
    }//GEN-LAST:event_btnLimpaCamposViamaoActionPerformed

    private void btnLimpaCamposPoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaCamposPoaActionPerformed
        // botao limpa campos poa
        limparCamposPoa();
        btnEditarPoa.setEnabled(false);
        btnExcluirPoa.setEnabled(false);
        btnAdicionarPoa.setEnabled(false);
    }//GEN-LAST:event_btnLimpaCamposPoaActionPerformed

    private void btnNovoViamaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoViamaoActionPerformed
        // botão de novo registro
        limparCamposViamao();
        habilitarCamposViamao(true);
    }//GEN-LAST:event_btnNovoViamaoActionPerformed

    private void btnNovoPoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPoaActionPerformed
        // botão de novo registro
        limparCamposPoa();
        habilitarCamposPoa(true);
    }//GEN-LAST:event_btnNovoPoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GuiaPoaParticular;
    private javax.swing.JPanel GuiaViamaoParticular;
    private javax.swing.JTabbedPane PainelPai;
    private javax.swing.JButton btnAdicionarPoa;
    private javax.swing.JButton btnAdicionarViamao;
    private javax.swing.JButton btnEditarPoa;
    private javax.swing.JButton btnEditarViamao;
    private javax.swing.JButton btnExcluirPoa;
    private javax.swing.JButton btnExcluirViamao;
    private javax.swing.JButton btnLimpaCamposPoa;
    private javax.swing.JButton btnLimpaCamposViamao;
    private javax.swing.JButton btnNovoPoa;
    private javax.swing.JButton btnNovoViamao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblExamesPoa;
    private javax.swing.JTable tblExamesViamao;
    private javax.swing.JTextField txtBuscaPoa;
    private javax.swing.JTextField txtBuscaViamao;
    private javax.swing.JTextField txtCodP;
    private javax.swing.JTextField txtCodV;
    private javax.swing.JTextField txtExameP;
    private javax.swing.JTextField txtExameV;
    private javax.swing.JTextField txtObservacaoP;
    private javax.swing.JTextField txtObservacaoV;
    private javax.swing.JTextField txtValorP;
    private javax.swing.JTextField txtValorV;
    // End of variables declaration//GEN-END:variables
}
