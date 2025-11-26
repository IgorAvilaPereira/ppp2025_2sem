package negocio;

public class Conta {
    private String cpf;
    private String nro;
    private String agencia;
    private double saldo;
    private String senha;

    public Conta(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNro() {
        return nro;
    }
    public void setNro(String nro) {
        this.nro = nro;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    


}
