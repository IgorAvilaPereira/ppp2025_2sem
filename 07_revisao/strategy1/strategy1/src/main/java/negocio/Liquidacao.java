package negocio;

// liquidacao dá 20% de desconto
public class Liquidacao implements Promocao {

    @Override
    public double descontar() {
        return 0.80;
    }

}
