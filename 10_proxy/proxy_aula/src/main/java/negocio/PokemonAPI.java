package negocio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.json.JSONObject;


public class PokemonAPI implements API {

    public JSONObject info(String pokemonName) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        String url = "https://pokeapi.co/api/v2/pokemon/"+pokemonName;
        HttpRequest request = HttpRequest.newBuilder()
          .GET()
          .timeout(Duration.ofSeconds(10))
          .uri(URI.create(url))
          .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.statusCode());
        return new JSONObject(response.body());

    }
    
}
