package model;

import java.util.ArrayList;

public abstract class Sushi extends Comida {
    public Sushi(int estoque, double preco, String nome, ArrayList<String> ingredientes) {
        super(estoque, preco, nome, ingredientes);
    }
}
