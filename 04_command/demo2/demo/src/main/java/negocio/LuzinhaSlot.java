package negocio;

import dispositivos.LuzNatal;

public class LuzinhaSlot implements Command {
    private LuzNatal luzinha;
    
    public LuzinhaSlot(LuzNatal luzinha){
        this.luzinha = luzinha;
    }

    @Override
    public void execute() {
        this.luzinha.setLigado(true);
    }

    @Override
    public void undo() {
        this.luzinha.setLigado(false);
    }

}
