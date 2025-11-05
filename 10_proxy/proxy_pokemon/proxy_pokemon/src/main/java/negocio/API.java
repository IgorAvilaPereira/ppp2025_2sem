package negocio;

import java.io.IOException;

public interface API {
    public String buscarInfo(String nomePokemon) throws IOException, InterruptedException;

}
