package dispositivos;

public class Projetor {
    private String especificacoes;
    private String resolucao;
    private int ligado;

    public Projetor() {
        this.ligado = 0;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public int getLigado() {
        return ligado;
    }

    public void setLigado(int ligado) {
        this.ligado = ligado;
    }

}
