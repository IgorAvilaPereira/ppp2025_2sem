package negocio;

import javax.swing.JOptionPane;

public class PopUpErro implements EstrategiaNotificacao {

    @Override
    public void notificar(Notificacao notificacao) {
        JOptionPane.showMessageDialog(null, notificacao.getMensagem(), "Notificação", JOptionPane.ERROR_MESSAGE);
    }
}
