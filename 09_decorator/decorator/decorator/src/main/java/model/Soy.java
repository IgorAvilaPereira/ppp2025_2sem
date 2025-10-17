package model;


public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        super(beverage);
        this.description = "Soy";
        this.cost = 2.00;
    }
   
    
}
