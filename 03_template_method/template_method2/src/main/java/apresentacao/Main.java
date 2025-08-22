/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.HtmlPaginaContato;
import negocio.Html;
import negocio.HtmlPaginaFuncionario;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Html paginaF = new HtmlPaginaFuncionario();
        System.out.println(paginaF.render("pagina bonita"));

        Html paginaContato = new HtmlPaginaContato();
        System.out.println(paginaF.render("pagina bonita"));

    }
}
