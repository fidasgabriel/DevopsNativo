package org.example;

public class Tomate {
    private String cor;
    private int qntSementes;
    private double preco;

    public Tomate(String cor, int qntSementes, double preco) {
        this.cor = cor;
        this.qntSementes = qntSementes;
        this.preco = preco;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQntSementes() {
        return this.qntSementes;
    }

    public void setQntSementes(int qntSementes) {
        this.qntSementes = qntSementes;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
