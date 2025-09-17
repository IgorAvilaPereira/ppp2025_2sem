package negocio;

public class PanquecariaMenuIterator implements IteratorMenuItem {

    private PanquecariaMenu panquecariaMenu;
    private int posicaoAtual;

    public PanquecariaMenuIterator(){
        this.panquecariaMenu = new PanquecariaMenu();
        this.posicaoAtual = 0;
    }

    public PanquecariaMenuIterator(PanquecariaMenu panquecariaMenu) {
        this.panquecariaMenu = panquecariaMenu;
        this.posicaoAtual = 0;
    }

    @Override
    public boolean hasNext() {
        return this.posicaoAtual < this.panquecariaMenu.getVetItens().size();
    }

    @Override
    public MenuItem next() {
        // if (posicaoAtual < this.panquecariaMenu.getVetItens().size()) {
            MenuItem menuItem = this.panquecariaMenu.getVetItens().get(posicaoAtual);
            posicaoAtual++;
            return menuItem;
        // }
    }

}
