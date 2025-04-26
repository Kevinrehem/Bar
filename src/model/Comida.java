package model;

import java.util.ArrayList;

public abstract class Comida extends Produto{
    private ArrayList<Adicionais> adicionais;
    private ArrayList<String> ingredientes;

    public Comida(int estoque, double preco, String nome, ArrayList<String> ingredientes) {
        super(estoque, preco, nome);
        this.adicionais = new ArrayList<>();
        this.ingredientes = ingredientes;
    }

    public ArrayList<Adicionais> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(ArrayList<Adicionais> adicionais) {
        this.adicionais = adicionais;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
