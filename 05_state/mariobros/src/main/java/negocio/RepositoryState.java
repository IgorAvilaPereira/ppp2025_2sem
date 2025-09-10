package negocio;

// proposta 1 de eliminar a criacao desnecessaria de instancias
public class RepositoryState {
    public static final MarioState GRANDE = new MarioGrande();
    public static final MarioState PEQUENO = new MarioPequeno();
    public static final MarioState MORTO = new MarioMorto();
    public static final MarioState FLOR = new MarioFogo();
    public static final MarioState PENA = new MarioCapa();
}
