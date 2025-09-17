package negocio;

public class RestauranteMenu {
    private static final int MAX = 5;
    private MenuItem vetMenuItem[];
    private int nroDeItens;

    public RestauranteMenu(){
        this.nroDeItens = 0;
        this.vetMenuItem = new MenuItem[MAX];
        addItem(new MenuItem("Carré na chapa", "carne louca de segunda", 1.99, false));
        addItem(new MenuItem("Peixe", "peixe de terça", 2.99, false));

    }

    public MenuItem[] getItens(){
        return this.vetMenuItem;
    }

    public int getNroDeItens(){
        return this.nroDeItens;
    }

    public void addItem(MenuItem menuItem) {
        if (this.nroDeItens < MAX){
            this.vetMenuItem[this.nroDeItens] = menuItem;
            this.nroDeItens++;
        } else {
            throw new IllegalArgumentException("Aqui não dá mais Itens!");
        }        
    }

}
