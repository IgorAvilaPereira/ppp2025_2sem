package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
    private String host;
    private String port;
    private String dbname;
    private String username;
    private String password;

    public ConexaoPostgreSQL(){
        this.host = "localhost";
        this.port = "5432";
        this.dbname = "cinema";
        this.username = "postgres";
        this.password = "postgres";
    }

    public Connection getConexao(){
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+dbname;
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
