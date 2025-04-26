package model;

public abstract class Bebida extends Produto{
    int tamanho;

    public Bebida(int estoque, double preco, String nome, int tamanho) {
        super(estoque, preco, nome);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
