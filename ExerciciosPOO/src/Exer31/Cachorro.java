package Exer31;

public abstract class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void latir(){
    System.out.println("Latindo");
}
public void correr(){
    System.out.println("Correndo");
}
public void comer(){
    System.out.println("Comendo");
}
}
