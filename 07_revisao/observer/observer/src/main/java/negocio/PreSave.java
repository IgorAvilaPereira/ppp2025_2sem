package negocio;

import java.time.LocalDate;

public class PreSave extends Subject {
    private String nomeArtista;
    private LocalDate dataLancamento;
    private String sinopse;
    private boolean disponivel;

    public PreSave(){
        this.disponivel = false;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // changedState => metodo que dispara as notificações para os observadores
    public void setDisponivel(boolean disponivel) {
        if (disponivel == true) {
            notifyObservers();
        }
        this.disponivel = disponivel;
    }
}
