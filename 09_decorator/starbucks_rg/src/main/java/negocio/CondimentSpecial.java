package negocio;

public class CondimentSpecial extends CondimentDecorator {

    public CondimentSpecial(Beverage beverage, String name, double cost) {
        super(beverage);
        this.description = name;
        this.cost = cost;
    }

}
