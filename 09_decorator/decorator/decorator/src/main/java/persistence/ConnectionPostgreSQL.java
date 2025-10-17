package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgreSQL {
    private String dbname;
    private String username;
    private String password;
    private String port;
    private String host;
    private String url;

    public ConnectionPostgreSQL(){
        this.dbname = "starbucks";
        this.username = "postgres";
        this.password = "postgres";
        this.port = "5432";
        this.host = "localhost";
        this.url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+dbname;
    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }
    
}
