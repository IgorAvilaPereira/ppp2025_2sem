package negocio;

public class MarioFogo implements MarioState {

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
        return RepositoryState.PENA;
    }

    @Override
    public MarioState levarDano() {
        return RepositoryState.GRANDE;
    }

}
