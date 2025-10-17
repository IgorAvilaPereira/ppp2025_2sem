package model;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "\n" + this.description + ":"+this.cost;
    }

    @Override
    public double cost() {
        return this.cost + this.beverage.cost();
    }
}
