package negocio.patos;

import negocio.Pato;
import negocio.som.Quack;
import negocio.voo.VoarBasico;

public class PatoBranco extends Pato {

    public PatoBranco(){
        super("Pato Branco");
        this.comportamentoSom = new Quack();
        this.comportamentoVoo = new VoarBasico();
    }

}
