package controller;

import io.javalin.http.Context;


public class PessoaTelaAdicionarCommand implements Command {

    @Override
    public void execute(Context ctx) {
        ctx.html("<form action='/adicionar' method='post'> Nome: <input type='text' name='nome'> <input type='submit' value='Adicionar'> </form>");
    }

}
