package model;

import java.util.ArrayList;

public class Porcao extends Comida{
    private String molho;

    public Porcao(int estoque, double preco, String nome, ArrayList<String> ingredientes, String molho) {
        super(estoque, preco, nome, ingredientes);
        this.molho = molho;
    }
}
