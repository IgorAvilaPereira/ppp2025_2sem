package negocio;

import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject<Acao, Double> {
    private double valor;
    private List<Observer> vetObserver;

    public Acao() {
        this.vetObserver = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.vetObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.vetObserver.remove(observer);
    }

    @Override
    public void removeObserver(int i) {
        this.vetObserver.remove(i);
    }

    @Override
    public void notificar(Acao notificacao) {
        if (vetObserver.size() > 0) {
            for (Observer observer : vetObserver) {
                observer.update(this);
            }
        }
    }

    @Override
    public void changedState(Double novoValor) {
        if (novoValor != valor) {
            this.valor = novoValor;
            this.notificar(this);
        }
    }

    public double valorAtual(){
        return this.valor;
    }



}
