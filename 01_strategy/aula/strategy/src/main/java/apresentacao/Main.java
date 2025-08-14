package apresentacao;

import negocio.Peru;
import negocio.patos.PatoBranco;
import negocio.som.Quack;
import negocio.som.QuackEstiloso;
import negocio.som.SemSom;
import negocio.voo.VoarBasico;

public class Main {
    public static void main(String[] args) {

        PatoBranco patoBranco = new PatoBranco();
        patoBranco.setAltura(1);
        patoBranco.setPeso(2);
        // patoBranco.setComportamentoVoo(new VoarBasico());
        patoBranco.setComportamentoSom(new QuackEstiloso());
        patoBranco.getComportamentoSom().emitirSom();
        // System.out.println("o não, tomei um tiro de pistola! ai ai ai");
        // patoBranco.setComportamentoSom(new SemSom());
        // patoBranco.getComportamentoSom().emitirSom();

        // Peru peruzinho = new Peru();
        // peruzinho.setAltura(1);
        // peruzinho.setNome("Peruzinho");
        // peruzinho.setVoo(new VoarBasico());
        // peruzinho.setSom(new SemSom());
        // peruzinho.getVoo().voar();

    }
}