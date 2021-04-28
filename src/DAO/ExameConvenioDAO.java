
package DAO;

import Beans.ExameConvenioBeans;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ExameConvenioDAO {
    
    ExameConvenioBeans exameB = new ExameConvenioBeans();
    
    public ExameConvenioDAO(){
        
    }
    
    //Nesta classe, será necessário:
    //Inserção, consulta, edição e exclusão na tabela 'viamaoipe' da base de dados patologistas
    //Inserção, consulta, edição e exclusão na tabela 'poaipe' da base de dados patologistas
    
    public void cadastrarExame(String tabelaDestino, ExameConvenioBeans exameB){
        try {
            String sql = "insert into "+tabelaDestino+" (nomeExame, categoriaExame, valorExame, obsExame) values (?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, exameB.getExame());
            pst.setString(2, exameB.getCategoria());
            pst.setDouble(3, exameB.getValor());
            pst.setString(4, exameB.getObservacao());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Exame adicionado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível adicionar o exame.","Erro",0);
        }
    }
    
    //apresentar todos os exames na abertura da tela, independente de busca
    public void apresentarExamesViamao(DefaultTableModel Modelo){
        try {
            String sql = "select * from viamaoipe order by nomeExame asc";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("categoriaExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    //apresentar todos os exames na abertura da tela, independente de busca
    public void apresentarExamesPoa(DefaultTableModel Modelo){
        try {
            String sql = "select * from poaipe order by nomeExame asc";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("categoriaExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    //buscar exames com o evento da caixa de texto
    public void buscarExameViamão(String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from viamaoipe where nomeExame like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("categoriaExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    //buscar exames com o evento da caixa de texto
    public void buscarExamePoa(String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from poaipe where nomeExame like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codExame"),
                    rs.getString("nomeExame"),
                    rs.getString("categoriaExame"),
                    rs.getString("valorExame"),
                    rs.getString("obsExame")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    
    //método para preencher campos
    public ExameConvenioBeans preencherCamposViamao(int Codigo){
        try { 
            String SQLSelection = "select * from viamaoipe where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                exameB.setCodigo(rs.getInt("codExame"));
                exameB.setExame(rs.getString("nomeExame"));
                exameB.setCategoria(rs.getString("categoriaExame"));
                exameB.setValor(rs.getDouble("valorExame"));
                exameB.setObservacao(rs.getString("obsExame"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar exame","Atenção",0);
        }
        return exameB;
    }
    
    //método para preencher campos
    public ExameConvenioBeans preencherCamposPoa(int Codigo){
        try { 
            String SQLSelection = "select * from poaipe where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                exameB.setCodigo(rs.getInt("codExame"));
                exameB.setExame(rs.getString("nomeExame"));
                exameB.setCategoria(rs.getString("categoriaExame"));
                exameB.setValor(rs.getDouble("valorExame"));
                exameB.setObservacao(rs.getString("obsExame"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar exame","Atenção",0);
        }
        return exameB;
    }
    
    public void editarExame(String tabelaDestino, ExameConvenioBeans exameB){
        try {
            String sql = "update "+tabelaDestino+" set nomeExame = ?, categoriaExame = ?, valorExame = ?, obsExame = ? where codExame = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, exameB.getExame());
            pst.setString(2, exameB.getCategoria());
            pst.setDouble(3, exameB.getValor());
            pst.setString(4, exameB.getObservacao());
            pst.setInt(5, exameB.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Exame alterado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o exame.","Erro",0);
        }
    }
    
    public void deletarExame(String tabelaDestino, ExameConvenioBeans exameB){
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
