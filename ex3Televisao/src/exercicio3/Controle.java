/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 * POO 2024-2
 * @author Vitória Marca Santa Lucia
 */
public class Controle {
    Televisao tv;
    
    public Controle(Televisao tv){
        this.tv = tv;
    }
    
    public void aumentarVolume(){
        tv.aumentarVolume();
    }
        
    public void diminuirVolume(){
        tv.diminuirVolume();
    }
    
    public void aumentarCanal(){
        tv.aumentarCanal();
    }
    public void diminuirCanal(){
        tv.diminuirCanal();
    }
    
    public void setCanal(int canal){
        tv.setCanal(canal);
    }
    
    public void imprimir(){
        tv.imprimir();
    }
}
