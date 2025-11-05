package negocio.proxys;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.JSONObject;

import negocio.API;
import negocio.PokemonAPI;

// Usando de forma didatica a estrutura de LinkedHashMap como cache. Lembrando dos problemas: o programa termina, o cache termina. 
//  e enquanto o programa roda, não implementamos nenhuma forma de expirar os pokemons adicionados previamente neste cache
public class PokemonAPIProxyLinkedHashMap implements API {
    public static final int MAX_CACHE = 2;

    private PokemonAPI pokemonAPI;
    private LinkedHashMap<String, JSONObject> cache;
    private int size;

    public PokemonAPIProxyLinkedHashMap(PokemonAPI pokemonAPI){
        this.pokemonAPI = pokemonAPI;
        this.cache = new LinkedHashMap<String, JSONObject>();
        this.size = 0;
    }

    @Override
    public JSONObject info(String pokemonName) throws IOException, InterruptedException {        
        //  testa se o pokeman ja existe no cache
        if (cache.get(pokemonName) == null) {
            if (size < MAX_CACHE) {
                // se nao, fazemos o inevitavel, chamamos o real metodo
                cache.put(pokemonName, this.pokemonAPI.info(pokemonName));
                this.size++;
                // System.out.println("size:"+size);
            } else {
                // removendo do cache
                System.out.println(cache.entrySet().iterator().next().getKey() + " saiu e "+pokemonName+ " entrou");
                cache.remove(cache.entrySet().iterator().next().getKey());
                cache.put(pokemonName, this.pokemonAPI.info(pokemonName));
            }
        } 
        return cache.get(pokemonName);

    }
    
}
