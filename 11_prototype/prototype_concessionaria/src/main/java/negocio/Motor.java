package negocio;

public class Motor {
    private int nroCilindradas;
    private String observacoes;

    public Motor() {

    }

    public Motor(int nroCilindradas, String observacoes) {
        this.nroCilindradas = nroCilindradas;
        this.observacoes = observacoes;
    }

    public int getNroCilindradas() {
        return nroCilindradas;
    }
    public void setNroCilindradas(int nroCilindradas) {
        this.nroCilindradas = nroCilindradas;
    }
    public String getObservacoes() {
        return observacoes;
    }
    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Motor [nroCilindradas=" + nroCilindradas + ", observacoes=" + observacoes + "]";
    }

    
    

}
