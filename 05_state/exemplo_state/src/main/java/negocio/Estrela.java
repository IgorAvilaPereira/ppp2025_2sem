package negocio;

public class Estrela implements Estado {
    private Estado estadoAnterior;

    public Estrela(Estado estadoAnterior) {
        try {
            this.estadoAnterior = estadoAnterior;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Estado cogumelo() {
        return this.estadoAnterior;
    }

    @Override
    public Estado pena() {
        return this.estadoAnterior;

    }

    @Override
    public Estado dano() {
        return this.estadoAnterior;

    }

    @Override
    public Estado flor() {
        return this.estadoAnterior;


    }

    @Override
    public Estado estrela() {
        return this.estadoAnterior;


    }

}
