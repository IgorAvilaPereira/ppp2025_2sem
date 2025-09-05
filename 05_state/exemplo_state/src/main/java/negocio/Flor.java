package negocio;

public class Flor implements Estado {

    @Override
    public Estado cogumelo() {
        return this;
    }

    @Override
    public Estado pena() {
        return new Pena();
    }

    @Override
    public Estado dano() {
        // return new Pequeno();
        return Pequeno.INSTANCE;
    }

    @Override
    public Estado flor() {
        return this;
    }

    @Override
    public Estado estrela() {
        return new Estrela(this);
    }

}
