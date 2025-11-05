package apresentacao;

import java.io.IOException;

import negocio.PokemonAPI;
import negocio.proxys.PokemonAPIProxyRedis;

public class MainRedis {
    public static void main(String[] args) throws IOException, InterruptedException {
        PokemonAPIProxyRedis pokemonAPI = new PokemonAPIProxyRedis(new PokemonAPI());
        System.out.println(pokemonAPI.info("pikachu").getJSONObject("species").getString("name"));

      
    }

}