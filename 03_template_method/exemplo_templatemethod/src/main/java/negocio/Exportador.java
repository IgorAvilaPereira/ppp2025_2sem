package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Exportador {
    private String arquivo;
    private String delimitador;
    protected List<Usuario> vetUsuario;

    public Exportador(String arquivo, String delimitador) {
        this.arquivo = arquivo;
        this.delimitador = delimitador;
        this.vetUsuario = new ArrayList<Usuario>();
    }

    // template method
    public final void exportar(String arquivoSaida) {
        leituraCSV(); // 1 etapa -> fixa (por isso definida como private)
        // 2 etapa (processamento) -> variavel -> definida como metodo abstrato
        // 3 etapa (exportacao) -> fixa mas com capacidade de customizacao (por isso definida como protected)
        exportacao(processamento(), arquivoSaida);
        // customizacaoAdicional();
    }

    protected void exportacao(String conteudo, String arquivoSaida) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/resources/"+arquivoSaida))) {
            writer.write(conteudo);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    protected abstract String processamento();

    private void leituraCSV(){
        try (BufferedReader br = new BufferedReader(new FileReader(this.arquivo))) {
        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {
            if (i != 0) {
                String[] values = line.split(delimitador);
                Usuario usuario = new Usuario();
                usuario.setNome(values[0]);
                usuario.setEmail(values[1]);
                vetUsuario.add(usuario);
            } else {
                i++;
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  

    }
}
