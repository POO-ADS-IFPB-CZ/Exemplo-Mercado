package view;

import model.Categoria;
import model.Produto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static Produto produto;
    private static DateTimeFormatter formatter;
    private static Scanner scanner;

    public static void main(String[] args) {

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        scanner = new Scanner(System.in);
        produto = new Produto();

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
                case 2:
                    exibirProduto();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }

    }

    private static void exibirProduto() {
        System.out.println("Código: "+produto.getCodigo());
        System.out.println("Descricao: "+produto.getDescricao());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Validade: "+produto.getValidade().format(formatter));
        System.out.println("Estoque: "+produto.getEstoque());
        System.out.println("Categoria: "+produto.getCategoria());
    }

    private static void cadastrarProduto() {
        System.out.println("Informe a descrição: ");
        String descricao = scanner.nextLine();
        produto.setDescricao(descricao);
        System.out.println("Informe o valor: ");
        float valor = scanner.nextFloat();
        scanner.nextLine();
        produto.setValor(valor);
        System.out.println("Informe a validade: ");
        String validade = scanner.nextLine();
        LocalDate dataValidade = LocalDate.parse(validade, formatter);
        produto.setValidade(dataValidade);
        System.out.println("Informe a Categoria:" +
                "\n1 - Para alimentício" +
                "\n2 - Para limpeza" +
                "\n3 - Para Higiene" +
                "\n4 - Para Bebida");
        int nCategoria = scanner.nextInt();
        scanner.nextLine();
        Categoria categoria;
        if(nCategoria == 1){
            categoria = Categoria.ALIMENTICIO;
        }else if(nCategoria == 2){
            categoria = Categoria.LIMPEZA;
        } else if (nCategoria == 3) {
            categoria = Categoria.HIGIENE;
        }else{
            categoria = Categoria.BEBIDA;
        }
        produto.setCategoria(categoria);
    }

}