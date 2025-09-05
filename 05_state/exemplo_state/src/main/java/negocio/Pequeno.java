package negocio;

public class Pequeno implements Estado {
    // a unica 
    public static final Pequeno INSTANCE = new Pequeno();

    // construtor privado evita que em qualquer outro lugar, novas instancias de pequeno venham a ser criadas
    private Pequeno(){

    }

    @Override
    public Estado cogumelo() {
        return new Grande();
    }

    @Override
    public Estado pena() { 
        return new Pena();
    }

    @Override
    public Estado dano() {
        return new Morto();
    }

    @Override
    public Estado flor() {
        return new Flor();
    }

    @Override
    public Estado estrela() {
        return new Estrela(this);
    }

}
