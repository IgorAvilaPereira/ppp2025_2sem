package negocio;

import java.io.FileWriter;
import java.io.IOException;

public class SaveCommand extends Command {

    public SaveCommand(EditorDeTexto editorDeTexto) {
        super(editorDeTexto);
    }

    @Override
    public void execute() {
        try {
            FileWriter writer = new FileWriter(this.editorDeTexto.getDocumento().getNome());
            writer.write(this.editorDeTexto.getDocumento().getConteudo());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
