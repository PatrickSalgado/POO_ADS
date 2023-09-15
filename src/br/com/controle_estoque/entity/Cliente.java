package br.com.controle_estoque.entity;

import java.time.LocalDate;

public class Cliente {
    private long id_cliente;
    private String nome;
    private String cpf_cnpj;
    private LocalDate data_nasc;
    private String logradouro;
    private int telefone;

    public Cliente(long id_cliente, String nome, String cpf_cnpj, LocalDate data_nasc, String logradouro, int telefone) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.data_nasc = data_nasc;
        this.logradouro = logradouro;
        this.telefone = telefone;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}