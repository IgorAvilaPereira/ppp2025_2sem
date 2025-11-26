package negocio;

public class BancoProxy implements IBanco {

    private BancoReal bancoReal;

    public BancoProxy(BancoReal bancoReal, String cpf, String senha) {
        if (bancoReal.getConta().getCpf().equals(cpf) && bancoReal.getConta().getSenha().equals(senha)) {
            this.bancoReal = bancoReal;
        } else {
            throw new IllegalArgumentException("Deu xabum!");
        }
    }

    @Override
    public void depositar(double valor) {
        this.bancoReal.depositar(valor);
    }

    @Override
    public double sacar(double valor) {
       return this.bancoReal.sacar(valor);
    }



}
