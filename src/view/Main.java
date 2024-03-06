package view;

import model.Produto;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        Produto produto;

        while (true){
            System.out.println("Escolha a opção:" +
                    "\n 1 - Para cadastrar Produto" +
                    "\n 2 - Para exibir Produto" +
                    "\n 3 - Para atualizar Produto" +
                    "\n 4 - Para remover Produto" +
                    "\n 5 - Para sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    cadastrarProduto();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }

    }

    private static void cadastrarProduto() {
    }
}