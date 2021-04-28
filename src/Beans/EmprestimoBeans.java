
package Beans;

/**
 *
 * @author lucas
 */
public class EmprestimoBeans {
    
    private int Codigo;
    private String Nome;
    private Double Valor;
    private Double TotalPendente;
    private String Data;
    private String Situacao;
    
    public EmprestimoBeans(){
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public Double getTotalPendente() {
        return TotalPendente;
    }

    public void setTotalPendente(Double TotalPendente) {
        this.TotalPendente = TotalPendente;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
    
    
    
    
}
