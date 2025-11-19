package apresentacao;

import negocio.Query;
import negocio.SQL;

public class Main {
    public static void main(String[] args) {
        // SQL consulta = new SQL("select", "pessoa", "where true", "nome", 10, 0);
        // System.out.println(consulta.toSQL());
        SQL consultaBuilder = new SQL.Builder().operation("SELECT").table("pessoa").orderBy("nome").limit(10).build();
        System.out.println(consultaBuilder.toSQL());

        Query consultaLoombok = Query.builder().table("pessoa").orderBy("nome").limit(10).build();
        System.out.println(consultaLoombok.getQuery());
    }
}