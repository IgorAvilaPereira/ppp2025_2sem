package apresentacao;

import negocio.Cafe;
import negocio.Condimento;

public class Main {
    public static void main(String[] args) {
        Cafe cafeComLeite = new Cafe();
        cafeComLeite = new Condimento("Leite", 1.99, cafeComLeite);
        System.out.println(cafeComLeite.getDescricao());
        System.out.println(cafeComLeite.getPreco());
    }
}