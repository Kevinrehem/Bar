package model;

public class Cerveja extends Alcoolica{
    private String tipo;

    public Cerveja(int estoque, double preco, String nome, int tamanho, double grauGL, String tipo) {
        super(estoque, preco, nome, tamanho, grauGL);
        this.tipo = tipo;
    }
}
