
package DAO;

import Beans.UsuarioBeans;
import GUI.LoginTela;
import GUI.PrincipalTela;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class UsuarioDAO {
    
   
    
    public UsuarioDAO(){
        
    }
    
    public void realizarLogin(UsuarioBeans usuarioB){
        try {
            String sql = "select * from usuarios where loginUsu = ? and senhaUsu = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, usuarioB.getUsuario());
            pst.setString(2, usuarioB.getSenha());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                PrincipalTela pt = new PrincipalTela();
                pt.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos.","Atenção",JOptionPane.ERROR_MESSAGE);
                LoginTela.txtUsuario.setText("");
                LoginTela.txtSenha.setText("");
            }
        } catch (Exception e) {
        }
    }
}
