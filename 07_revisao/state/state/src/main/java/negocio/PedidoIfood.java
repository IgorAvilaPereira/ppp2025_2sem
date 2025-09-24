package negocio;

public class PedidoIfood {
    private String estabelecimento;
    private String cliente;
    private String pedido;
    private double valor;

    private Status status;

    public PedidoIfood(){
        this.status = new Aguardando(this);
    }


    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Status getStatus() {
        return status;
    }

    public void atualizaStatus() {
        this.status = status.atualiza();
    }

    public void deuXabum(){
        this.status = status.deuXabum();
    }

    

}
