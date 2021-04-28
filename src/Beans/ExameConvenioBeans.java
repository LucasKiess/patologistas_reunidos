
package Beans;

/**
 *
 * @author lucas
 */
public class ExameConvenioBeans {
    
    private int Codigo;
    private String Exame;
    private String Categoria;
    private Double Valor;
    private String Observacao;
    
    public ExameConvenioBeans(){
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getExame() {
        return Exame;
    }

    public void setExame(String Exame) {
        this.Exame = Exame;
    }
    
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
    
    
}
