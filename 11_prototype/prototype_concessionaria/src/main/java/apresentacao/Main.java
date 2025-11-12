package apresentacao;

import negocio.*;

public class Main {
    public static void main(String[] args) {
        Registry registry = Registry.getInstance();
        // System.out.println("Registry:"+registry.hashCode());
        Automovel fuscaClone1 = (Automovel) registry.get("fusca").clone();
        Automovel fuscaClone2 = (Automovel) registry.get("fusca").clone();
        fuscaClone1.setAno(1994);
        fuscaClone2.getMotor().setNroCilindradas(1);
        System.out.println(fuscaClone1);
        System.out.println(fuscaClone2);
        // Registry registry2 = Registry.getInstance();
        // System.out.println("Registry:"+registry2.hashCode());


        // Automovel a = new Automovel();
        // a.setModelo("Fiesta");
        // a.setAno(2000);

        // Automovel a2 = a;
        // a2.setAno(2001);

        // System.out.println(a.getAno());
        // System.out.println(a2.getAno());

        
    }
}