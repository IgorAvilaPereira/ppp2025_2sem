package negocio;

public abstract class Beverage {
    protected String description;
    protected double cost;

    public Beverage removeItem() {
        return this;
    }

    public String getDescription() {
        return this.getClass().getSimpleName();
    }

    public abstract double cost();

}
