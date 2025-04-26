package model;

public class Dose extends Alcoolica{
    String tipo;

    public Dose(int estoque, double preco, String nome, int tamanho, double grauGL, String tipo) {
        super(estoque, preco, nome, tamanho, grauGL);
        this.tipo = tipo;
    }
}
