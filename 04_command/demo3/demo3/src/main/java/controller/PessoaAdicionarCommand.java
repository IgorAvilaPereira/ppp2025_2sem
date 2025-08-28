package controller;

import io.javalin.http.Context;
import model.Pessoa;
import persistence.PessoaDAO;

public class PessoaAdicionarCommand implements Command {
    private PessoaDAO pessoaDAO;

    

    @Override
    public void execute(Context ctx) {
        this.pessoaDAO = new PessoaDAO();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(ctx.formParam("nome"));
        boolean result  = this.pessoaDAO.adicionar(pessoa);
        ctx.html("Adicionado:?"+result+ ">>>>"+ctx.formParam("nome") + " com sucesso!");
        
    }

}
