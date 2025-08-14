package negocio;

import javax.swing.JOptionPane;

public class PopUp implements EstrategiaNotificacao {

    @Override
    public void notificar(Notificacao notificacao) {
        JOptionPane.showMessageDialog(null, notificacao.getMensagem(), "Notificação", JOptionPane.INFORMATION_MESSAGE);
    }


}
