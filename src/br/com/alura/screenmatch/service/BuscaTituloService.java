package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.client.OmdbClient;
import br.com.alura.screenmatch.dto.TituloOmdb;
import br.com.alura.screenmatch.mapper.TituloMapper;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.util.GsonFactory;
import com.google.gson.Gson;

import java.io.IOException;

public class BuscaTituloService {

    private final OmdbClient client = new OmdbClient();
    private final Gson gson = GsonFactory.create();

    public Titulo buscar(String nome)
            throws IOException, InterruptedException {

        String json = client.buscar(nome);

        TituloOmdb dto = gson.fromJson(json, TituloOmdb.class);

        return TituloMapper.fromDto(dto);
    }
}