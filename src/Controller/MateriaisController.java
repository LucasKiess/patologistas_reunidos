
package Controller;

import Beans.MateriaisBeans;
import DAO.MateriaisDAO;
import GUI.PrincipalTela;
import Utilitarios.Conexao;
import java.io.InputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lucas
 */
public class MateriaisController {
    
    MateriaisDAO materiaisD = new MateriaisDAO();
    Connection conexao = Conexao.getConnection();
    
    public MateriaisController(){
        
    }
    
    public void controlePesquisa(DefaultTableModel Modelo){
        materiaisD.listarEstoque(Modelo);
    }
    
    public boolean verificaDadosInsereEstoque(MateriaisBeans materiaisB){
        if(materiaisB.getDescricao().equals("Selecione...")){
            JOptionPane.showMessageDialog(null, "Selecione o tipo de material","Atenção",1);
            return false;
        }
        
        if(materiaisB.getQuantidade() == 0){
            JOptionPane.showMessageDialog(null, "A quantidade deve ser superior a 0.","Atenção",1);
            return false;
        }
        materiaisD.inserirEstoque(materiaisB);
        return true;
    }
    
    public boolean verificaDadosRegistraEntrada (MateriaisBeans materiaisB){
        if(materiaisB.getDescricao().equals("Selecione...")){
            JOptionPane.showMessageDialog(null, "Selecione o tipo de material","Atenção",1);
            return false;
        }
        
        if(materiaisB.getQuantidade() == 0){
            JOptionPane.showMessageDialog(null, "A quantidade deve ser superior a 0.","Atenção",1);
            return false;
        }
        materiaisD.registraEntrada(materiaisB);
        return true;
    }
    
    public boolean verificaDadosRegistraSaida (MateriaisBeans materiaisB){
        if(materiaisB.getDescricao().equals("Selecione...")){
            JOptionPane.showMessageDialog(null, "Selecione o tipo de material","Atenção",1);
            return false;
        }
        
        if(materiaisB.getQuantidade() == 0){
            JOptionPane.showMessageDialog(null, "A quantidade deve ser superior a 0.","Atenção",1);
            return false;
        }
        
        
        materiaisD.registraSaida(materiaisB); 
        materiaisD.registraSaidaEstoque(materiaisB);
        return true;
    }
    
    public boolean verificaDataBuscaRelatorio(String dataInicio, String dataFim){
        if(!dataInicio.equals(null) || !dataFim.equals(null)){
            try {
                // botao para chamar o relatório
                //caminho local - arquivos não vão junto ao .jar
                //caminho do pacote - arquivos vão junto ao .jar (forma correta)
                Map filtro = new HashMap();

                filtro.put("dataInicio", dataInicio);
                filtro.put("dataFim", dataFim);

                InputStream caminho = getClass().getResourceAsStream("/Relatorios/relatorioFrascos.jasper");
                JasperPrint print = JasperFillManager.fillReport(caminho,filtro,conexao);
                JasperExportManager.exportReportToPdf(print);
                JasperViewer.viewReport(print,false);
            } catch (JRException ex) {
                Logger.getLogger(PrincipalTela.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }else if(dataInicio.equals(null) || dataFim.equals(null)){
            JOptionPane.showMessageDialog(null, "Os campos data são obrigatórios","Atenção",1);
            return false;
        }
        return false;
    }
}
