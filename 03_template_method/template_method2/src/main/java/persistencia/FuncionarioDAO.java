/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import negocio.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iapereira
 */
public class FuncionarioDAO {
    
    public List<Funcionario> listar() throws SQLException{
        String sql = "SELECT * FROM funcionarios;";
        List<Funcionario> vetFuncionario = new ArrayList();
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        ResultSet rs = conexao.prepareStatement(sql).executeQuery();
        while(rs.next()){
            Funcionario funcionario = new Funcionario();
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            
            vetFuncionario.add(funcionario);
        }
        conexao.close();
        return vetFuncionario;
    }
    
}
