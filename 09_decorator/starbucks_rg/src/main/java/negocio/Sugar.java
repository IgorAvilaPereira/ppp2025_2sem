package negocio;

public class Sugar extends CondimentDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
        this.description = "Açucar";
        this.cost = 1.99;
    }

}
