package model;


public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        super(beverage);
        this.description = "Milk";
        this.cost = 10.00;
    }
   
    
}
