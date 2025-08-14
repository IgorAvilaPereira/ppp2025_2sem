package negocio;
public class Notificacao {
    private String mensagem;
    private EstrategiaNotificacao estrategia;

    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public EstrategiaNotificacao getEstrategia() {
        return estrategia;
    }
    public void setEstrategia(EstrategiaNotificacao estrategia) {
        this.estrategia = estrategia;
    }

    public void emitirNotificacacao() {
        this.estrategia.notificar(this);
    }
    @Override
    public String toString() {
        return "Notificacao [mensagem=" + mensagem + ", estrategia=" + estrategia + "]";
    }

    


}
