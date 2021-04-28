
package DAO;

import Beans.CaixaBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class CaixaDAO {
    
    CaixaBeans caixaB = new CaixaBeans();
    
    public CaixaDAO(){
        
    }
    
    //método para apresentar os registros na tabela
    public void apresentarRegistrosEntrada(DefaultTableModel Modelo){
        try {
            String sql = "select * from caixaentrada order by dataCaixaEntrada";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codCaixaEntrada"),
                    rs.getString("descricaoCaixaEntrada"),
                    rs.getString("valorCaixaEntrada"),
                    Corretores.ConverterParaJava(rs.getString("dataCaixaEntrada"))
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
        
    }
    
    public void apresentarRegistrosSaida(DefaultTableModel Modelo){
        try {
            String sql = "select * from caixasaida order by dataCaixaSaida";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codCaixaSaida"),
                    rs.getString("descricaoCaixaSaida"),
                    rs.getString("valorCaixaSaida"),
                    Corretores.ConverterParaJava(rs.getString("dataCaixaSaida"))
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
        
    }
    
    public CaixaBeans preencherCamposEntrada(int Codigo){
        try { 
            String sql = "select * from caixaentrada where codCaixaEntrada = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                caixaB.setCodigo(rs.getInt("codCaixaEntrada"));
                caixaB.setDescricao(rs.getString("descricaoCaixaEntrada"));
                caixaB.setValor(rs.getDouble("valorCaixaEntrada"));
                caixaB.setData(Corretores.ConverterParaJava(rs.getString("dataCaixaEntrada")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar registro","Atenção",0);
        }
        return caixaB;
    }
    
    public CaixaBeans preencherCamposSaida(int Codigo){
        try { 
            String sql = "select * from caixasaida where codCaixaSaida = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                caixaB.setCodigo(rs.getInt("codCaixaSaida"));
                caixaB.setDescricao(rs.getString("descricaoCaixaSaida"));
                caixaB.setValor(rs.getDouble("valorCaixaSaida"));
                caixaB.setData(Corretores.ConverterParaJava(rs.getString("dataCaixaSaida")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar registro","Atenção",0);
        }
        return caixaB;
    }
    
    public void buscarPorDataCaixaEntrada(DefaultTableModel Modelo, String dataInicio, String dataFim){
        try{
            String sql = "select * from caixaentrada where dataCaixaEntrada between '"+dataInicio+"' and '"+dataFim+"' order by dataCaixaEntrada";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    Modelo.addRow(new Object[]{
                        rs.getString("codCaixaEntrada"),
                        rs.getString("descricaoCaixaEntrada"),
                        rs.getString("valorCaixaEntrada"),
                        Corretores.ConverterParaJava(rs.getString("dataCaixaEntrada"))
                    });
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Atenção",0);
        }    
    }
    
    public void buscarPorDataCaixaSaida(DefaultTableModel Modelo, String dataInicio, String dataFim){
        try{
            String sql = "select * from caixasaida where dataCaixaSaida between '"+dataInicio+"' and '"+dataFim+"' order by dataCaixaSaida";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    Modelo.addRow(new Object[]{
                        rs.getString("codCaixaSaida"),
                        rs.getString("descricaoCaixaSaida"),
                        rs.getString("valorCaixaSaida"),
                        Corretores.ConverterParaJava(rs.getString("dataCaixaSaida"))
                    });
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Atenção",0);
        }    
    }
    
    public void cadastrarEntrada(CaixaBeans caixaB){
        try {
            String sql = "insert into caixaentrada (descricaoCaixaEntrada, valorCaixaEntrada, dataCaixaEntrada) values (?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, caixaB.getDescricao());
            pst.setDouble(2, caixaB.getValor());
            pst.setString(3, caixaB.getData());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Receita adicionada","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o registro.","Erro",0);
        }
    }
    
    public void cadastrarSaida(CaixaBeans caixaB){
        try {
            String sql = "insert into caixasaida (descricaoCaixaSaida, valorCaixaSaida, dataCaixaSaida) values (?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, caixaB.getDescricao());
            pst.setDouble(2, caixaB.getValor());
            pst.setString(3, caixaB.getData());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Despesa adicionada","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar","Erro",0);
        }
    }
    
    public void editarEntrada(CaixaBeans caixaB){
        try {
            String sql = "update caixaentrada set descricaoCaixaEntrada = ?, valorCaixaEntrada = ?, dataCaixaEntrada = ? where codCaixaEntrada =?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, caixaB.getDescricao());
            pst.setDouble(2, caixaB.getValor());
            pst.setString(3, caixaB.getData());
            pst.setInt(4, caixaB.getCodigo());
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro alterado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o registro.","Erro",0);
        }
    }
    
    public void editarSaida(CaixaBeans caixaB){
        try {
            String sql = "update caixasaida set descricaoCaixaSaida = ?, valorCaixaSaida = ?, dataCaixaSaida = ? where codCaixaSaida =?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, caixaB.getDescricao());
            pst.setDouble(2, caixaB.getValor());
            pst.setString(3, caixaB.getData());
            pst.setInt(4, caixaB.getCodigo());
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro alterado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o registro.","Erro",0);
        }
    }
    
    public void deletarEntrada(CaixaBeans caixaB){
        try {
            String sql = "delete from caixaentrada where codCaixaEntrada = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1,caixaB.getCodigo());
            
            pst.executeUpdate();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro excluído","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro.","Erro",0);
        }
    }
    
    public void deletarSaida(CaixaBeans caixaB){
        try {
            String sql = "delete from caixasaida where codCaixaSaida = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1,caixaB.getCodigo());
            
            pst.executeUpdate();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro excluído","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro.","Erro",0);
        }
    }
}
