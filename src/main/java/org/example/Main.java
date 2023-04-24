package org.example;

public class Main {
    public static void main(String[] args) {
        Tomate tomate1 = new Tomate("vermelho", 32, 21.00);
        Tomate tomate2 = new Tomate("verde", 25, 4.00);

        System.out.println("Cor do tomate é " + tomate1.getCor());
        System.out.println("Preoço do tomate é " + tomate1.getPreco());
        System.out.println("O tomate tem " + tomate1.getQntSementes() + "sementes");
        System.out.println(tomate2);

    }
}