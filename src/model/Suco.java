package model;

public class Suco extends Bebida{
    private String sabor;
    private boolean acucar;

    public Suco(int estoque, double preco, String nome, int tamanho, String sabor, boolean acucar) {
        super(estoque, preco, nome, tamanho);
        this.sabor = sabor;
        this.acucar = acucar;
    }
}
