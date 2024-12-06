/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 * POO 2024-2
 * @author Vitória Marca Santa Lucia
 */
public class Exercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Controle samsung = new Controle (new Televisao(10));
        
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        
        samsung.setCanal(15);
        samsung.imprimir();
        
        
    }
    
}
