package negocio;

public class Condimento extends CondimentDecorator {

    public Condimento(String descricao, double preco, Cafe beverage) {
        super(beverage);
        this.descricao = descricao;
        this.preco = preco;
    }

}
