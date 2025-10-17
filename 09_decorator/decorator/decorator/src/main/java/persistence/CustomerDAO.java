package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Customer;

public class CustomerDAO {

    public boolean save(Customer customer) throws SQLException {
        String sql = "INSERT INTO customers (name) VALUES (?) RETURNING id;";
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, customer.getName());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            customer.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        connection.close();
        return customer.getId() != 0;

    }

    public Customer findById(int id) throws SQLException {
        Customer customer = new Customer();
        String sql = "SELECT * FROM customers WHERE id = ?;";
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {

            customer.setId(rs.getInt("id"));
            customer.setName(rs.getString("name"));
        }
        preparedStatement.close();
        connection.close();
        return customer;
    }

}
