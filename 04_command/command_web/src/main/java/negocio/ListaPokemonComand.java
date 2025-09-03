package negocio;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ListaPokemonComand implements Command {

    @Override
    public String execute() {
        String urlString = "https://pokeapi.co/api/v2/pokemon";         
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .GET() 
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, BodyHandlers.ofString());
            return response.body().toString();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "deu xabum!";
        

        /*
         * // consultando a api do pokemon
         * String[] nomes = {"Pikachu", "Pikachu2", "Pikachu3"};
         * return String.join(", ", nomes);
         */
    }

}
