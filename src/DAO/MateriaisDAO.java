
package DAO;

import Beans.MateriaisBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */


//classe responsável pela comunicação com as tabelas estoquematerial, saidamaterial, entradamaterial
public class MateriaisDAO {
    
    public MateriaisDAO(){
        
    }
    
    public void listarEstoque(DefaultTableModel Modelo){
        try {
            String sql = "select * from estoquematerial";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getInt("codMaterial"),
                    rs.getString("descricaoMaterial"),
                    rs.getInt("quantidadeMaterial")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar o estoque.","Erro",0);
        }
    }
    
    public void inserirEstoque(MateriaisBeans materiaisB){
        try {
            String sql = "update estoquematerial set quantidadeMaterial = quantidadeMaterial + ? where descricaoMaterial = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, materiaisB.getQuantidade());
            pst.setString(2, materiaisB.getDescricao());
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Quantidade em estoque alterada","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar a quantidade em estoque.","Erro",0);
        }
    }
    
    public void registraEntrada(MateriaisBeans materiaisB){
        try {
            String sql = "insert into entradamaterial (descricaoMaterialE, quantidadeEntrada, dataEntrada) values (?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, materiaisB.getDescricao());
            pst.setInt(2, materiaisB.getQuantidade());
            pst.setString(3, materiaisB.getData());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entrada de material registrada","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar a entrada de material.","Erro",0);
        }
    }
    
    public void registraSaidaEstoque(MateriaisBeans materiaisB){
        try {
            String sql = "update estoquematerial set quantidadeMaterial = quantidadeMaterial - ? where descricaoMaterial = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, materiaisB.getQuantidade());
            pst.setString(2, materiaisB.getDescricao());
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Baixa em estoque: SUCESSO.","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar a baixa.","Erro",0);
        }
    }
    
    public void registraSaida(MateriaisBeans materiaisB){
        try {
            String sql = "insert into saidamaterial (descricaoMaterialS, quantidadeSaida, dataSaida) values (?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, materiaisB.getDescricao());
            pst.setInt(2, materiaisB.getQuantidade());
            pst.setString(3, materiaisB.getData());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Saída de material registrada.","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar a saída.","Erro",0);
        }
    }
    
}
