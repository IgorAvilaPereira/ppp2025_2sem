package model;

public class Sugar extends CondimentDecorator {

    public Sugar(Beverage beverage){
        super(beverage);
        this.description = "Sugar";
        this.cost = 1.00;
    }

   
    
}
