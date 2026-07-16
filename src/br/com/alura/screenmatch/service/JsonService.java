package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.util.GsonFactory;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonService {

    public static void salvar(List<Titulo> titulos) {

        Gson gson = GsonFactory.create();

        try(FileWriter escrita =
                    new FileWriter("filmes.json")){

            escrita.write(gson.toJson(titulos));

        }catch(IOException e){

            System.out.println(e.getMessage());

        }

    }

}
