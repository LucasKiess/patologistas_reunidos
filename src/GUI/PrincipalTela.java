
package GUI;

import Beans.UsuarioBeans;
import Utilitarios.FundoTela;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class PrincipalTela extends javax.swing.JFrame {

    FundoTela tela;
    ExameParticularTela exameParticularTela;
    ExameConvenioTela exameConvenio;
    ListaTelefonicaTela listaTela;
    ControleMaterialTela controleTela;
    CaixaEntradaTela caixaEntrada;
    CaixaSaidaTela caixaSaida;
    PagamentoCartaoTela pagamentoCartaoTela;
    CaixaEmprestimoTela caixaEmprestimo;
    GeraRelatorioCaixaTela geraRelatorioCaixa;
    GeraReciboTela geraRecibo;
    SobreTela sobreTela;
    Date DataAtual;
    SimpleDateFormat FormatoData;
    
    
    public PrincipalTela() {
        initComponents();
        
        //adicionando icone da aplicação
        ImageIcon icone = new ImageIcon(getClass().getResource("/Imagens/pato.png"));
        setIconImage(icone.getImage());
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);  //abrir a tela maximizada
        
        DataAtual = new Date();
        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(FormatoData.format(DataAtual));
        
        exameParticularTela = new ExameParticularTela();
        exameConvenio = new ExameConvenioTela();
        listaTela = new ListaTelefonicaTela();
        controleTela = new ControleMaterialTela();
        caixaEntrada = new CaixaEntradaTela();
        caixaSaida = new CaixaSaidaTela();
        pagamentoCartaoTela = new PagamentoCartaoTela();
        caixaEmprestimo = new CaixaEmprestimoTela();
        geraRelatorioCaixa = new GeraRelatorioCaixaTela();
        geraRecibo = new GeraReciboTela();
        sobreTela = new SobreTela();
        
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblUsu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuExames = new javax.swing.JMenu();
        MenuExameParticular = new javax.swing.JMenuItem();
        MenuExameIpe = new javax.swing.JMenuItem();
        MenuListaTelefonica = new javax.swing.JMenu();
        MenuListaAbrir = new javax.swing.JMenuItem();
        MenuControleMaterial = new javax.swing.JMenu();
        MenuFrascosHospital = new javax.swing.JMenuItem();
        MenuCaixa = new javax.swing.JMenu();
        MenuCaixaReceita = new javax.swing.JMenuItem();
        MenuCaixaDespesa = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuCaixaEmprestimo = new javax.swing.JMenuItem();
        MenuCaixaRelatorio = new javax.swing.JMenuItem();
        MenuCaixaRecibo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal - Patologistas Reunidos");
        setMinimumSize(new java.awt.Dimension(1250, 730));

        desktop.setPreferredSize(new java.awt.Dimension(1200, 391));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblUsu.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Atalhos rápidos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("F1 - Exames particulares");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("F2 - Exames IPERGS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("F3 - Lista Telefônica");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("F4 - Controle de Materiais");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("F5 - Inserir Receita - Caixa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("F6 - Inserir Despesa - Caixa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("F8 - Empréstimos - Caixa");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("F11 - Sobre");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Usuário:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Data:");

        lblData.setText("jLabel2");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("F9 - Relatório - Caixa");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("F10 - Recibo - Caixa");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("F7 -  Pagamento com Cartão - Caixa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData)
                                    .addComponent(lblUsu)))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsu)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblData))
                .addContainerGap())
        );

        desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(961, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        MenuExames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_exam.png"))); // NOI18N
        MenuExames.setText("Exames");
        MenuExames.setToolTipText("");
        MenuExames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuExames.setMargin(new java.awt.Insets(5, 5, 5, 5));

        MenuExameParticular.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuExameParticular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuExameParticular.setText("Particulares");
        MenuExameParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExameParticularActionPerformed(evt);
            }
        });
        MenuExames.add(MenuExameParticular);

        MenuExameIpe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuExameIpe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuExameIpe.setText("Conv. Ipergs");
        MenuExameIpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExameIpeActionPerformed(evt);
            }
        });
        MenuExames.add(MenuExameIpe);

        jMenuBar1.add(MenuExames);

        MenuListaTelefonica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_phone.png"))); // NOI18N
        MenuListaTelefonica.setText("Lista Tel.");
        MenuListaTelefonica.setToolTipText("");
        MenuListaTelefonica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuListaTelefonica.setMargin(new java.awt.Insets(5, 5, 5, 5));

        MenuListaAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MenuListaAbrir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuListaAbrir.setText("Abrir Lista");
        MenuListaAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListaAbrirActionPerformed(evt);
            }
        });
        MenuListaTelefonica.add(MenuListaAbrir);

        jMenuBar1.add(MenuListaTelefonica);

        MenuControleMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_frasco.png"))); // NOI18N
        MenuControleMaterial.setText("Materiais");
        MenuControleMaterial.setToolTipText("");
        MenuControleMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuControleMaterial.setMargin(new java.awt.Insets(5, 5, 5, 5));

        MenuFrascosHospital.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuFrascosHospital.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuFrascosHospital.setText("Frascos - Hospital Viamão");
        MenuFrascosHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFrascosHospitalActionPerformed(evt);
            }
        });
        MenuControleMaterial.add(MenuFrascosHospital);

        jMenuBar1.add(MenuControleMaterial);

        MenuCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_caixa_1.png"))); // NOI18N
        MenuCaixa.setText("Caixa");
        MenuCaixa.setToolTipText("");
        MenuCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuCaixa.setMargin(new java.awt.Insets(5, 5, 5, 5));

        MenuCaixaReceita.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MenuCaixaReceita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuCaixaReceita.setText("Inserir Receita");
        MenuCaixaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixaReceitaActionPerformed(evt);
            }
        });
        MenuCaixa.add(MenuCaixaReceita);

        MenuCaixaDespesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        MenuCaixaDespesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuCaixaDespesa.setText("Inserir Despesa");
        MenuCaixaDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixaDespesaActionPerformed(evt);
            }
        });
        MenuCaixa.add(MenuCaixaDespesa);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Pagamento com Cartão");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuCaixa.add(jMenuItem1);

        MenuCaixaEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        MenuCaixaEmprestimo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuCaixaEmprestimo.setText("Empréstimo");
        MenuCaixaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixaEmprestimoActionPerformed(evt);
            }
        });
        MenuCaixa.add(MenuCaixaEmprestimo);

        MenuCaixaRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        MenuCaixaRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuCaixaRelatorio.setText("Relatório");
        MenuCaixaRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixaRelatorioActionPerformed(evt);
            }
        });
        MenuCaixa.add(MenuCaixaRelatorio);

        MenuCaixaRecibo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        MenuCaixaRecibo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuCaixaRecibo.setText("Recibo Cliente");
        MenuCaixaRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixaReciboActionPerformed(evt);
            }
        });
        MenuCaixa.add(MenuCaixaRecibo);

        jMenuBar1.add(MenuCaixa);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ico_sobre_1.png"))); // NOI18N
        jMenu1.setToolTipText("Sobre");
        jMenu1.setMargin(new java.awt.Insets(5, 5, 5, 5));

        MenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        MenuSobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuSobre.setText("Sobre");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSobre);

        MenuSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuSair.setForeground(new java.awt.Color(255, 0, 0));
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        // botão sair
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Encerrar sistema",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuExameParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExameParticularActionPerformed
        // chama a tela de exames particulares
        desktop.add(exameParticularTela);
        exameParticularTela.setVisible(true);
    }//GEN-LAST:event_MenuExameParticularActionPerformed

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        // chama a tela de SOBRE
        desktop.add(sobreTela);
        sobreTela.setVisible(true);
    }//GEN-LAST:event_MenuSobreActionPerformed

    private void MenuExameIpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExameIpeActionPerformed
        // chama a tela de exames convenio
        desktop.add(exameConvenio);
        exameConvenio.setVisible(true);
    }//GEN-LAST:event_MenuExameIpeActionPerformed

    private void MenuListaAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListaAbrirActionPerformed
        // chama a lista telefonica
        desktop.add(listaTela);
        listaTela.setVisible(true);
    }//GEN-LAST:event_MenuListaAbrirActionPerformed

    private void MenuFrascosHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFrascosHospitalActionPerformed
        // chama tela de materiais
        desktop.add(controleTela);
        controleTela.setVisible(true);
    }//GEN-LAST:event_MenuFrascosHospitalActionPerformed

    private void MenuCaixaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixaReceitaActionPerformed
        // chama a tela de receita de caixa
        desktop.add(caixaEntrada);
        caixaEntrada.setVisible(true);
    }//GEN-LAST:event_MenuCaixaReceitaActionPerformed

    private void MenuCaixaDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixaDespesaActionPerformed
        // chama a tela de despesas de caixa
        desktop.add(caixaSaida);
        caixaSaida.setVisible(true);
    }//GEN-LAST:event_MenuCaixaDespesaActionPerformed

    private void MenuCaixaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixaEmprestimoActionPerformed
        // chama tela de emprestimo caixa
        desktop.add(caixaEmprestimo);
        caixaEmprestimo.setVisible(true);
    }//GEN-LAST:event_MenuCaixaEmprestimoActionPerformed

    private void MenuCaixaRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixaRelatorioActionPerformed
        // chama a tela para gerar relatório de caixa
        desktop.add(geraRelatorioCaixa);
        geraRelatorioCaixa.setVisible(true);
               
    }//GEN-LAST:event_MenuCaixaRelatorioActionPerformed

    private void MenuCaixaReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixaReciboActionPerformed
        // chama a tela de recibo
        desktop.add(geraRecibo);
        geraRecibo.setVisible(true);
    }//GEN-LAST:event_MenuCaixaReciboActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // chama a tela de pagamento com cartão
        desktop.add(pagamentoCartaoTela);
        pagamentoCartaoTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu MenuCaixa;
    private javax.swing.JMenuItem MenuCaixaDespesa;
    private javax.swing.JMenuItem MenuCaixaEmprestimo;
    private javax.swing.JMenuItem MenuCaixaReceita;
    private javax.swing.JMenuItem MenuCaixaRecibo;
    private javax.swing.JMenuItem MenuCaixaRelatorio;
    private javax.swing.JMenu MenuControleMaterial;
    private javax.swing.JMenuItem MenuExameIpe;
    private javax.swing.JMenuItem MenuExameParticular;
    private javax.swing.JMenu MenuExames;
    private javax.swing.JMenuItem MenuFrascosHospital;
    private javax.swing.JMenuItem MenuListaAbrir;
    private javax.swing.JMenu MenuListaTelefonica;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem MenuSobre;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsu;
    // End of variables declaration//GEN-END:variables
}
