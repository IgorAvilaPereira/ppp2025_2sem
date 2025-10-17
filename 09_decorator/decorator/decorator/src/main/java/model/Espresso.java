package model;

public class Espresso extends Beverage {

    public Espresso(){
        
        this.cost = 1.99;
        this.description = "Espresso:"+this.cost;
    }


    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.cost;
    }
    
}
