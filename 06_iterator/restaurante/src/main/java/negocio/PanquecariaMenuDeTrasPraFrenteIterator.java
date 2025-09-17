package negocio;

import java.util.Iterator;

public class PanquecariaMenuDeTrasPraFrenteIterator implements Iterator<MenuItem> {

    private PanquecariaMenu panquecariaMenu;
    private int posicaoAtual;

    public PanquecariaMenuDeTrasPraFrenteIterator(){
        this.panquecariaMenu = new PanquecariaMenu();
        this.posicaoAtual = ((this.panquecariaMenu.getVetItens().size() > 0) 
        ?  this.panquecariaMenu.getVetItens().size()-1 
        : 0);
         
    }
    @Override
    public boolean hasNext() {
        return (this.posicaoAtual >= 0);
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.panquecariaMenu.getVetItens().get(this.posicaoAtual);
        posicaoAtual--;
        return menuItem;
    }

}
