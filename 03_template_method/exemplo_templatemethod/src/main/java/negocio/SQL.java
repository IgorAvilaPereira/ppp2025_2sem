package negocio;

public class SQL extends Exportador {

    public SQL(String arquivo, String delimitador) {
        super(arquivo, delimitador);
    }

    @Override
    protected String processamento() {

        String sql = "DROP DATABASE IF EXISTS duck_simulator;\n";
        sql+="CREATE DATABASE duck_simulator;\n";
        sql += "\\c duck_simulator; \n";
        sql += "CREATE TABLE users (id serial primary key, name text, email text);\n";
        for (Usuario usuario : vetUsuario) {
            sql += "INSERT INTO users (name, email) VALUES('" + usuario.getNome() + "', '" + usuario.getEmail()
                    + "');\n";
        }
        return sql;
    }

}
