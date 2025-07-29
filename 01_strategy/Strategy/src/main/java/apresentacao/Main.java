package apresentacao;

import negocio.SemSom;
import negocio.NaoVoa;
import negocio.P1;
import negocio.P2;
import negocio.PatoBorracha;
import negocio.QuackQuack;
import negocio.V1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        P1 patoDonald = new P1();
        patoDonald.setNome("PatoDonald");
        patoDonald.setPeso(2.0);
        patoDonald.setVoo(new V1());
        patoDonald.setSom(new QuackQuack());
        patoDonald.executarVoo();
        patoDonald.emitirSom();
        System.out.println(">> tomei tiro nas asas na garganta! deu ruim. não voo mais");
        patoDonald.setVoo(new NaoVoa());
        patoDonald.setSom(new SemSom());
        patoDonald.executarVoo();
        patoDonald.emitirSom();

        System.out.println("====");
        P2 patolino = new P2();
        patolino.setVoo(new V1());
        patolino.executarVoo();

        
        System.out.println("=====");
        PatoBorracha betito = new PatoBorracha();
        betito.executarVoo();
        

    }
}
