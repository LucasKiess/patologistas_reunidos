
package Controller;

import Beans.ExameConvenioBeans;
import Beans.ExameParticularBeans;
import DAO.ExameConvenioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ExameConvenioController {
    
    ExameConvenioDAO exameD = new ExameConvenioDAO();
    
    
    public ExameConvenioController(){
        
    }
    
    //método para verificar se existe campo vazio e cadastrar no banco
    public boolean verificarDados(String tabelaDestino, ExameConvenioBeans exameB){
        if(exameB.getExame().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo exame!","Atenção",2);
            return false;
        }
        
        if(exameB.getCategoria().equals("Selecione...")){
            JOptionPane.showMessageDialog(null, "Selecione uma categoria!","Atenção",2);
            return false;
        }
        
        if(exameB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O valor deve ser superior a 0,00","Atenção",2);
            return false;
        }
      
        exameD.cadastrarExame(tabelaDestino,exameB);
        return true;
    }
    
    //método para controlar o resultado do banco nas tabelas da tela
    public void controlePesquisaViamao(DefaultTableModel Modelo){
        exameD.apresentarExamesViamao(Modelo);
    }
    
    //método para controlar o resultado do banco nas tabelas da tela
    public void controlePesquisaPoa(DefaultTableModel Modelo){
        exameD.apresentarExamesPoa(Modelo);
    }
    
    //método para controlar o resultado do banco nas tabelas da tela de acordo com a busca digitada no campo de texto
    public void controlePesquisaDigitadaViamao(String Pesquisa, DefaultTableModel Modelo){
        exameD.buscarExameViamão(Pesquisa, Modelo);
    }
    
    //método para controlar o resultado do banco nas tabelas da tela de acordo com a busca digitada no campo de texto
    public void controlePesquisaDigitadaPoa(String Pesquisa, DefaultTableModel Modelo){
        exameD.buscarExamePoa(Pesquisa, Modelo);
    }
    
    //método para controlar o preenchimento dos campos da tela
    public ExameConvenioBeans controlePreencherCamposViamao(int Codigo){
       return exameD.preencherCamposViamao(Codigo);
    }
    
    //método para controlar o preenchimento dos campos da tela
    public ExameConvenioBeans controlePreencherCamposPoa(int Codigo){
        return exameD.preencherCamposPoa(Codigo);
    }
    
    //método para verificar se existe campo vazio e editar no banco
    public boolean verificarDadosEditar(String tabelaDestino, ExameConvenioBeans exameB){
        if(exameB.getExame().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo exame","Atenção",2);
            return false;
        }
        
        if(exameB.getCategoria().equals("Selecione...")){
            JOptionPane.showMessageDialog(null, "Selecione uma categoria!","Atenção",2);
            return false;
        }
        
        if(exameB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O valor deve ser superior a 0.","Atenção",2);
            return false;
        }
      
        exameD.editarExame(tabelaDestino,exameB);
        return true;
    }
    
    //método para controlar a exclusão.
    public boolean excluirItem (String tabelaDestino, ExameConvenioBeans exameB){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o exame selecionado?","Atenção",JOptionPane.YES_NO_OPTION, 3);
        if(confirma == JOptionPane.YES_OPTION){
            exameD.deletarExame(tabelaDestino, exameB);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "O exame não foi excluído","Atenção",0);
            return false;
        }
    }
    
}
