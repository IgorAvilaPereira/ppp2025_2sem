package negocio;

public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        return RepositoryState.GRANDE;
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
        return RepositoryState.MORTO;
    }

   
}
