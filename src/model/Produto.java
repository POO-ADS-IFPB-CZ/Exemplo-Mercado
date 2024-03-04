package model;

import java.time.LocalDate;

public class Produto {

    private static int contador;
    private final int codigo;
    private String descricao;
    private float valor;
    private LocalDate validade;
    private int estoque;

    public Produto(String descricao, float valor,
                   LocalDate validade){
        codigo = ++contador;
        this.descricao = descricao;
        this.valor = valor;
        this.validade = validade;
        estoque = 0;
    }

    public static int getContador(){
        return contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
