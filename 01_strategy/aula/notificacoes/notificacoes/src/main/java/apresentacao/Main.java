package apresentacao;

import negocio.Notificacao;
import negocio.NotificacaoJson;
import negocio.PopUp;
import negocio.PopUpErro;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new Notificacao();
        notificacao.setEstrategia(new PopUpErro());
        notificacao.setMensagem("Deu xabum!!");
        notificacao.emitirNotificacacao();

        notificacao.setMensagem("Xabum resolvido!");
        notificacao.setEstrategia(new PopUp());
        notificacao.emitirNotificacacao();

        notificacao.setEstrategia(new NotificacaoJson());
        notificacao.emitirNotificacacao();

    }
}