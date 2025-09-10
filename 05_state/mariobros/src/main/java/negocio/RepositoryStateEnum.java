package negocio;

// proposta 2 de eliminar a criacao desnecessaria de instancias
public enum RepositoryStateEnum {    
    
    MORTO(new MarioMorto()),
    GRANDE(new MarioGrande()),
    PEQUENO(new MarioPequeno()),
    FLOR(new MarioFogo()),
    PENA(new MarioCapa()); 

    private MarioState state;

    RepositoryStateEnum(MarioState state) {
        this.state = state;
    }

    MarioState getState(){
        return this.state;
    }

    

    

    

}
