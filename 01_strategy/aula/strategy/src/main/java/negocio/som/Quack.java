package negocio.som;

public class Quack implements ComportamentoSom {

    @Override
    public void emitirSom() {
        System.out.println("Quack Quack!");
    }

}
