package br.com.controle_estoque.entity;

public class Marca {
    public long getId_marca() {
        return id_marca;
    }

    public Marca(long id_marca, String nome) {
        this.id_marca = id_marca;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId_marca(long id_marca) {
        this.id_marca = id_marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private long id_marca;
    private String nome;
}
