package negocio;

public class Confirmado extends Status {

    public Confirmado(PedidoIfood pedidoIfood) {
        super(pedidoIfood);
    }

    @Override
    public Status atualiza() {
        return new EmPreparo(pedidoIfood);
    }

}
