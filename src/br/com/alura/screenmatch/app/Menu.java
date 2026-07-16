package br.com.alura.screenmatch.app;

import java.util.Scanner;

public class Menu {

    private final Scanner leitura = new Scanner(System.in);

    public int exibir() {

        System.out.println("""
                
                ===============================
                      ScreenMatch
                ===============================
                
                1 - Buscar título
                2 - Listar títulos pesquisados
                3 - Salvar em JSON
                
                0 - Sair
                
                ===============================
                """);

        System.out.print("Escolha uma opção: ");

        return Integer.parseInt(leitura.nextLine());
    }

    public String lerTitulo() {

        System.out.print("Digite o nome do filme ou série: ");

        return leitura.nextLine();
    }

    public void fechar() {
        leitura.close();
    }
}