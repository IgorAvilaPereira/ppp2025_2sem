package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private int id;
    private Beverage beverage;
    private LocalDateTime createdAt;
    private double cost;
    private String description;
    private Customer customer;

    public Order(){
        this.createdAt = LocalDateTime.now();
    }

    
    
    public Customer getCustomer() {
        return customer;
    }



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    public Beverage getBeverage() {
        return beverage;
    }
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getDetails() {
        if (this.beverage != null) return this.beverage.getDescription();
        return this.description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        if (beverage != null) return beverage.cost();
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Order [id=" + id + ", beverage=" + beverage + ", createdAt=" + createdAt + ", cost=" + cost
                + ", description=" + description + ", customer=" + customer + "]";
    }
    
    
    
    
    
}
