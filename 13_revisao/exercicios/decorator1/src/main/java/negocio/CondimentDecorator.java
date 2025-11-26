package negocio;

public abstract class CondimentDecorator extends Cafe {

    protected Cafe beverage;

    public CondimentDecorator(Cafe beverage) {
        this.beverage = beverage;

    }

    public String getDescricao(){
        return this.beverage.getDescricao() + "\n" + this.descricao;
    }

    public double getPreco(){
        return this.beverage.getPreco() + this.preco;
    }    
}
