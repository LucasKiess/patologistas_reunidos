
package Controller;

import Beans.CaixaBeans;
import DAO.CaixaDAO;
import GUI.PrincipalTela;
import Utilitarios.Conexao;
import java.io.InputStream;
import java.sql.Connection;
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
public class CaixaController {
    
    Connection conexao = Conexao.getConnection();
    CaixaDAO caixaD = new CaixaDAO();
    
    public CaixaController(){
        
    }
    
    public boolean verificaDadosCaixaEntrada(CaixaBeans caixaB){
        if(caixaB.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição","Atenção",1);
            return false;
        }
        if(caixaB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O campo valor deve ser superior a 0","Atenção",1);
            return false;
        }
        if(caixaB.getData().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        caixaD.cadastrarEntrada(caixaB);
        return true;
    }
    
    public boolean verificaDadosCaixaSaida(CaixaBeans caixaB){
        if(caixaB.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição","Atenção",1);
            return false;
        }
        if(caixaB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O campo valor deve ser superior a 0","Atenção",1);
            return false;
        }
        if(caixaB.getData().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        caixaD.cadastrarSaida(caixaB);
        return true;
    }
    
    public void controlePesquisaEntrada(DefaultTableModel Modelo){
        caixaD.apresentarRegistrosEntrada(Modelo);
    }
    
    public void controlePesquisaSaida(DefaultTableModel Modelo){
        caixaD.apresentarRegistrosSaida(Modelo);
    }
    
    public void controlePesquisaEntreDataCaixaEntrada(DefaultTableModel Modelo, String dataInicio, String dataFim){
        caixaD.buscarPorDataCaixaEntrada(Modelo, dataInicio, dataFim);
    }
    
     public void controlePesquisaEntreDataCaixaSaida(DefaultTableModel Modelo, String dataInicio, String dataFim){
        caixaD.buscarPorDataCaixaSaida(Modelo, dataInicio, dataFim);
    }
    
    public CaixaBeans controlePreencherCamposEntrada(int Codigo){
        return caixaD.preencherCamposEntrada(Codigo);
    }
    
    public CaixaBeans controlePreencherCamposSaida(int Codigo){
        return caixaD.preencherCamposSaida(Codigo);
    }
    
    public boolean verificaDadosEditarCaixaEntrada(CaixaBeans caixaB){
        if(caixaB.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição","Atenção",1);
            return false;
        }
        if(caixaB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O campo valor deve ser superior a 0","Atenção",1);
            return false;
        }
        if(caixaB.getData().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        caixaD.editarEntrada(caixaB);
        return true;
    }
    
    public boolean verificaDadosEditarCaixaSaida(CaixaBeans caixaB){
        if(caixaB.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição","Atenção",1);
            return false;
        }
        if(caixaB.getValor() == 0){
            JOptionPane.showMessageDialog(null, "O campo valor deve ser superior a 0","Atenção",1);
            return false;
        }
        if(caixaB.getData().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        caixaD.editarSaida(caixaB);
        return true;
    }
    
    public boolean controleExcluiCaixaEntrada(CaixaBeans caixaB){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o registro selecionado?","Atenção",JOptionPane.YES_NO_OPTION, 3);
        if(confirma == JOptionPane.YES_OPTION){
            caixaD.deletarEntrada(caixaB);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "O registro não foi excluído","Atenção",0);
            return false;
        }
    }
    
    public boolean controleExcluiCaixaSaida(CaixaBeans caixaB){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o registro selecionado?","Atenção",JOptionPane.YES_NO_OPTION, 3);
        if(confirma == JOptionPane.YES_OPTION){
            caixaD.deletarSaida(caixaB);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "O registro não foi excluído","Atenção",0);
            return false;
        }
    }
    
    public boolean controleEmiteRelatorio(String dataInicioSQL, String dataFimSQL){
        if(!dataInicioSQL.equals(null) || !dataFimSQL.equals(null)){
            try {
                // botao para chamar o relatório
                //caminho local - arquivos não vão junto ao .jar
                //caminho do pacote - arquivos vão junto ao .jar (forma correta)
                Map filtro = new HashMap();

                filtro.put("dataInicio", dataInicioSQL);
                filtro.put("dataFim", dataFimSQL);

                InputStream caminho = getClass().getResourceAsStream("/Relatorios/relatorioCaixa2.jasper");
                JasperPrint print = JasperFillManager.fillReport(caminho,filtro,conexao);
                JasperExportManager.exportReportToPdf(print);
                JasperViewer.viewReport(print,false);
            } catch (JRException ex) {
                Logger.getLogger(PrincipalTela.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }else if(dataInicioSQL.equals(null) || dataFimSQL.equals(null)){
            JOptionPane.showMessageDialog(null, "Os campos data são obrigatórios","Atenção",1);
            return false;
        }
        return false;
    }
}
