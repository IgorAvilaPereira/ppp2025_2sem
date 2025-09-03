package apresentacao;

import negocio.Controle;
import negocio.HomeTheather;
import negocio.HomeTheatherCommand;
import negocio.MacroCinemaEmCasaCommand;
import negocio.TvSamsung;
import negocio.TvSamsungCommand;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        TvSamsung tvSamsung = new TvSamsung();
        HomeTheather homeTheather = new HomeTheather();

        // controle.alocaDispositivo(0, new MacroCinemaEmCasaCommand(tvSamsung, homeTheather));
        // controle.apertarBotaoOn(0);

        controle.apertarUndoGeral();

        /*
        controle.alocaDispositivo(0, new TvSamsungCommand(tvSamsung));
        controle.apertarBotaoOn(0);
        controle.alocaDispositivo(1, new HomeTheatherCommand(homeTheather));
        controle.apertarBotaoOn(1);
        */
    }
}