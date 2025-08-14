package negocio;

import negocio.som.ComportamentoSom;
import negocio.voo.ComportamentoVoo;

public class Peru {
    private int id;
    private String nome;
    private double preco;
    private double altura;
    private ComportamentoSom som;
    private ComportamentoVoo voo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public ComportamentoSom getSom() {
        return som;
    }
    public void setSom(ComportamentoSom som) {
        this.som = som;
    }
    public ComportamentoVoo getVoo() {
        return voo;
    }
    public void setVoo(ComportamentoVoo voo) {
        this.voo = voo;
    }
    


}
