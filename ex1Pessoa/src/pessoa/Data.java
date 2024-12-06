/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;
import java.time.LocalDate;

/**
 *
 * @author acer
 */
public class Data{
    private final int dia;
    private final int mes;
    private final int ano;
    private static final String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                                           "Maio", "Junho", "Julho", "Agosto",
                                           "Setembro", "Outubro", "Novembro", "Dezembro"};
    
    public Data(int dia, int mes, int ano){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    
    public static String nomeDoMes(int mes){
        if (0 < mes && mes < 13 )
            return meses[mes-1];
        return null;
    }
    
    public int dia(){
        return dia;
    }
    
    public int mes(){
        return mes;
    }
    
    public int ano(){
        return ano;
    }
    
    @Override
    public String toString() {
        return (dia < 10 ? "0"+dia : dia) + "/" + (mes < 10 ? "0"+mes : mes) + "/" + ano;
    }
    
    public String porExtenso() {
        return (dia < 10 ? "0"+dia : dia) + " de " + nomeDoMes(mes) + " de " + ano;
    }
                        
    public int calculoIdade(){
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - ano;
        if (dataAtual.getMonthValue() < mes)
            idade--;
        if (dataAtual.getMonthValue() == mes &&
            dataAtual.getDayOfMonth() < dia)
            idade--;
        
        return idade;      
    }
    
}