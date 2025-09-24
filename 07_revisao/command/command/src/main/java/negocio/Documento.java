package negocio;

public class Documento {
    private String nome;
    private String conteudo;
    private double tamanhoBytes;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public double getTamanhoBytes() {
        return tamanhoBytes;
    }
    public void setTamanhoBytes(double tamanhoBytes) {
        this.tamanhoBytes = tamanhoBytes;
    }
    


}
