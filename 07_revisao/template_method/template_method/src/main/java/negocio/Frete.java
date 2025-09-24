package negocio;

public abstract class Frete {
    private double peso;
    private double valor;

    public final double calculaFrete(){
        return this.valorDevidoAModalidade()*getPeso() + getValor();
    }

    public abstract double valorDevidoAModalidade();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

}
