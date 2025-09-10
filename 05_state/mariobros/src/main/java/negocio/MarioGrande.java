package negocio;

public class MarioGrande implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        return RepositoryState.FLOR;
    }

    @Override
    public MarioState pegarPena() {
        return RepositoryState.PENA;
    }

    @Override
    public MarioState levarDano() {
        return RepositoryState.PEQUENO;

    }

}
