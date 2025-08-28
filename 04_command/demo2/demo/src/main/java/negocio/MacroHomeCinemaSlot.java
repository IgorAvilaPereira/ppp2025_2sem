package negocio;

import dispositivos.Projetor;
import dispositivos.SoundBar;

public class MacroHomeCinemaSlot implements Command {
    private Projetor projetor;
    private SoundBar soundBar;

    public MacroHomeCinemaSlot(Projetor projetor, SoundBar soundBar){
        this.projetor = projetor;
        this.soundBar = soundBar;
    }

    @Override
    public void execute() {
        System.out.println("modo cinema ativado");
        this.projetor.setLigado(1);
        this.soundBar.setOn(true);
    }

    @Override
    public void undo() {
        System.out.println("modo cinema desativado");
        this.projetor.setLigado(0);
        this.soundBar.setOn(false);
    }
}
