package presentation;

import java.sql.SQLException;

import model.*;
import persistence.CustomerDAO;
import persistence.OrderDAO;

public class MainTerminal {
    public static void main(String[] args) throws SQLException {

        
        Beverage bebida = new Espresso();
        // System.out.println(bebida.getDescription());
        // System.out.println(bebida.cost());
        // System.out.println("====================");
        bebida = new Sugar(bebida);
        bebida = new Sugar(bebida);
        bebida = new Sugar(bebida);
        bebida = new Sugar(bebida);
        bebida = new Sugar(bebida);
        // System.out.println(bebida.getDescription());
        // System.out.println(bebida.cost());
        bebida = new Milk(bebida);
        Order order = new Order();
        order.setBeverage(bebida);
        order.setCustomer(new CustomerDAO().findById(1));
        new OrderDAO().save(order);

        // Order order = new OrderDAO().findById(1);
        // System.out.println(order.getCost());
        // System.out.println(order.getDetails());

        // Customer customer = new Customer();
        // customer.setName("Igor");
        // new CustomerDAO().save(customer);
        // Beverage bebida = new Espresso();
        // Order order = new Order();
        // order.setBeverage(bebida);
        // order.setCustomer(customer);
        // new OrderDAO().save(order);
        // System.out.println(new OrderDAO().findById(2).getDetails());
        // System.out.println(new OrderDAO().analyzeQuery("select * from orders"));


    }
}