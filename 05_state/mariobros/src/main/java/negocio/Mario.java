package negocio;

public class Mario {
    private MarioState estado;

    public Mario(){
        // usando repository
        this.estado = RepositoryState.PEQUENO;
        // usando enum
        // this.estado = RepositoryStateEnum.PEQUENO.getState();

    }    

    public void pegarCogumelo(){
        this.estado = estado.pegarCogumelo();

    }

    public void pegarPena(){
        this.estado = estado.pegarPena();

    }

    public void pegarFlor() {
        this.estado = estado.pegarFlor();

    }

    public void levarDano(){
        this.estado = estado.levarDano();
        // if (this.estado.equals("GRANDE")) {
        //     this.estado = "PEQUENO";
        // }
        // if (this.estado.equals("PEQUENO")) {
        //     this.estado = "MORTE";
        // }
        // if (this.estado.equals("FLOR")) {
        //     this.estado = "GRANDE"; 
        // }
        // return this.estado;
    }

    public MarioState getEstado() {
        return estado;
    } 

    
    
}
