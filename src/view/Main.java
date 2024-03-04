package view;

import model.Produto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 5,
                LocalDate.of(2024,6,3));
        Produto produto2 = new Produto("Feijão", 10,
                LocalDate.of(2024,6,3));
        Produto produto3 = new Produto("Açucar", 4,
                LocalDate.of(2024,6,3));

        System.out.println(produto.getCodigo());
        System.out.println(produto2.getCodigo());
        System.out.println(produto3.getCodigo());


    }
}