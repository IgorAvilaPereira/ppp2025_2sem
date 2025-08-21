package negocio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Csv implements Observer<Acao> {

    @Override
    public void update(Acao notificacao) {
        String filePath = "data.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            // Write header row
            // writer.println("Valor");
            // Write data rows
            writer.println(notificacao.valorAtual());
            System.out.println("CSV file created successfully at: " + filePath);
        
        } catch (IOException e) {
            System.err.println("Error creating or writing to CSV file: " + e.getMessage());
        }
        System.out.println("O observador CSV foi notificado:" + notificacao.valorAtual());
    }

}
