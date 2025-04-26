package model;

public class Refrigerante extends Bebida{
    private int tamanho;

    public Refrigerante(int estoque, double preco, String nome, int tamanho, int tamanho1) {
        super(estoque, preco, nome, tamanho);
        this.tamanho = tamanho1;
    }
}
