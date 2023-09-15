package br.com.controle_estoque.entity;

public class Fornecedor {
    private long id_fornecedor;
    private String nome_fornecedor;
    private String logradouro;
    private String cpf_cnpj;

    public Fornecedor(long id_fornecedor, String nome_fornecedor, String logradouro, String cpf_cnpj) {
        this.id_fornecedor = id_fornecedor;
        this.nome_fornecedor = nome_fornecedor;
        this.logradouro = logradouro;
        this.cpf_cnpj = cpf_cnpj;
    }

    public long getId_fornecedor() {
        return id_fornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setId_fornecedor(long id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
}

