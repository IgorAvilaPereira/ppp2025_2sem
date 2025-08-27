package negocio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF extends Exportador {

    public PDF(String arquivo, String delimitador) {
        super(arquivo, delimitador);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected String processamento() {
        return "";
    }

    protected void exportacao(String conteudo, String arquivoSaida) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("./src/main/resources/"+arquivoSaida));
            document.open();
            for (Usuario usuario : vetUsuario) {
                document.add(new Paragraph(usuario.toString()));
            }
            document.close();
            System.out.println("PDF created successfully!");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }




}
