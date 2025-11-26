package apresentacao;

import negocio.Inimigo;

public class Main {
    public static void main(String[] args) {
        // singleton
        Inimigo neymar = Inimigo.getInstance();
        System.out.println(neymar.getNome());
        System.out.println(String.join(";", neymar.getHabilidades()));
        System.out.println(neymar.hashCode());

        // prototype
        Inimigo neymarClone = neymar.clone();
        neymarClone.setNome("CR7");
        System.out.println(neymarClone.getNome());
        System.out.println(String.join(";", neymar.getHabilidades()));
        System.out.println(neymarClone.hashCode());



    }
}