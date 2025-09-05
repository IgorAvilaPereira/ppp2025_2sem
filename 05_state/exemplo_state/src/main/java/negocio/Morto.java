package negocio;

public class Morto implements Estado {

    @Override
    public Estado cogumelo() {
        throw new IllegalArgumentException("ja to morto");
        
    }

    @Override
    public Estado pena() {
        throw new IllegalArgumentException("ja to morto");
    }

    @Override
    public Estado dano() {
        throw new IllegalArgumentException("ja to morto");

    }

    @Override
    public Estado flor() {
        throw new IllegalArgumentException("ja to morto");

    }

    @Override
    public Estado estrela() {
        throw new IllegalArgumentException("ja to morto");

    }

}
