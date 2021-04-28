
package DAO;

import Beans.CaixaBeans;
import Beans.EmprestimoBeans;
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
public class EmprestimoDAO {
    
    EmprestimoBeans emprestimoB = new EmprestimoBeans();
    
    public EmprestimoDAO(){
        
    }
    
    
    public void cadastrar(EmprestimoBeans emprestimoB){
        try {
            String sql = "insert into caixaemprestimo (nomePessoa,valorEmprestimo,dataEmprestimo,situacao) values (?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, emprestimoB.getNome());
            pst.setDouble(2, emprestimoB.getValor());
            pst.setString(3, emprestimoB.getData());
            pst.setString(4, emprestimoB.getSituacao());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro inserido.","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o registro","Erro",0);
        }
    }
    
    public void editar(EmprestimoBeans emprestimoB){
        try {
            String sql = "update caixaemprestimo set nomePessoa = ?, valorEmprestimo = ?, dataEmprestimo = ?, situacao = ? where codEmprestimo = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, emprestimoB.getNome());
            pst.setDouble(2, emprestimoB.getValor());
            pst.setString(3, emprestimoB.getData());
            pst.setString(4, emprestimoB.getSituacao());
            pst.setInt(5, emprestimoB.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro alterado.","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o registro","Erro",0);
        }
    }
    
    public void apresentarRegistros(DefaultTableModel Modelo){
        try {
            String sql = "select * from caixaemprestimo";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codEmprestimo"),
                    rs.getString("nomePessoa"),
                    rs.getString("valorEmprestimo"),
                    Corretores.ConverterParaJava(rs.getString("dataEmprestimo")),
                    rs.getString("situacao")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    public EmprestimoBeans preencherCampos(int Codigo){
        try { 
            String sql = "select * from caixaemprestimo where codEmprestimo = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                emprestimoB.setCodigo(rs.getInt("codEmprestimo"));
                emprestimoB.setNome(rs.getString("nomePessoa"));
                emprestimoB.setValor(rs.getDouble("valorEmprestimo"));
                emprestimoB.setData(Corretores.ConverterParaJava(rs.getString("dataEmprestimo")));
                emprestimoB.setSituacao(rs.getString("situacao"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar registro","Atenção",0);
        }
        return emprestimoB;
    }
    
    public double calcularTotalPendente(String situacao){
        try { 
            String sql = "select sum(valorEmprestimo) as Total from caixaemprestimo where situacao = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1,"Pendente");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                emprestimoB.setTotalPendente(rs.getDouble("Total"));
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex,"Atenção",0);
        }
        //return emprestimoB;
        return emprestimoB.getTotalPendente();
    }
}
