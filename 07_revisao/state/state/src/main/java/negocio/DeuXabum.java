package negocio;

public class DeuXabum extends Status {

    public DeuXabum(PedidoIfood pedidoIfood) {
        super(pedidoIfood);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Status atualiza() {
        throw new IllegalArgumentException("Deu zebra das brabas!");
    }

}
