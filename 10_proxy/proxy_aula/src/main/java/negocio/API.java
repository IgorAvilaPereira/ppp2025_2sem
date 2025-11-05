package negocio;

import java.io.IOException;

import org.json.JSONObject;



public interface API {
    public JSONObject info(String pokemonName) throws IOException, InterruptedException;


    
}
