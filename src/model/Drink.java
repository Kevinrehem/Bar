package model;

import java.util.ArrayList;

public class Drink extends Alcoolica{
    ArrayList<String> ingredientes;

    public Drink(int estoque, double preco, String nome, int tamanho, double grauGL, ArrayList<String> ingredientes) {
        super(estoque, preco, nome, tamanho, grauGL);
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
