package negocio;

import dispositivos.Sprinkler;

public class SprinklerSlot implements Command {
    private Sprinkler sprinkler;

    public SprinklerSlot(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        this.sprinkler.timer(1);

    }

    @Override
    public void undo() {
        this.sprinkler.setLigado(0);
    }

}
