/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {
    
    
    public Connection getConexao() throws SQLException {
        String host = "localhost";
        String database = "david_carnaval";
        String user = "postgres";
        String password = "postgres";
        String port = "5432";
        
        String url = "jdbc:postgresql://"+host+":"+port+"/"+database;
        
        return DriverManager.getConnection(url, user, password);
    }
    
}
