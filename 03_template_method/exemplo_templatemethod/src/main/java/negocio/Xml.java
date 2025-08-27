package negocio;

public class Xml extends Exportador {

    public Xml(String arquivo, String delimitador) {
        super(arquivo, delimitador);
    }

    @Override
    protected String processamento() {
        String xml = "<users>";
        for (Usuario usuario : vetUsuario) {
            xml += "<user>";
            xml += "<nome>";
            xml += usuario.getNome();
            xml += "</nome>";
            xml += "<email>";
            xml += usuario.getEmail();
            xml += "</email>";
            xml += "</user>";
        }
        xml += "</users>";
        return xml;
    }

}
