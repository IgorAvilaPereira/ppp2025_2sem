package negocio;

public class BancoReal {
    private String nome;
    private Conta conta;

    public BancoReal(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public Conta getConta() {
        return conta;
    }



    public void setConta(Conta conta) {
        this.conta = conta;
    }



    public void depositar(double valor) {
        if (conta != null) {
            conta.setSaldo(conta.getSaldo() + valor);
        } else {
            throw new IllegalArgumentException("Conta inexistente");
        }

    }

    public double sacar(double valor){
        if (conta != null && conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            return valor;
        }
        throw new IllegalArgumentException("Saldo insuficiente");
    }


}
