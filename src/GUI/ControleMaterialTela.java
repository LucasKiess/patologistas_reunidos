
package GUI;

import Controller.MateriaisController;
import static GUI.PrincipalTela.desktop;
import static GUI.PrincipalTela.lblUsu;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static GUI.PrincipalTela.MenuCaixa;

/**
 *
 * @author lucas
 */
public class ControleMaterialTela extends javax.swing.JInternalFrame {

    
    InsereEstoqueTela insereTela;
    RegistraEntradaExameTela registraTela;
    RegistraSaidaFrascoTela registraSaida;
    MateriaisController materiaisC;
    GeraRelatorioMateriaisTela geraTela;
    DefaultTableModel Modelo;
    Connection conexao;
    
    public ControleMaterialTela() {
        initComponents();
        
        conexao = Conexao.getConnection();
        
        tblEstoque.setEnabled(false);
        
        
       
        
        Modelo = (DefaultTableModel) tblEstoque.getModel();
        materiaisC = new MateriaisController();
        materiaisC.controlePesquisa(Modelo);
        
        
        insereTela = new InsereEstoqueTela();
        registraTela = new RegistraEntradaExameTela();
        registraSaida = new RegistraSaidaFrascoTela();
        geraTela = new GeraRelatorioMateriaisTela();
    }

    final void alertarFimDeMaterial(){
        String qtdP ;
        String qtdM ;
        String qtdG ;
        String qtdFormol ;
        String qtdEnv ;
        String qtdLam ;
        String qtdReq ;
        String qtdFix ;
        String qtdEsc ;
        String qtdEsp ;
        qtdP = String.valueOf(tblEstoque.getValueAt(0, 2));
        qtdM = String.valueOf(tblEstoque.getValueAt(1, 2));
        qtdG = String.valueOf(tblEstoque.getValueAt(2, 2));
        qtdFormol = String.valueOf(tblEstoque.getValueAt(3, 2));
        qtdEnv = String.valueOf(tblEstoque.getValueAt(4, 2));
        qtdLam = String.valueOf(tblEstoque.getValueAt(5, 2));
        qtdReq = String.valueOf(tblEstoque.getValueAt(6, 2));
        qtdFix = String.valueOf(tblEstoque.getValueAt(7, 2));
        qtdEsc = String.valueOf(tblEstoque.getValueAt(8, 2));
        qtdEsp = String.valueOf(tblEstoque.getValueAt(9, 2));
        
        if(Integer.parseInt(qtdP)<=10){
            JOptionPane.showMessageDialog(null, "Frascos pequenos estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdM)<=10){
            JOptionPane.showMessageDialog(null, "Frascos médios estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdG)<=6){
            JOptionPane.showMessageDialog(null, "Frascos grandes estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdFormol)==0){
            JOptionPane.showMessageDialog(null, "Formol acabou","Atenção",2);
        }
        if(Integer.parseInt(qtdFormol)==1){
            JOptionPane.showMessageDialog(null, "Você só tem uma unidade de formol","Atenção",2);
        }
        if(Integer.parseInt(qtdEnv)<=40){
            JOptionPane.showMessageDialog(null, "Envelopes de CP estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdLam)<=40){
            JOptionPane.showMessageDialog(null, "Lâminas estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdReq)<=40){
            JOptionPane.showMessageDialog(null, "Requisições de CP estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdFix)<=2){
            JOptionPane.showMessageDialog(null, "Fixador está acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdEsc)<=40){
            JOptionPane.showMessageDialog(null, "Escovas cervicais estão acabando","Atenção",2);
        }
        if(Integer.parseInt(qtdEsp)<=60){
            JOptionPane.showMessageDialog(null, "Espátulas de Ayre estão acabando","Atenção",2);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        btnAtualizarLista = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnRelatorio = new javax.swing.JButton();
        btnInsereEstoque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSaidaMaterial = new javax.swing.JButton();
        btnEntradaMaterial = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Controle de Materiais - Patologistas Reunidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setRowHeight(30);
        jScrollPane1.setViewportView(tblEstoque);
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        btnAtualizarLista.setText("Atualizar");
        btnAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtualizarLista)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnAtualizarLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador"));

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_report.png"))); // NOI18N
        btnRelatorio.setToolTipText("Emitir Relatório");
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnInsereEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_newEstoque.png"))); // NOI18N
        btnInsereEstoque.setToolTipText("Inserir Estoque");
        btnInsereEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsereEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsereEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnInsereEstoque)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorio)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsereEstoque)
                    .addComponent(btnRelatorio))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        btnSaidaMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_saidaMaterial.png"))); // NOI18N
        btnSaidaMaterial.setToolTipText("Registrar Saída");
        btnSaidaMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaidaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaMaterialActionPerformed(evt);
            }
        });

        btnEntradaMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_entrada.png"))); // NOI18N
        btnEntradaMaterial.setToolTipText("Registrar Entrada");
        btnEntradaMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaMaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnEntradaMaterial)
                .addGap(18, 18, 18)
                .addComponent(btnSaidaMaterial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntradaMaterial)
                    .addComponent(btnSaidaMaterial))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setBounds(350, 120, 725, 403);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsereEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsereEstoqueActionPerformed
        // botão que chama a tela de inserção de estoque
        //a query é uma alteração na tabela de acordo com o nome do frasco
        insereTela.setVisible(true);
    }//GEN-LAST:event_btnInsereEstoqueActionPerformed

    private void btnAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarListaActionPerformed
        // TODO add your handling code here:
        Modelo.setNumRows(0);
        materiaisC.controlePesquisa(Modelo);
    }//GEN-LAST:event_btnAtualizarListaActionPerformed

    private void btnEntradaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaMaterialActionPerformed
        // botão que insere entrada de exames que voltam do hospital(parte do estoque)
        registraTela.setVisible(true);
    }//GEN-LAST:event_btnEntradaMaterialActionPerformed

    private void btnSaidaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaMaterialActionPerformed
        // botão que registra saída de frascos para o hospital
        registraSaida.setVisible(true);
        alertarFimDeMaterial();
    }//GEN-LAST:event_btnSaidaMaterialActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // BOTÃO DE RELATÓRIO
        desktop.add(geraTela);
        geraTela.setVisible(true);
    }//GEN-LAST:event_btnRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarLista;
    private javax.swing.JButton btnEntradaMaterial;
    public static javax.swing.JButton btnInsereEstoque;
    public static javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSaidaMaterial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblEstoque;
    // End of variables declaration//GEN-END:variables
}
