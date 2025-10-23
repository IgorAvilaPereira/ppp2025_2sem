package negocio;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
        this.beverage.description = beverage.getClass().getSimpleName();
    }

    public String getDescription() {
        return this.beverage.getDescription() + "\n" + this.description;
    }

    public double cost() {
        return this.beverage.cost() + this.cost;
    }

    @Override
    public Beverage removeItem() {
        return this.beverage;
    }
}
