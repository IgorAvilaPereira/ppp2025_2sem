package negocio;

import java.io.IOException;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class ProxyPokemonAPI implements API {
    private PokemonAPI pokemonAPI;

    private String consultaPokemonRedis(String nomePokemon) {
        String info = null;
        try (JedisPool pool = new JedisPool("localhost", 6379)) {
            try (Jedis jedis = pool.getResource()) {
                info = jedis.get(nomePokemon);
            }
        }
        return info;
    }

    @Override
    public String buscarInfo(String nomePokemon) throws IOException, InterruptedException {
        // if ja tenho a informacao => retorna a informacao
        long inicio = System.currentTimeMillis();
        String info = this.consultaPokemonRedis(nomePokemon);
        if (info != null) {
            long fim = System.currentTimeMillis();
            long tempoDecorrido = fim - inicio;
            System.out.println("Cache: Tempo decorrido em milissegundos: " + tempoDecorrido);
            return info;
        } else {
            // se n tenho ai eh inevitavel buscar pelo objeto real
            if (this.pokemonAPI == null) {
                this.pokemonAPI = new PokemonAPI();
            }
        }
        info = this.pokemonAPI.buscarInfo(nomePokemon);
        this.criaCache(nomePokemon, info);
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Sem cache: Tempo decorrido em milissegundos: " + tempoDecorrido);
        return info;
    }

    private void criaCache(String nomePokemon, String info) {
        try (JedisPool pool = new JedisPool("localhost", 6379)) {
            try (Jedis jedis = pool.getResource()) {
                jedis.setex(nomePokemon, 10, info);
            }
        }
    }

}
