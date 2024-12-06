/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 * POO 2024-2
 * @author Vitória Marca Santa Lucia
 */
public class Televisao {
    private int volume;
    private int canal;
    private int numeroCanais;
    private final int MAX_VOLUME = 10;
    
    public Televisao(int numeroCanais){
        this.volume = 0;
        this.canal = 0;
        this.numeroCanais = numeroCanais; 
    }
    
    
    public void aumentarVolume(){
        if (this.volume == MAX_VOLUME){
            System.out.println("O volume ja esta no maximo");
        } else {
            this.volume += 1;
        }
    }
    public void diminuirVolume(){
        if (this.volume == 0){
            System.out.println("O volume ja esta no minimo");
        } else {
            this.volume -= 1;
        }
    }
    
    public void aumentarCanal(){
        if (this.canal == this.numeroCanais){
            System.out.println("Nao ha mais canais");
        } else {
            this.canal += 1;
        }
    }
    public void diminuirCanal(){
        if (this.canal == 0){
            System.out.println("Nao ha mais canais");
        } else {
            this.canal -= 1;
        }
    }
    
    public void setCanal(int canal){
        if (canal > this.numeroCanais){
            System.out.println("Canal fora do alcance");
        } else {
            this.canal = canal;
        }
    }
    
    public void imprimir(){
        System.out.println("Canal: "+ this.canal + "\n"
                        + "Volume: "+this.volume);
    }
 
}
