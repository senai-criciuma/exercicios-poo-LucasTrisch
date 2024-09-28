package Exer36;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantitadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantitadeEstoque() {
        return quantitadeEstoque;
    }

    public void setQuantitadeEstoque(int quantitadeEstoque) {
        this.quantitadeEstoque = quantitadeEstoque;
    }
}
