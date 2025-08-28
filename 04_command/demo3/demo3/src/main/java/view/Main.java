package view;

import java.util.HashMap;

import controller.Command;
import controller.PessoaAdicionarCommand;
import controller.PessoaListarCommand;
import controller.PessoaTelaAdicionarCommand;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Command> rotas = new HashMap();
        rotas.put("listar", new PessoaListarCommand());
        rotas.put("tela_adicionar", new PessoaTelaAdicionarCommand());
        rotas.put("tela_adicionar", new PessoaTelaAdicionarCommand());
        rotas.put("adicionar", new PessoaAdicionarCommand());

        var app = Javalin.create(/* config */)
                .get("/{command}", ctx -> {
                    try {
                        Command acao = rotas.get(ctx.pathParam("command"));
                        acao.execute(ctx);
                    } catch (Exception e) {
                        ctx.html("<b style='color:red'> Deu Xabum! </b>");
                    }
                    // ctx.result("Testando...");
                })
                .post("/{command}", ctx -> {
                    try {
                        Command acao = rotas.get(ctx.pathParam("command"));
                        acao.execute(ctx);
                    } catch (Exception e) {
                        ctx.html("<b style='color:red'> Deu Xabum! </b>");
                    }

                }).start(7070);
    }
}