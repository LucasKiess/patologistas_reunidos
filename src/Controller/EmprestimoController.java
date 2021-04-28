
package Controller;

import Beans.CaixaBeans;
import Beans.EmprestimoBeans;
import DAO.EmprestimoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class EmprestimoController {
    
    EmprestimoDAO emprestimoD = new EmprestimoDAO();
    
    public EmprestimoController(){
        
    }
    
    public boolean verificarDados(EmprestimoBeans emprestimoB){
        if(emprestimoB.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo nome","Atenção",1);
            return false;
        }
        if(emprestimoB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O valor deve ser superior a 0","Atenção",1);
            return false;
        }
        if(emprestimoB.getData().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        emprestimoD.cadastrar(emprestimoB);
        return true;
    }
    
    public boolean verificarDadosEditar(EmprestimoBeans emprestimoB){
        if(emprestimoB.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo nome","Atenção",1);
            return false;
        }
        if(emprestimoB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O valor deve ser superior a 0","Atenção",1);
            return false;
        }
        if(emprestimoB.getData().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        emprestimoD.editar(emprestimoB);
        return true;
    }
    
    public void controlePesquisa(DefaultTableModel Modelo){
        emprestimoD.apresentarRegistros(Modelo);
    }
    
    public EmprestimoBeans controlePreencherCampos(int Codigo){
        return emprestimoD.preencherCampos(Codigo);
    }
    
    public double controleTotalPendente(String Situacao){
        return emprestimoD.calcularTotalPendente(Situacao);
    }
}
