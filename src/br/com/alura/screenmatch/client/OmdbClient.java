package br.com.alura.screenmatch.client;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import br.com.alura.screenmatch.config.ApiConfig;

public class OmdbClient {

    private final HttpClient client =
            HttpClient.newHttpClient();

    public String buscar(String titulo)
            throws IOException, InterruptedException {

        ApiConfig.validarConfiguracao();

        String endereco = String.format(
                "%s?t=%s&apikey=%s",
                ApiConfig.BASE_URL,
                URLEncoder.encode(titulo, StandardCharsets.UTF_8),
                ApiConfig.API_KEY
        );

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());

        return response.body();

    }

}
