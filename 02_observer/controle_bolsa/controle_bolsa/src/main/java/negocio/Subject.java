package negocio;

public interface Subject<T,M> {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void removeObserver(int i);
    public void notificar(T notificacao);

    // 
    public void changedState(M novoValor);
    
} 