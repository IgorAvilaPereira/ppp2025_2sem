package apresentacao;

import java.io.IOException;

import org.json.JSONObject;

import negocio.PokemonAPI;
import negocio.ProxyPokemonAPI;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        ProxyPokemonAPI proxy = new ProxyPokemonAPI();
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("ditto");
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("pikachu");
        Thread.sleep(20000);
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("ditto");
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("pikachu");
        proxy.buscarInfo("pikachu");
        JSONObject json = new JSONObject(proxy.buscarInfo("ditto"));
        System.out.println("Nome:"+json.get("name"));

    }
}