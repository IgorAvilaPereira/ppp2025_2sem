package negocio;

public class RestauranteMenuIterator implements IteratorMenuItem {
    private RestauranteMenu restauranteMenu;
    private int posicaoAtual;

    public RestauranteMenuIterator(){
        this.restauranteMenu = new RestauranteMenu();
        this.posicaoAtual = 0;
    }

    public RestauranteMenuIterator(RestauranteMenu restauranteMenu){
        this.restauranteMenu = restauranteMenu;
        this.posicaoAtual = 0;
    }

    @Override
    public boolean hasNext() {
        return (this.posicaoAtual < this.restauranteMenu.getNroDeItens());
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.restauranteMenu.getItens()[this.posicaoAtual];
        this.posicaoAtual++;
        return menuItem;
    }

}
