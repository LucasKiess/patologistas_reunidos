
package Controller;

import Beans.ListaTelefonicaBeans;

import DAO.ListaTelefonicaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ListaTelefonicaController {
    
    ListaTelefonicaDAO listaD = new ListaTelefonicaDAO();
    
    
    public ListaTelefonicaController(){
        
    }
    
    //método para verificar se existe campo vazio e cadastrar no banco
    public boolean verificarDados(ListaTelefonicaBeans listaB){
        if(listaB.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo nome!","Atenção",2);
            return false;
        }
        
        if(listaB.getCelular().equals("") && listaB.getTelefone().equals("")){
            JOptionPane.showMessageDialog(null, "Para registrar um contato, é necessário pelo menos um número. \nPreencha celular ou telefone.","Atenção",2);
            return false;
        }
        
        if(!listaB.getCelular().equals("") || !listaB.getTelefone().equals("")){
            listaD.cadastrarContato(listaB);
        }
        
        return true;
    }
    
    //método para controlar o resultado do banco nas tabelas da tela
    public void controlePesquisa(DefaultTableModel Modelo){
        listaD.apresentarContatos(Modelo);
    }
    
    //método para controlar o resultado do banco nas tabelas da tela de acordo com a busca digitada no campo de texto
    public void controlePesquisaDigitada(String Pesquisa, DefaultTableModel Modelo){
        listaD.buscarContato(Pesquisa, Modelo);
    }
    
    //método para controlar o preenchimento dos campos da tela
    public ListaTelefonicaBeans controlePreencherCampos(int Codigo){
       return listaD.preencherCampos(Codigo);
    }
    
    //método para verificar se existe campo vazio e editar no banco
    public boolean verificarDadosEditar(ListaTelefonicaBeans listaB){
        if(listaB.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo nome!","Atenção",2);
            return false;
        }
        
        if(listaB.getCelular().equals("") && listaB.getTelefone().equals("")){
            JOptionPane.showMessageDialog(null, "Para registrar um contato, é necessário pelo menos um número. \nPreencha celular ou telefone.","Atenção",2);
            return false;
        }
        
        if(!listaB.getCelular().equals("") || !listaB.getTelefone().equals("")){
            listaD.editarContato(listaB);
        }
        
        return true;
    }
    
    //método para controlar a exclusão.
    public boolean excluirItem (ListaTelefonicaBeans listaB){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o contato selecionado?","Atenção",JOptionPane.YES_NO_OPTION, 3);
        if(confirma == JOptionPane.YES_OPTION){
            listaD.deletarContato(listaB);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "O contato não foi excluído","Atenção",0);
            return false;
        }
    }
    
}
