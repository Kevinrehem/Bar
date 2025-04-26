package model;

import java.util.ArrayList;

public class Hamburguer extends Comida{
    private double combo;

    public Hamburguer(int estoque, double preco, String nome, ArrayList<String> ingredientes, double combo) {
        super(estoque, preco, nome, ingredientes);
        this.combo = combo;
    }
}
