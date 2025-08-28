package dispositivos;

public class LuzNatal {
    private int tensao;
    private boolean ligado;
    private int qtde;
    private String cor;


    public int getTensao() {
        return tensao;
    }
    public void setTensao(int tensao) {
        this.tensao = tensao;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        if (ligado == true) {
            System.out.println("Ligado");
        } else { 
            System.out.println("Desligado");
        }
        
        this.ligado = ligado;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }




}
