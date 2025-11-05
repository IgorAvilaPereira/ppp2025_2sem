package negocio.proxys;

import java.io.IOException;

import org.json.JSONObject;

import negocio.API;
import negocio.PokemonAPI;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

// instalar Redis via docker
//-- 1ª vez
//docker run --name redis -p 6379:6379 -d redis:latest
//docker exec -it redis redis-cli
//-- demais vezes
//sudo docker start redis
//sudo docker exec -it redis redis-cli

public class PokemonAPIProxyRedis implements API {
    private JedisPool pool;
    private PokemonAPI pokemonAPI;

    public PokemonAPIProxyRedis(PokemonAPI pokemonAPI) {
        this.pool = new JedisPool("localhost", 6379);
        this.pokemonAPI = new PokemonAPI();
    }

    @Override
    public JSONObject info(String pokemonName) throws IOException, InterruptedException {
        try (Jedis jedis = pool.getResource()) {
            if (jedis.get(pokemonName) == null) {
                jedis.setex(pokemonName, 5, this.pokemonAPI.info(pokemonName).toString());
            }
            return new JSONObject(jedis.get(pokemonName));
        }

    }

}
