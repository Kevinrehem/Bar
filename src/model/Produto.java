package model;

public abstract class Produto implements Comparable<Produto>{
    private int estoque;
    private double preco;
    private String nome;

    public Produto(int estoque, double preco, String nome) {
        this.estoque = estoque;
        this.preco = preco;
        this.nome = nome.toUpperCase();
    }

    @Override
    public int compareTo(Produto o) {
        return this.nome.compareTo(o.nome);
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
