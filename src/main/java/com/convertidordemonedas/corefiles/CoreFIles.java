package com.convertidordemonedas.corefiles;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.convertidordemonedas.monedas.MonedaRecord;
import com.google.gson.Gson;

public class CoreFIles {

     // uso de api

     public static MonedaRecord usoApi(String url){
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        MonedaRecord moneda = null;
        try{
            HttpResponse<String> response = cliente.send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedaRecord.class );
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
        return moneda;
     }

}
