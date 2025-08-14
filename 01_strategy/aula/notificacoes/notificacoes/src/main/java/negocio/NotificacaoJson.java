package negocio;

import com.google.gson.Gson;

public class NotificacaoJson implements EstrategiaNotificacao {

    @Override
    public void notificar(Notificacao notificacao) {
        Gson gson = new Gson();
	    String json = gson.toJson(notificacao);
        System.out.println(json);
    }

    @Override
    public String toString() {
        return "NotificacaoJson";
    }

    

}
