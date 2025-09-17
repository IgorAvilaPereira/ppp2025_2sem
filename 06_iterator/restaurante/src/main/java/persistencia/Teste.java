package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teste {

    public void teste() throws SQLException{
        String sql = "SELECT * FROM filme";
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement instrucao = conexao.prepareStatement(sql);
        ResultSet rs = instrucao.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("titulo"));            
        }
        instrucao.close();
        conexao.close();
    }

}
