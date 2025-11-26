package apresentacao;

import negocio.Hamburguer;

public class Main {
    public static void main(String[] args) {
        Hamburguer hamburger = new Hamburguer.Builder("caseiro", 1000).comAlface(true).builder();
        System.out.println(hamburger);
        hamburger.setComMolhoDaCasa(true);
        System.out.println(hamburger);

    }
}