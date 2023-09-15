package br.com.controle_estoque.view;

import br.com.controle_estoque.entity.Produto;

import java.util.Scanner;

public class Produto_view {

    Scanner tec = new Scanner(System.in);
    Produto produto_service = new Produto();

    public void
    menu() {
    int opcao;
    int entrar;
    do {
        System.out.println("Escolha a opção desejada:");
        System.out.println("A - Cadastrar");
        System.out.println("B - Editar");
        System.out.println("C - Buscar");
        System.out.println("D - Remover");
        System.out.println("E - Encerrar o sistema");

        System.out.println("->");
        opcao = tec.nextInt();
        entrar = entrar(opcao);
        }while (entrar != 9);
    }
}
