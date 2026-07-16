package br.com.alura.screenmatch.mapper;

import br.com.alura.screenmatch.dto.TituloOmdb;
import br.com.alura.screenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.model.Titulo;

public final class TituloMapper {

    private TituloMapper() {

    }

    public static Titulo fromDto(TituloOmdb dto) {

        int ano = 0;
        if (dto.year() != null && !dto.year().equalsIgnoreCase("N/A")) {
            if (dto.year().length() > 4) {
                throw new ErroDeConversaoDeAnoException(
                        "Não consegui converter o ano porque ele possui mais de 4 caracteres."
                );
            }
            ano = Integer.parseInt(dto.year());
        }

        Titulo titulo = new Titulo(
                dto.title(),
                ano
        );

        int duracao = 0;
        if (dto.runtime() != null && !dto.runtime().equalsIgnoreCase("N/A")) {
            String apenasNumeros = dto.runtime().split(" ")[0];
            duracao = Integer.parseInt(apenasNumeros);
        }

        titulo.setDuracaoEmMinutos(duracao);

        return titulo;
    }
}
