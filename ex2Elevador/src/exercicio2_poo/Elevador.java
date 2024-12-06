/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2_poo;

/**
 *
 * @author acer
 */
public class Elevador {
    private int atual;
    private int andares;
    private int capacidade;
    private int usuarios;
    
    public Elevador(int capacidade, int andares){
        this.capacidade = capacidade;
        this.andares = andares;
        this.atual = 0;
        this.usuarios = 0;
    }
    
    public void entra(){
        if (this.usuarios + 1 > this.capacidade)
            System.out.println("Elevador cheio");
        else
            this.usuarios += 1;   
    }
    
    public void sai(){
        if (this.usuarios == 0)
            System.out.println("O elevador ja esta vazio");
        else
            this.usuarios-=1;
    }
    
    public void sobe(){
        if (this.atual == this.andares)
            System.out.println("Você já está no topo do prédio");
        else
            this.atual+=1;
    }
    
    public void desce(){
        if (this.atual == 0)
            System.out.println("O elevador já está no térreo");
        else
            this.atual -=1;
    }
       
    public void imprimir() {
        
        System.out.println("Andar atual: " + this.atual  + " | Andares no prédio: " + this.andares + "\n" +
               "Usuários atual "+ this.usuarios + "|| Capacidade máxima: "+ this.capacidade);
    }
    
    
    
}
