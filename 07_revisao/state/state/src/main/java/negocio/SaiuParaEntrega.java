package negocio;

public class SaiuParaEntrega extends Status {

    public SaiuParaEntrega(PedidoIfood pedidoIfood) {
        super(pedidoIfood);
    }

    @Override
    public Status atualiza() {
        return new Entregue(pedidoIfood);
    }

}
