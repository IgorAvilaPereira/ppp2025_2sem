package negocio;

public abstract class Status {
    protected PedidoIfood pedidoIfood;

    public Status(PedidoIfood pedidoIfood){
        this.pedidoIfood = pedidoIfood;
    }

    public abstract Status atualiza();

    public Status deuXabum(){
        return new DeuXabum(pedidoIfood);
    }

}
