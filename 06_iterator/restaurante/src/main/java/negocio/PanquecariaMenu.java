package negocio;

import java.util.ArrayList;

public class PanquecariaMenu {
    private ArrayList<MenuItem> vetItens;

    public PanquecariaMenu(){
        this.vetItens = new ArrayList<MenuItem>();
        this.adicionarMenuItem(new MenuItem("panqueca de tofu", "tofu bombando", 1.99, true));    
        this.adicionarMenuItem(new MenuItem("panqueca de tofu2", "tofu2 bombando", 1.99, true));    

    }

    public ArrayList<MenuItem> getVetItens(){
        return this.vetItens;
    }

    private void adicionarMenuItem(MenuItem menuItem) {
        this.vetItens.add(menuItem);
    }

}
