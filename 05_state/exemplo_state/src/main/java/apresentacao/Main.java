package apresentacao;

import negocio.Mario;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario(2);
        System.out.println(mario.getEstadoAtual().getClass().hashCode());
        mario.sofriDano();
        System.out.println(mario.getEstadoAtual().getClass().hashCode());
        mario.sofriDano();

        mario.sofriDano();

        mario.sofriDano();

        mario.sofriDano();

        // System.out.println(mario.getEstadoAtual().getClass().getSimpleName());
        // mario.sofriDano();
        // System.out.println(mario.getEstadoAtual().getClass().getSimpleName());
        // mario.sofriDano();
        // System.out.println(mario.getEstadoAtual().getClass().getSimpleName());

    }
}