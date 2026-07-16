package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.service.BuscaTituloService;
import br.com.alura.screenmatch.service.JsonService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    private final Menu menu = new Menu();

    private final BuscaTituloService buscaService =
            new BuscaTituloService();

    private final List<Titulo> titulos =
            new ArrayList<>();

    public void executar() {

        boolean executando = true;

        while (executando) {

            int opcao = menu.exibir(); // <-- aqui

            switch (opcao) {

                case 1 -> buscarTitulo();

                case 2 -> listarTitulos();

                case 3 -> salvarJson();

                case 0 -> executando = false;

                default -> System.out.println("Opção inválida.");
            }
        }

        menu.fechar();

        System.out.println("\nPrograma finalizado.");
    }


    private void buscarTitulo() {

        String busca = menu.lerTitulo();

        try {

            Titulo titulo =
                    buscaService.buscar(busca);

            titulos.add(titulo);

            System.out.println();

            System.out.println(titulo);

        }

        catch (ErroDeConversaoDeAnoException e) {

            System.out.println(e.getMessage());

        }

        catch (IOException e) {

            System.out.println("Erro ao acessar API.");

        }

        catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println("Requisição interrompida.");

        }

    }


    private void listarTitulos() {

        if (titulos.isEmpty()) {

            System.out.println("Nenhum título pesquisado.");

            return;

        }

        System.out.println("\n=== TÍTULOS ===");

        titulos.forEach(System.out::println);

    }


    private void salvarJson() {

        JsonService.salvar(titulos);

        System.out.println("Arquivo salvo com sucesso.");

    }

}