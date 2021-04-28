
package Utilitarios;

//classe para conversão de datas Americano Portugues

public class Corretores {
    //americano
    public static String ConverterParaSQL(String Data){
        return Data.substring(6,10) + "-" + Data.substring(3,5) + "-" + Data.substring(0,2);
    }
    //portugues
    public static String ConverterParaJava(String Data){
        return Data.substring(8,10) + "/" + Data.substring(5,7) + "/" + Data.substring(0,4);
    }
    
    public static void main(String args[]){
        System.out.println(Corretores.ConverterParaSQL("27/03/2016"));
        System.out.println(Corretores.ConverterParaJava("2016/03/27"));
    }
}
