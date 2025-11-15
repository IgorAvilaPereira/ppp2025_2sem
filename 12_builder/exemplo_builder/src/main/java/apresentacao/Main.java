package apresentacao;

import negocio.GeradorDePDF;
import negocio.GeradorDePDFLombok;

public class Main {
    public static void main(String[] args) {
        // sem builder
        // GeradorDePDF relatorio = new GeradorDePDF(null, null, 0, 0, 0, 0, 0, 0, false, false, false, 0, null, null);
        
        // builder nativo
        GeradorDePDF r = new GeradorDePDF.Builder("A4").marginTop(32).content("oi começa pequeno #ficaadica").build();
        r.createPDF();
        System.out.println(r);

        // builder lombok
        // GeradorDePDFLombok rLombok = GeradorDePDFLombok.builder().pageOrientation("a4").build();
        // System.out.println(rLombok);
    }
}