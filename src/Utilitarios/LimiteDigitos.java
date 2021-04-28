
package Utilitarios;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author lucas
 */

//classe responsável por limitir o tamaho de um textfield
public class LimiteDigitos extends PlainDocument{
    
    private int tamanhoMaximo;
    
    public LimiteDigitos(int maxLen){
        super();
        if(maxLen <= 0)
            throw new IllegalArgumentException("Especifique a quantidade!");
        tamanhoMaximo = maxLen;
        
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr)throws BadLocationException{
        
        if(str == null || getLength()==tamanhoMaximo)
            return;
        int totalQuantia = (getLength()+str.length());
        if(totalQuantia <= tamanhoMaximo){
            super.insertString(offset, str.replaceAll("[^0-9/,.-]", ""), attr);
            return;
        }
        String nova = str.substring(0, getLength()-tamanhoMaximo);
        super.insertString(offset, nova, attr);
    }
    }
    

