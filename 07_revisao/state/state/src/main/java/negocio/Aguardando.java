package negocio;

import java.util.Random;

public class Aguardando extends Status {

    public Aguardando(PedidoIfood pedidoIfood) {
        super(pedidoIfood);
    }

    @Override
    public Status atualiza() {
        if (new Random().nextBoolean()) return new Confirmado(pedidoIfood);
        throw new IllegalArgumentException("Deu xabum! Pedido não será confirmado");
    }

   

  

}
