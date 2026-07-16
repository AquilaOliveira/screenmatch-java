package br.com.alura.screenmatch.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFactory {

    private GsonFactory(){}

    public static Gson create(){

        return new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(
                        FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

    }

}
