/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Pato {
    protected String nome;
    protected double peso;
    protected Voo voo;
    protected Som som;
    
    public void executarVoo(){
        this.voo.voar();        
    }
    
    public void emitirSom(){
        this.som.grasnar(this);
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

  

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public void setSom(Som som) {
        this.som = som;
    }
    
    
    
    
}
