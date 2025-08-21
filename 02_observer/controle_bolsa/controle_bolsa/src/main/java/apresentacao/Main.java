package apresentacao;

import negocio.Acao;
import negocio.Csv;
import negocio.GraficoPizza;
import negocio.Observer;
import negocio.Pdf;
import negocio.Subject;

public class Main {
    public static void main(String[] args) {
        Subject acao = new Acao();
        Observer x = new Csv();
        Observer y = new GraficoPizza();
        Observer z = new Pdf();
        acao.addObserver(y);
        acao.addObserver(x);
        acao.addObserver(z);

        acao.changedState(3.0);
        acao.removeObserver(y);
        acao.changedState(2.99);
    
        
    }
}