
package DAO;

import Beans.ExameParticularBeans;
import GUI.ExameParticularTela;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ExameParticularDAO {
    
    ExameParticularBeans exameB = new ExameParticularBeans();
    
    public ExameParticularDAO(){
        
    }
    
    //Nesta classe, será necessário:
    //Inserção, consulta, edição e exclusão na tabela 'viamao' da base de dados patologistas
    //Inserção, consulta, edição e exclusão na tabela 'poa' da base de dados patologistas
    
    public void cadastrarExame(String tabelaDestino, ExameParticularBeans exameB){
        try {
            String sql = "insert into "+tabelaDestino+" (nomeExame, valorExame, obsExame) values (?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, exameB.getExame());
            pst.setDouble(2, exameB.getValor());
            pst.setString(3, exameB.getObservacao());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Exame adicionado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível adicionar o exame.","Erro",0);
            System.out.println(e);
        }
    }
    
    //apresentar todos os exames na abertura da tela, independente de busca
    public void apresentarExamesViamao(DefaultTableModel Modelo){
        try {
            String sql = "select * from viamao order by nomeExame asc";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
            System.out.println(e);
        }
    }
    
    //apresentar todos os exames na abertura da tela, independente de busca
    public void apresentarExamesPoa(DefaultTableModel Modelo){
        try {
            String sql = "select * from poa order by nomeExame asc";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
            System.out.println(e);
        }
    }
    
    //buscar exames com o evento da caixa de texto
    public void buscarExameViamão(String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from viamao where nomeExame like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
            System.out.println(e);
        }
    }
    
    //buscar exames com o evento da caixa de texto
    public void buscarExamePoa(String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from poa where nomeExame like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
            System.out.println(e);
        }
    }
    
    
    //método para preencher campos
    public ExameParticularBeans preencherCamposViamao(int Codigo){
        try { 
            String SQLSelection = "select * from viamao where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                exameB.setCodigo(rs.getInt("codExame"));
                exameB.setExame(rs.getString("nomeExame"));
                exameB.setValor(rs.getDouble("valorExame"));
                exameB.setObservacao(rs.getString("obsExame"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar exame","Atenção",0);
        }
        return exameB;
    }
    
    //método para preencher campos
    public ExameParticularBeans preencherCamposPoa(int Codigo){
        try { 
            String SQLSelection = "select * from poa where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                exameB.setCodigo(rs.getInt("codExame"));
                exameB.setExame(rs.getString("nomeExame"));
                exameB.setValor(rs.getDouble("valorExame"));
                exameB.setObservacao(rs.getString("obsExame"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar exame","Atenção",0);
        }
        return exameB;
    }
    
    public void editarExame(String tabelaDestino, ExameParticularBeans exameB){
        try {
            String sql = "update "+tabelaDestino+" set nomeExame = ?, valorExame = ?, obsExame = ? where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, exameB.getExame());
            pst.setDouble(2, exameB.getValor());
            pst.setString(3, exameB.getObservacao());
            pst.setInt(4, exameB.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Exame alterado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o exame.","Erro",0);
        }
    }
    
    public void deletarExame(String tabelaDestino, ExameParticularBeans exameB){
        try {
            String sql = "delete from "+tabelaDestino+" where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, exameB.getCodigo());
            
            pst.executeUpdate();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Exame excluído","Excluído",2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O exame não foi excluído","Erro",0);
        }
    }
    
}
