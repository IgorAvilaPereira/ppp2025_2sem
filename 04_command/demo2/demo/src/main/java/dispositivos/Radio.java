package dispositivos;

public class Radio {
    private String marca;
    private boolean ligado;
    private double frequencia;

    public Radio(){
        this.marca = "Sony";
        this.ligado = false;
    }

    

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



    public String getMarca() {
        return marca;
    }



    public double getFrequencia() {
        return frequencia;
    }



    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    
    
    
}
