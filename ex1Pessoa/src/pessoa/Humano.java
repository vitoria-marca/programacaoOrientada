package pessoa;
/**
 * POO 2024-2
 * @author Vitória Marca Santa Lucia
 */

public class Humano {
    private String nome;
    private float altura;
    private Data nascimento;
    
    //métodos de inicialização
    public Humano(String nome, float altura, Data d ){
        this.nome = nome;
        this.altura = altura;
        this.nascimento = d;
    }
    
    public Humano(){
        this.nome = "Fulaninho";
        this.altura = 0.0f;
        this.nascimento = new Data(1,1,2000);
    }
    
    //métodos de extração de informações
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade() {
        return nascimento.calculoIdade();  // Chama o método apenas quando necessário
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public Data getData(){
        return this.nascimento;
    }
    
    //métodos para alterar diretamente os atributos
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAltura(float a){
        this.altura = a;
    }
    
    public void setNascimento(Data d){
        this.nascimento = d;
    }
    
    public int calcularIdade(){
        return this.nascimento.calculoIdade();
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + calcularIdade() + "\n" +
               "Data de Nascimento: " + nascimento.porExtenso() + "\n" +
               "Altura: " + altura;
    }
}