package negocio;

public abstract class Command {
    protected EditorDeTexto editorDeTexto;

    public Command(EditorDeTexto editorDeTexto){
        this.editorDeTexto = editorDeTexto;
    }
   
    public abstract void execute();

    public EditorDeTexto getEditorDeTexto() {
        return editorDeTexto;
    }

    public void setEditorDeTexto(EditorDeTexto editorDeTexto) {
        this.editorDeTexto = editorDeTexto;
    }
}
