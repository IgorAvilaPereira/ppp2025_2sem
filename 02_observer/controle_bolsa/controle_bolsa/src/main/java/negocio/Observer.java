package negocio;

public interface Observer<T> {
    public void update(T notificacao);
}
