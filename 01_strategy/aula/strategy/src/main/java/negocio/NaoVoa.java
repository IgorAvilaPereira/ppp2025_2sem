package negocio;

public class NaoVoa implements ComportamentoVoo {

    @Override
    public void voar() {
        System.out.println("Deu xabum! Não voo mais! Deu zebra!");
    }

}
