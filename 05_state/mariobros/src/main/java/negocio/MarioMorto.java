package negocio;

public class MarioMorto implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        return this;
    }

    @Override
    public MarioState pegarPena() {
        return this;
    }

    @Override
    public MarioState levarDano() {
        return this;
    }


}
