package negocio;

import java.math.BigDecimal;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected Promocao promocao;

    public Produto(){
        this.promocao = new Regular();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Promocao getPromocao() {
        return promocao;
    }
    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public double calcPreco(){
        return this.preco*this.promocao.descontar();
    }
    

}
