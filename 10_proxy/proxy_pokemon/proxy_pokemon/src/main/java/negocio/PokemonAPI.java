package negocio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokemonAPI implements API {

    public String buscarInfo(String nomePokemon) throws IOException, InterruptedException {

        // Criar um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Criar a requisição (request)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/"+nomePokemon)).GET() 
                .build();

        // Enviar a requisição e processar a resposta de forma síncrona
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Imprimir o corpo da resposta
        return response.body();
    }

}
