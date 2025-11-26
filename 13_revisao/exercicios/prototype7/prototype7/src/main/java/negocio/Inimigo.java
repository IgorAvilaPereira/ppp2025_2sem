package negocio;

import java.util.ArrayList;
import java.util.List;


public class Inimigo implements Cloneable {
    private String nome;
    private List<String> habilidades;

    // Singleton
    private static Inimigo INSTANCE = new Inimigo(); 

    // Singleton
    private Inimigo(){
        this.nome = "Neymar";
        this.habilidades = new ArrayList<String>();
        this.habilidades.add("Força");
        this.habilidades.add("Velocidade");
    }

    // Singleton
    public static synchronized Inimigo getInstance(){
        return INSTANCE;
    }


    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }




    public List<String> getHabilidades() {
        return habilidades;
    }




    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }


    // prototype
    @Override
    public Inimigo clone(){
        try {
            return (Inimigo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        return "Inimigo [nome=" + nome + ", habilidades=" + habilidades + "]";
    }

    


}
