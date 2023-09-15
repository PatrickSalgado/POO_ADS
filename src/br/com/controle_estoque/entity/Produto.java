package br.com.controle_estoque.entity;

public class Produto {
    private long id_produto;
    private String nome;
    private Marca marca;
    private Modelo modelo;
    private int quantidade;
    private int preço;

    public Produto(long id_produto, String nome, Marca marca, Modelo modelo, int quantidade, int preço) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    public long getId_produto() {
        return id_produto;
    }

    public String getNome() {
        return nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getPreço() {
        return preço;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }
}
