package negocio;

import negocio.som.ComportamentoSom;
import negocio.voo.ComportamentoVoo;

public abstract class Pato {
    protected String id;
    protected String nome;
    protected double peso;
    protected double altura;

    protected ComportamentoVoo comportamentoVoo;
    protected ComportamentoSom comportamentoSom;


    public Pato(String nome){
        this.nome = nome;
    }

    public ComportamentoVoo getComportamentoVoo() {
        return comportamentoVoo;
    }

    public void setComportamentoVoo(ComportamentoVoo comportamentoVoo) {
        this.comportamentoVoo = comportamentoVoo;
    }

    public ComportamentoSom getComportamentoSom() {
        return comportamentoSom;
    }

    public void setComportamentoSom(ComportamentoSom comportamentoSom) {
        this.comportamentoSom = comportamentoSom;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    

    

}
