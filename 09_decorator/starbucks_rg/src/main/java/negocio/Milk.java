package negocio;

public class Milk extends CondimentDecorator {
    private String manufactory;

    public Milk(Beverage beverage) {
        super(beverage);
        this.manufactory = "ELEGE";
        // this.description = "Milk";
        this.cost = 11.99;
    }

     public String getDescription(){
        return this.beverage.getDescription() + "\n"+this.description+" fabricado por "+this.manufactory;
    }

}
