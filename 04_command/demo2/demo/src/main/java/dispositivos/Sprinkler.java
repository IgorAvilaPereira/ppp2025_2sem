package dispositivos;

public class Sprinkler {
    private String nome;
    private String marca;
    private int potencia;
    private int ligado;
    
    public Sprinkler(){
        this.ligado = 0;
    }

    
    
    public void setLigado(int ligado) {
        System.out.println("sprinkler sendo "+((ligado == 1) ? "ligado" : "desligado"));
        this.ligado = ligado;
    }



    public void timer(int minutos){        
        try {
            this.ligado = 1;
            System.out.println("sprinkler ligado por "+minutos+" minutos");
            Thread.sleep(minutos*1000*60);
            this.setLigado(0);


        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
