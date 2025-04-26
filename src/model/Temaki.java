package model;

import java.util.ArrayList;

public class Temaki extends Sushi{
    private double combo;

    public Temaki(int estoque, double preco, String nome, ArrayList<String> ingredientes, double combo) {
        super(estoque, preco, nome, ingredientes);
        this.combo = combo;
    }
}
