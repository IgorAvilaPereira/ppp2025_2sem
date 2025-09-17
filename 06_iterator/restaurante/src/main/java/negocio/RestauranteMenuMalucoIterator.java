package negocio;

import java.util.Random;

public class RestauranteMenuMalucoIterator implements IteratorMenuItem {
  private RestauranteMenu restauranteMenu;
    private int posicaoAtual;

    public RestauranteMenuMalucoIterator(){
        this.restauranteMenu = new RestauranteMenu();
        this.posicaoAtual = 0;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.restauranteMenu.getItens()[new Random().nextInt(this.posicaoAtual+1)];
        posicaoAtual++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (this.posicaoAtual < this.restauranteMenu.getNroDeItens());
    }

}
