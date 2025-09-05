package negocio;

public class Mario {
    private int qtdeVidas;
    private int pontuacao;
    private int fase;
    private int mundo;

    private Estado estadoAtual;

    public Mario() {
        this.estadoAtual = Pequeno.INSTANCE;


    }

    public Mario(int qtdeVidas) {
        this();
        this.qtdeVidas = qtdeVidas;
        
    }

    public Mario(int qtdeVidas, int pontuacao, int fase, int mundo) {
        this();
        this.qtdeVidas = qtdeVidas;
        this.pontuacao = pontuacao;
        this.fase = fase;
        this.mundo = mundo;

    }

    public void pegueiCogumelo(){
        this.estadoAtual = this.estadoAtual.cogumelo();
    }

    public void pegueiPena(){
        this.estadoAtual = this.estadoAtual.pena();

    }

    public void pegueiFlor(){
        this.estadoAtual = this.estadoAtual.flor();

    }

    public void pegueiEstrela(){
        this.estadoAtual = this.estadoAtual.estrela();
        
    }

    public void sofriDano() {
        this.estadoAtual = this.estadoAtual.dano();
        if (this.estadoAtual instanceof Morto && this.qtdeVidas == 0 ){
            System.out.println("game over: morreu de vez");
        } else {
            System.out.println("morreu mas passa bem! é possível jogar novamente!");
            this.qtdeVidas--;
            this.estadoAtual = Pequeno.INSTANCE;
            
        }

    }

    public int getQtdeVidas() {
        return qtdeVidas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getFase() {
        return fase;
    }

    public int getMundo() {
        return mundo;
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    


}
