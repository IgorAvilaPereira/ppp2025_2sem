package negocio;

public class Automovel implements Cloneable {
    private int ano;
    private String modelo;
    private String marca;
    private int km;
    private double preco;
    private String placa;
    private String chassi;
    private Motor motor;

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
   

  
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public Object clone(){
    //    Automovel clone = new Automovel();
    //    clone.setAno(ano);
    //    clone.setChassi(chassi);
    //    clone.setKm(km);
    //    clone.setMarca(marca);
    //    clone.setModelo(modelo);
    //    clone.setPlaca(placa);
    //    clone.setPreco(preco);
    //    return clone;
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public String toString() {
        return "Automovel [ano=" + ano + ", modelo=" + modelo + ", marca=" + marca + ", km=" + km + ", preco=" + preco
                + ", placa=" + placa + ", chassi=" + chassi + ", motor=" + motor + "]";
    }
    

    

    

}
