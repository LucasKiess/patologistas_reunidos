
package DAO;

import Beans.PagamentoCartaoBeans;
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
public class PagamentoCartaoDAO {
    
    PagamentoCartaoBeans pagamentoCartao = new PagamentoCartaoBeans();
    
    public PagamentoCartaoDAO(){
        
    }
    
    public void apresentarRegistros(DefaultTableModel Modelo){
        try {
            String sql = "select * from pagamentocartao order by data";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codPagamento"),
                    rs.getString("exame"),
                    rs.getString("paciente"),
                    rs.getString("cpf"),
                    rs.getString("endereco"),
                    rs.getString("cep"),
                    rs.getString("valor"),
                    Corretores.ConverterParaJava(rs.getString("data"))
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    public void inserirRegistro(PagamentoCartaoBeans pagamentoB){
        try {
            String sql = "insert into pagamentocartao (exame,paciente,cpf,endereco,cep,valor,data) values (?,?,?,?,?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, pagamentoB.getExame());
            pst.setString(2, pagamentoB.getPaciente());
            pst.setString(3, pagamentoB.getCPF());
            pst.setString(4, pagamentoB.getEndereco());
            pst.setString(5, pagamentoB.getCEP());
            pst.setDouble(6, pagamentoB.getValor());
            pst.setString(7, pagamentoB.getData());
            
            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro inserido.","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o registro.","Erro",0);
        }
    }
    
    public void deletar(PagamentoCartaoBeans pagamentoB){
        try {
            String sql = "delete from pagamentocartao where codPagamento = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1, pagamentoB.getCodigo());
            
            pst.executeUpdate();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro excluído","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro.","Erro",0);
        }
    } 
    
    public PagamentoCartaoBeans preencherCampos(int Codigo){
        try {
            String sql = "select * from pagamentocartao where codPagamento = ? order by data";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setInt(1,Codigo);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                pagamentoCartao.setCodigo(rs.getInt("codPagamento"));
                pagamentoCartao.setExame(rs.getString("exame"));
                pagamentoCartao.setPaciente(rs.getString("paciente"));
                pagamentoCartao.setCPF(rs.getString("cpf"));
                pagamentoCartao.setEndereco(rs.getString("endereco"));
                pagamentoCartao.setCEP(rs.getString("cep"));
                pagamentoCartao.setValor(rs.getDouble("valor"));
                pagamentoCartao.setData(Corretores.ConverterParaJava(rs.getString("data")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o registro","Atenção",0);
        }
        return pagamentoCartao;
    }
    
    public void buscarRegistroNome (String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from pagamentocartao where paciente like '%"+Pesquisa+"%' order by data";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codPagamento"),
                    rs.getString("exame"),
                    rs.getString("paciente"),
                    rs.getString("cpf"),
                    rs.getString("endereco"),
                    rs.getString("cep"),
                    rs.getString("valor"),
                    Corretores.ConverterParaJava(rs.getString("data"))
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    public void buscarRegistroExame(String Pesquisa, DefaultTableModel Modelo){
        try {
            String sql = "select * from pagamentocartao where exame like '%"+Pesquisa+"%' order by data";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[]{
                    rs.getString("codPagamento"),
                    rs.getString("exame"),
                    rs.getString("paciente"),
                    rs.getString("cpf"),
                    rs.getString("endereco"),
                    rs.getString("cep"),
                    rs.getString("valor"),
                    Corretores.ConverterParaJava(rs.getString("data"))
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros","Erro",0);
        }
    }
    
    public void buscarPorData(DefaultTableModel Modelo, String dataInicio, String dataFim){
        try{
            String sql = "select * from pagamentocartao where data between '"+dataInicio+"' and '"+dataFim+"' order by data";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
           
                    while(rs.next()){
                        Modelo.addRow(new Object[]{
                            rs.getString("codPagamento"),
                            rs.getString("exame"),
                            rs.getString("paciente"),
                            rs.getString("cpf"),
                            rs.getString("endereco"),
                            rs.getString("cep"),
                            rs.getString("valor"),
                            Corretores.ConverterParaJava(rs.getString("data"))
                        });
                    }
                
        }catch(Exception e){
            
        }    
    }
}
