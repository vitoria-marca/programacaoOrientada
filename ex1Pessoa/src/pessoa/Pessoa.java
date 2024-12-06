package pessoa;
/**
 * @author Vitória Marca Santa Lucia
 * Exercícios práticos POO 2024-2
 */
public class Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humano vitoria = new Humano("Vitória", 1.7f, new Data(22,8,2002));
        System.out.println(vitoria);
        
        Data x = new Data(23, 9, 2002);
        vitoria.setNascimento(x);
        vitoria.setNome("Fulaninha de Tal");
        vitoria.setAltura(4.5f);
        
        System.out.println(vitoria);
        
    }
    
}
