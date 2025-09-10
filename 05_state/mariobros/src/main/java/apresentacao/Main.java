package apresentacao;

import negocio.Mario;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.pegarCogumelo();
        System.out.println(mario.getEstado().hashCode());
        mario.pegarCogumelo();
        System.out.println(mario.getEstado().hashCode());
        mario.pegarFlor();
        System.out.println(mario.getEstado().getClass().getSimpleName());        
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
        System.out.println(mario.getEstado().getClass().getSimpleName());



    }
}