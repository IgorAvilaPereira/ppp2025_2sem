package apresentacao;

import negocio.DeleteCommand;
import negocio.Documento;
import negocio.EditorDeTexto;
import negocio.SaveCommand;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.setConteudo("oi olá!");
        documento.setNome("arquivo.txt");
        EditorDeTexto editorDeTexto = new EditorDeTexto();
        editorDeTexto.setDocumento(documento);
        editorDeTexto.addOperacao(new SaveCommand(editorDeTexto));
        editorDeTexto.realizaOperacao(0);
        editorDeTexto.removeOperacao(0);

        // editorDeTexto.addOperacao(new DeleteCommand(editorDeTexto));
        // editorDeTexto.realizaOperacao(0);

    }
}