/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.FuncionarioDAO;

/**
 *
 * @author iapereira
 */
public class HtmlPaginaFuncionario extends Html {

    private FuncionarioDAO funcionarioDAO;

    public HtmlPaginaFuncionario() {
        super();
        this.funcionarioDAO = new FuncionarioDAO();
    }

    @Override
    protected String showContent() {
        String html = "";
        try {
            List<Funcionario> vetFuncionario = this.funcionarioDAO.listar();
            for (Funcionario funcionario : vetFuncionario) {
                html +=  "*"+funcionario + "<br>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(HtmlPaginaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return html;

    }

}
