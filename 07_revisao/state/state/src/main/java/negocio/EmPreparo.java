package negocio;

public class EmPreparo extends Status {

    public EmPreparo(PedidoIfood pedidoIfood) {
        super(pedidoIfood);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Status atualiza() {
        return new SaiuParaEntrega(pedidoIfood);
    }

}
