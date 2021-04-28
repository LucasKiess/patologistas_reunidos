
package Controller;

import Beans.ReciboBeans;
import GUI.PrincipalTela;
import Utilitarios.Conexao;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class ReciboController {
    ReciboBeans reciboB = new ReciboBeans();
    Connection conexao = Conexao.getConnection();
    
    public ReciboController(){
        
    }
    
    public boolean controleImpressao(ReciboBeans reciboB){
        try {
                //caminho local - arquivos não vão junto ao .jar
                //caminho do pacote - arquivos vão junto ao .jar (forma correta)
                Map filtro = new HashMap();

                filtro.put("nome", reciboB.getNome());
                filtro.put("cpf", reciboB.getCpf());
                filtro.put("valor", reciboB.getValor());
                filtro.put("exame", reciboB.getTipo());
                filtro.put("convenio", reciboB.getConvenio());
                filtro.put("data", reciboB.getData());

                InputStream caminho = getClass().getResourceAsStream("/Relatorios/recibo.jasper");
                JasperPrint print = JasperFillManager.fillReport(caminho,filtro,conexao);
                JasperExportManager.exportReportToPdf(print);
                JasperViewer.viewReport(print,false);
                return true;
            } catch (JRException ex) {
                Logger.getLogger(PrincipalTela.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
    
    
}
