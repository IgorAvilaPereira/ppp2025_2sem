/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import io.javalin.Javalin;
import negocio.Html;
import negocio.HtmlPaginaFuncionario;

/**
 *
 * @author iapereira
 */
public class MainWeb {

    public static void main(String[] args) {

        Html paginaF = new HtmlPaginaFuncionario();

        var app = Javalin.create()
                .get("/", ctx -> ctx.result(paginaF.render("pagina bonita")))
                .start(7070);

    }

}
