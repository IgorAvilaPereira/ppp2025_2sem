package negocio;

import java.util.ArrayList;
import java.util.List;

public class EditorDeTexto {
    private Documento documento;
    private List<Command> operacao;

    public EditorDeTexto(){
        this.operacao = new ArrayList<>();
    }

    public Documento getDocumento() {
        return documento;
    }
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public List<Command> getOperacao() {
        return operacao;
    }

    public void addOperacao(Command operacao) {
        this.operacao.add(operacao);
    }

    public void removeOperacao(int pos) {
        this.operacao.remove(pos);
    }

    public void realizaOperacao(int pos){
        this.operacao.get(pos).execute();
    }

    



}
