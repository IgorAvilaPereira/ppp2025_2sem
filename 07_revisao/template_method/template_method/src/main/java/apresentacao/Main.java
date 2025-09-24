package apresentacao;

import negocio.Comum;
import negocio.Frete;
import negocio.Sedex;

public class Main {
    public static void main(String[] args) {
        Frete sedex = new Sedex();
        sedex.setPeso(100);
        sedex.setValor(100);
        System.out.println(sedex.calculaFrete());

        Frete comum = new Comum();
        comum.setPeso(100);
        comum.setValor(100);
        System.out.println(comum.calculaFrete());
    }
}