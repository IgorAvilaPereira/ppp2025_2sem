package negocio;

public class Controle {
    private Command dispositivos[];

    public Controle(){
        this.dispositivos = new Command[10];
    }   
    
    public void adicionarDispositivo(int nro, Command novoDispositivo){
        this.dispositivos[nro] = novoDispositivo;
    }

    public void cliqueiNoOn(int nro){
        try {
            this.dispositivos[nro].execute();
        } catch (Exception e) {
            System.out.println("Não há dispositivo neste slot!");
        }
    }

    public void cliqueiNoOff(int nro){
        try {
            this.dispositivos[nro].execute();
        } catch (Exception e) {
            System.out.println("Não há dispositivo neste slot!");
        }
    }

   



}
