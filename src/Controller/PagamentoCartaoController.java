
package Controller;

import Beans.EmprestimoBeans;
import Beans.PagamentoCartaoBeans;
import DAO.PagamentoCartaoDAO;
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
public class PagamentoCartaoController {
    
    PagamentoCartaoDAO pagamentoD = new PagamentoCartaoDAO();
     Connection conexao = Conexao.getConnection();
     
    public PagamentoCartaoController(){
        
    }
    
    public boolean verificaDados(PagamentoCartaoBeans pagamentoB){
        if(pagamentoB.getExame().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo exame","Atenção",1);
            return false;
        }
        if(pagamentoB.getPaciente().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo paciente","Atenção",1);
            return false;
        }
        if(pagamentoB.getCPF().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF","Atenção",1);
            return false;
        }
        if(pagamentoB.getEndereco().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo endereço","Atenção",1);
            return false;
        }
        if(pagamentoB.getCEP().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP","Atenção",1);
            return false;
        }
        if(pagamentoB.getValor() == null){
            JOptionPane.showMessageDialog(null, "Preencha o campo valor","Atenção",1);
            return false;
        }
        if(pagamentoB.getData().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione a data","Atenção",1);
            return false;
        }
        pagamentoD.inserirRegistro(pagamentoB);
        return true;
    }
    
    public boolean controleExclui(PagamentoCartaoBeans pagamentoB){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o registro selecionado?","Atenção",JOptionPane.YES_NO_OPTION, 3);
        if(confirma == JOptionPane.YES_OPTION){
            pagamentoD.deletar(pagamentoB);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "O registro não foi excluído","Atenção",0);
            return false;
        }
    }
    
    public void controleDePesquisa(DefaultTableModel Modelo){
        pagamentoD.apresentarRegistros(Modelo);
    }
    
    public PagamentoCartaoBeans controlePreencherCampos(int Codigo){
        return pagamentoD.preencherCampos(Codigo);
    }
    
    public void controlePesquisaDigitadaNome(String Pesquisa, DefaultTableModel Modelo){
        pagamentoD.buscarRegistroNome(Pesquisa, Modelo);
    }
    
    public void controlePesquisaDigitadaExame(String Pesquisa, DefaultTableModel Modelo){
        pagamentoD.buscarRegistroExame(Pesquisa, Modelo);
    }
    
    public void controlePesquisaEntreDatas(DefaultTableModel Modelo, String dataInicio, String dataFim){
        pagamentoD.buscarPorData(Modelo, dataInicio, dataFim);
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

                InputStream caminho = getClass().getResourceAsStream("/Relatorios/relatorioCartao.jasper");
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
