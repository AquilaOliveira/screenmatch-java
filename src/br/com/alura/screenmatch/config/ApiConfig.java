package br.com.alura.screenmatch.config;

public final class ApiConfig {

    private ApiConfig() {}

    public static final String BASE_URL = "https://www.omdbapi.com/";
    public static final String API_KEY = "SUA_CHAVE_DA_API";

    public static void validarConfiguracao() {
        if (API_KEY.isBlank() || API_KEY.equals("SUA_CHAVE_DA_API")) {
            throw new IllegalStateException("""
                    API não configurada.

                    Obtenha uma chave gratuita em:
                    https://www.omdbapi.com/apikey.aspx

                    Depois substitua o valor de API_KEY na classe ApiConfig.
                    """);
        }
    }
}