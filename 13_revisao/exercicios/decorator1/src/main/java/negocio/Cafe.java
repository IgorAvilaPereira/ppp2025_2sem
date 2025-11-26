package negocio;

public class Cafe {
    protected String descricao;
    protected double preco;

    public Cafe() {
        this.descricao = "Café";
        this.preco = 1.99;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double cost) {
        this.preco = cost;
    }

}
