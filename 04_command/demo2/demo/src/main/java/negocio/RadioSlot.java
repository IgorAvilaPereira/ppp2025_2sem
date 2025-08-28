package negocio;

import dispositivos.Radio;

public class RadioSlot implements Command {

    private Radio radio;
    
    public RadioSlot(Radio radio){
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.setLigado(true);
        this.radio.setFrequencia(97.1);
    }

    @Override
    public void undo() {
        this.radio.setLigado(false);

    }

}
