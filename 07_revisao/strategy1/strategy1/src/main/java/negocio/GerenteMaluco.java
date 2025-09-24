package negocio;

import java.util.Random;

public class GerenteMaluco implements Promocao {

    @Override
    public double descontar() {
        double desconto = new Random().nextDouble(1.0);
        System.out.printf("Desconto obtido: %.2f", desconto);
        System.out.println();
        return desconto;
    }


}
