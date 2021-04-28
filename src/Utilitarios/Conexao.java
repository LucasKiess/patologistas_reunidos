
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    //variaveis que serão utilizadas na conexao do banco de dados
    //banco hospedado na máquina viamao, somente acesso local
    /*private final String URL = "jdbc:mysql://192.168.15.120:3306/labreunidos?allowPublicKeyRetrieval=true&useSSL=false"; //caminho do banco de dados| Sempre usar 'jdbc:mysql:'
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "lucaskiessdba";
    private final String Senha = "Tgv@9120";*/
    
    
   /* private final String URL = "jdbc:mysql://labreunidos.mysql.uhserver.com:3306/labreunidos"; //caminho do banco de dados| Sempre usar 'jdbc:mysql:'
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "labpatoreu2019";
    private final String Senha = "patosis2019@";
    */
    
    private final String URL = "jdbc:mysql://127.0.0.1/labreunidos?serverTimezone=UTC"; //caminho do banco de dados| Sempre usar 'jdbc:mysql:'
    private final String Driver = "com.mysql.cj.jdbc.Driver";
    private final String Usuario = "root";
    private final String Senha = "";
    
    
    private static Connection Con;
    
    public Conexao(){
        try {
            Class.forName(Driver);
            Con = DriverManager.getConnection(URL,Usuario,Senha);
            Con.setAutoCommit(false);
            //JOptionPane.showMessageDialog(null, "Conectado com o banco.","Sucesso",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados","Atenção",0);
            System.out.println(e);
            System.exit(0);
        }
    }
    
    public static Connection getConnection(){
        if(Con == null){
            new Conexao();
        }
        return Con;
    }
    
    public static void fecharConexao(){
        try {
            if(!Con.isClosed()){
                //Con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]){
       Conexao.getConnection();
    }
}

    

