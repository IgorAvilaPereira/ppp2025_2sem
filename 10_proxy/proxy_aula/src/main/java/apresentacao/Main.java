package apresentacao;

import java.io.IOException;

import negocio.PokemonAPI;
import negocio.proxys.PokemonAPIProxyLinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PokemonAPIProxyLinkedHashMap pokemonAPI = new PokemonAPIProxyLinkedHashMap(new PokemonAPI());
        // long start = System.currentTimeMillis();        
        String urlPokemon = pokemonAPI.info("pikachu").getJSONObject("sprites").getString("front_default");
        Runtime.getRuntime().exec("brave-browser " + urlPokemon);       
        // System.out.println("====================");
        // // System.out.println(pokemonAPI.info("onyx").getInt("weight"));
        // System.out.println("====================");
        // System.out.println(pokemonAPI.info("charmander").getInt("weight"));
        // System.out.println("====================");
        // System.out.println(pokemonAPI.info("ditto").getInt("weight"));
        // System.out.println("=====");
        // System.out.println(pokemonAPI.info("pikachu").getInt("weight"));
        // System.out.println("=================");
        // long elapsed = System.currentTimeMillis() - start;
        // System.out.println(elapsed);

        // start = System.currentTimeMillis();        
        // System.out.println(pokemonAPI.info("pikachu"));
        // System.out.println("====================");
        // System.out.println(pokemonAPI.info("pikachu"));
        // System.out.println("=================");
        // elapsed = System.currentTimeMillis() - start;
        // System.out.println(elapsed);


        // PokemonAPIProxy pokemonAPIProxy = new PokemonAPIProxy(new PokemonAPI());       
        // System.out.println(pokemonAPIProxy.info("pikachu"));
      
    }

}