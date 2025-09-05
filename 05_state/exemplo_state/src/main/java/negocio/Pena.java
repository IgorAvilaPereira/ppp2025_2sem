package negocio;

public class Pena implements Estado {

    @Override
    public Estado cogumelo() {
        return this;
    }

    @Override
    public Estado pena() {
        return this;
    }

    @Override
    public Estado dano() {
        // return new Pequeno();
        return Pequeno.INSTANCE;

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
