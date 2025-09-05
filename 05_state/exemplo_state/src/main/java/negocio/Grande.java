package negocio;

public class Grande implements Estado {

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
