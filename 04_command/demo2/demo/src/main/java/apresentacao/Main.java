package apresentacao;

import dispositivos.LuzNatal;
import dispositivos.Projetor;
import dispositivos.Radio;
import dispositivos.SoundBar;
import dispositivos.Sprinkler;
import negocio.Controle;
import negocio.LuzinhaSlot;
import negocio.MacroHomeCinemaSlot;
import negocio.RadioSlot;
import negocio.SprinklerSlot;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.adicionarDispositivo(0, new LuzinhaSlot(new LuzNatal()));
        controle.adicionarDispositivo(1, new SprinklerSlot(new Sprinkler()));
        // controle.cliqueiNoOn(1);
        controle.adicionarDispositivo(2, new MacroHomeCinemaSlot(new Projetor(), new SoundBar()));
        controle.cliqueiNoOn(2);
        controle.cliqueiNoOn(3);
    }
}