
package DAO;

import Beans.ListaTelefonicaBeans;
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
public class ListaTelefonicaDAO {
    
    ListaTelefonicaBeans listaB = new ListaTelefonicaBeans();
    
    public ListaTelefonicaDAO(){
        
    }
    
    //Nesta classe, será necessário:
    //Inserção, consulta, edição e exclusão na tabela 'listatelefone' da base de dados patologistas
    
    
    public void cadastrarContato(ListaTelefonicaBeans listaB){
        try {
            String sql = "insert into listatelefone (nome, celular, telefone, observacao) values (?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, listaB.getNome());
            pst.setString(2, listaB.getCelular());
            pst.setString(3, listaB.getTelefone());
            pst.setString(4, listaB.getDetalhes());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Contato adicionado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível adicionar o contato.","Erro",0);
        }
    }
    
    //apresentar todos os contatos na abertura da tela, independente de busca
    public void apresentarContatos(DefaultTableModel Modelo){
        try {
            String sql = "select * from listatelefone order by nome";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codTelefone"),
                    rs.getString("nome"),
                    rs.getString("celular"),
                    rs.getString("telefone"),
                    rs.getString("observacao")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    
    //buscar contatos com o evento da caixa de texto
    public void buscarContato(String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from listatelefone where nome like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codTelefone"),
                    rs.getString("nome"),
                    rs.getString("celular"),
                    rs.getString("telefone"),
                    rs.getString("observacao")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    //método para preencher campos
    public ListaTelefonicaBeans preencherCampos(int Codigo){
        try { 
            String SQLSelection = "select * from listatelefone where codTelefone = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1, Codigo);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                listaB.setCodigo(rs.getInt("codTelefone"));
                listaB.setNome(rs.getString("nome"));
                listaB.setCelular(rs.getString("celular"));
                listaB.setTelefone(rs.getString("telefone"));
                listaB.setDetalhes(rs.getString("observacao"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar contato","Atenção",0);
        }
        return listaB;
    }
    
    
    public void editarContato(ListaTelefonicaBeans listaB){
        try {
            String sql = "update listatelefone set nome = ?, celular = ?, telefone = ?, observacao = ? where codTelefone = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, listaB.getNome());
            pst.setString(2, listaB.getCelular());
            pst.setString(3, listaB.getTelefone());
            pst.setString(4, listaB.getDetalhes());
            pst.setInt(5, listaB.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Contato alterado","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o contato.","Erro",0);
        }
    }
    
    public void deletarContato(ListaTelefonicaBeans listaB){
        try {
            String sql = "delete from listatelefone where codTelefone = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, listaB.getCodigo());
            
            pst.executeUpdate();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Contato excluído","Excluído",2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O contato não foi excluído","Erro",0);
        }
    }
    
}
