package apresentacao;

import negocio.PatoBranco;
import negocio.Quack;
import negocio.QuackEstiloso;
import negocio.SemSom;
import negocio.VoarBasico;

public class Main {
    public static void main(String[] args) {

        PatoBranco patoBranco = new PatoBranco();
        patoBranco.setAltura(1);
        patoBranco.setPeso(2);
        patoBranco.setComportamentoVoo(new VoarBasico());
        patoBranco.setComportamentoSom(new QuackEstiloso());
        patoBranco.getComportamentoSom().emitirSom();
        // System.out.println("o não, tomei um tiro de pistola! ai ai ai");
        // patoBranco.setComportamentoSom(new SemSom());
        // patoBranco.getComportamentoSom().emitirSom();

    }
}