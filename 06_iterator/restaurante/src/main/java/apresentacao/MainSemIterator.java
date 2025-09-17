package apresentacao;

import java.util.ArrayList;

import negocio.MenuItem;
import negocio.PanquecariaMenu;
import negocio.RestauranteMenu;

public class MainSemIterator {
    public static void main(String[] args) {
        PanquecariaMenu panquecariaMenu = new PanquecariaMenu();
        RestauranteMenu restauranteMenu = new RestauranteMenu();

        ArrayList<MenuItem> vet = panquecariaMenu.getVetItens();
        for(int i = 0; i < vet.size(); i++){
            System.out.println(vet.get(i));
        }

        MenuItem itens[] = restauranteMenu.getItens();
        for (int i = 0; i < restauranteMenu.getNroDeItens(); i++) {
            System.out.println(itens[i]);            
        }

    }
}