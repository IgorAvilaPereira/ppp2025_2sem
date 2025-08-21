package negocio;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf implements Observer<Acao> {

    @Override
    public void update(Acao notificacao) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("data.pdf", true));
            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            Chunk chunk = new Chunk(String.valueOf(notificacao.valorAtual()), font);
            document.add(chunk);
            document.close();           
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

}
