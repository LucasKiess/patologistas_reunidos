
package Controller;

import Beans.UsuarioBeans;
import DAO.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class UsuarioController {
    
    UsuarioDAO usuarioD = new UsuarioDAO();
    public UsuarioController(){
        
    }
    
    public boolean verificarLogin(UsuarioBeans usuarioB){
        if(usuarioB.getUsuario().equals("") && usuarioB.getSenha().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos","Atenção",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!usuarioB.getUsuario().equals("") && usuarioB.getSenha().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo senha","Atenção",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(usuarioB.getUsuario().equals("") && !usuarioB.getSenha().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo usuário","Atenção",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!usuarioB.getUsuario().equals("") && !usuarioB.getSenha().equals("")){
            //JOptionPane.showMessageDialog(null, "Preencha o campo senha","Atenção",JOptionPane.ERROR_MESSAGE);
            usuarioD.realizarLogin(usuarioB);
            return true;
        }
        
        return false;
    }
}
