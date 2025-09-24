package negocio;

public class Lukas implements Observer {

    @Override
    public void update(Subject subject) {
        PreSave preSave = (PreSave) subject;
        System.out.println("Legal, vou curtir meu aniversário escutando..."+preSave.getNomeArtista());
    }

}
