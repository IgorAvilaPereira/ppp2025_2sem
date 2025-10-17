package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import model.Customer;
import model.Order;

public class OrderDAO {

    public String analyzeQuery(String query) throws SQLException{
        String sql = "explain analyze "+query;
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        String output = "";
        if (rs.next()){
            output = rs.getString(1);
        }
        preparedStatement.close();
        connection.close();
        return output;
        


    }

    public Order findById(int id) throws SQLException {
        Order order = new Order();
        String sql = "SELECT orders.id as order_id, created_at, cost, details, name, customer_id FROM orders INNER JOIN customers ON (orders.customer_id = customers.id) WHERE orders.id = ?;";
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
            order.setId(rs.getInt("order_id"));
            order.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
            order.setCost(rs.getDouble("cost"));
            order.setDescription(rs.getString("details"));

            Customer customer = new Customer();
            customer.setId(rs.getInt("customer_id"));
            customer.setName(rs.getString("name"));
        }
        preparedStatement.close();
        connection.close();
        return order;

    }

    public boolean delete(int id) throws SQLException{
        String sql = "DELETE FROM orders WHERE id = ?;";
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int linhasAfetadas = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        return linhasAfetadas == 1;

    }

    public boolean save(Order order) throws SQLException{
        String sql = "INSERT INTO orders (details, created_at, cost, customer_id) VALUES (?,?,?,?) RETURNING id;";
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, order.getDetails());
        preparedStatement.setTimestamp(2, Timestamp.valueOf(order.getCreatedAt()));
        preparedStatement.setDouble(3, order.getCost());
        preparedStatement.setInt(4, order.getCustomer().getId());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
            order.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        connection.close();
        return order.getId() != 0;
        
    }

    public boolean update(Order order) throws SQLException{
        String sql = "UPDATE orders SET details = ?, cost = ? WHERE id = ?;";
        Connection connection = new ConnectionPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, order.getDetails());
        preparedStatement.setDouble(2, order.getCost());
        preparedStatement.setInt(3, order.getId());
        int linhasAfetadas = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        return linhasAfetadas == 1;

    }
    
}
