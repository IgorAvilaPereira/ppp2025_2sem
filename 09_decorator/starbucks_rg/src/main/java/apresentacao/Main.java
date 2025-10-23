package apresentacao;

import negocio.Beverage;
import negocio.CondimentSpecial;
import negocio.Espresso;
import negocio.Milk;
import negocio.Sugar;

public class Main {
    public static void main(String[] args) {

        Beverage cafeDoIgor = new Espresso();
        System.out.println(cafeDoIgor.getDescription());
        System.out.println(cafeDoIgor.cost());

        System.out.println("-------------------");

        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Sugar(cafeDoIgor);
        cafeDoIgor = new Milk(cafeDoIgor);
        cafeDoIgor = new CondimentSpecial(cafeDoIgor, "Pimenta que cliente trouxe", 1.99);
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();
        cafeDoIgor = cafeDoIgor.removeItem();

        
        System.out.println(cafeDoIgor.getDescription());
        System.out.println(cafeDoIgor.cost());


    }
}