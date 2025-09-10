package negocio;

// implementado como interface
// mas poderia ser uma classe abstrata - com metodos implementados e também metodos abstratos
public interface MarioState {
    public MarioState pegarCogumelo();
    public MarioState pegarFlor();
    public MarioState pegarPena();
    public MarioState levarDano();

}
