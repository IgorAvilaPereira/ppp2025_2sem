package apresentacao;

import java.util.HashMap;
import java.util.Map;

import io.javalin.Javalin;
import negocio.Command;
import negocio.ListaDigimonCommand;
import negocio.ListaPokemonComand;
import negocio.NoCommand;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/).start(7070);
        Map<String, Command> commands = new HashMap<String, Command>();        

        Command listaDigimon = new ListaDigimonCommand();
        Command listaPokemon = new ListaPokemonComand();

        commands.put("listaPokemon", listaPokemon);
        commands.put("listaDigimon", listaDigimon);

        // pagina inicial    
        app.get("/", ctx -> {
            Command c = new NoCommand();                            
            ctx.html(c.execute());   
        });

        // demais rotas
        app.get("/{command}", ctx -> {
            Command c = null;
            if (commands.get(ctx.pathParam("command")) != null) {            
                c = commands.get(ctx.pathParam("command"));                        
            } else {
                c = new NoCommand();                
            }
            ctx.html(c.execute());   
        });


        // listando pokemons
        // app.get("/pokemon", ctx -> {
        //     // logica da requisicao
        //     ctx.html(listaPokemon.execute());
        // });

        

            
    }
}