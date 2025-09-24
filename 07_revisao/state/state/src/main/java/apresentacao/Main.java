package apresentacao;

import negocio.PedidoIfood;

public class Main {
    public static void main(String[] args) {
        PedidoIfood pedidoIfood = new PedidoIfood();
        pedidoIfood.setCliente("Igor");
        pedidoIfood.setEstabelecimento("Nella Pietra");
        pedidoIfood.setPedido("Pizza");
        pedidoIfood.setValor(1.99);
        System.out.println(pedidoIfood.getStatus().getClass().getSimpleName());
        pedidoIfood.atualizaStatus();
        System.out.println(pedidoIfood.getStatus().getClass().getSimpleName());
        pedidoIfood.deuXabum();
        System.out.println(pedidoIfood.getStatus().getClass().getSimpleName());
        // pedidoIfood.atualizaStatus();


    }   
}