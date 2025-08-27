package apresentacao;

import negocio.Exportador;
import negocio.Json;
import negocio.PDF;
import negocio.SQL;
import negocio.Xml;

public class Main {
    public static void main(String[] args) {
        Exportador json = new Json("./src/main/resources/users.csv", ";");
        json.exportar("users.json");

        Exportador xml = new Xml("./src/main/resources/users.csv", ";");
        xml.exportar("users.xml");

        Exportador pdf = new PDF("./src/main/resources/users.csv", ";");
        pdf.exportar("users.pdf");

        Exportador sql = new SQL("./src/main/resources/users.csv", ";");
        sql.exportar("users.sql");
    }
}