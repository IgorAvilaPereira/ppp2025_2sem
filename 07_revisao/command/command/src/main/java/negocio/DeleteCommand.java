package negocio;

import java.io.File;

public class DeleteCommand extends Command {

    public DeleteCommand(EditorDeTexto editorDeTexto) {
        super(editorDeTexto);
    }

    @Override
    public void execute() {
        File fileToDelete = new File(this.editorDeTexto.getDocumento().getNome()); // Replace with your file path
        
        if (fileToDelete.delete()) {
            System.out.println("File deleted successfully: " + fileToDelete.getName());
        } else {
            System.out.println("Failed to delete the file: " + fileToDelete.getName());
        }
    }



}
