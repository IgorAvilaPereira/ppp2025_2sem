package controller;

import java.util.List;

import model.Pessoa;
import persistence.PessoaDAO;
import io.javalin.http.Context;


public class PessoaListarCommand implements Command {

    private PessoaDAO pessoaDAO;

    public PessoaListarCommand(){
        this.pessoaDAO = new PessoaDAO();
    }

    @Override
    public void execute(Context ctx) {
        List<Pessoa> vet = this.pessoaDAO.listar();
        vet.forEach(p -> System.out.println(p));
        String htmlOutput = "";
        htmlOutput = "<ul>";
        for (Pessoa pessoa : vet) {
            htmlOutput+="<li>"+pessoa.getNome()+"</li>";
        }
        htmlOutput+= "</ul>";
        ctx.html(htmlOutput);
        
    }

}
