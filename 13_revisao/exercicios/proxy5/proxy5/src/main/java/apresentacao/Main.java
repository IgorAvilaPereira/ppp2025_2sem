package apresentacao;

import negocio.BancoProxy;
import negocio.BancoReal;
import negocio.Conta;

public class Main {
    public static void main(String[] args) {
        BancoReal bancoReal = new BancoReal("Banco Real", new Conta("17658586072", "123"));
        BancoProxy bancoProxy = new BancoProxy(bancoReal, "17658586072", "123");
        bancoProxy.depositar(10);
        bancoProxy.sacar(11);
      
    }
}