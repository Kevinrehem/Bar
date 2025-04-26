package model;

public abstract class Alcoolica extends Bebida {
    protected double grauGL;

    public Alcoolica(int estoque, double preco, String nome, int tamanho, double grauGL) {
        super(estoque, preco, nome, tamanho);
        this.grauGL = grauGL;
    }
}
