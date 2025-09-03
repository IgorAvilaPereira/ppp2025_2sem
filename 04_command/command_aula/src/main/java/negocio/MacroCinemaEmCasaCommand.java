package negocio;

public class MacroCinemaEmCasaCommand implements Command {
    private TvSamsung tvSamsung;
    private HomeTheather homeTheather;

    public MacroCinemaEmCasaCommand(TvSamsung tvSamsung, HomeTheather homeTheather){
        this.tvSamsung = tvSamsung;
        this.homeTheather = homeTheather;
    }

    @Override
    public void execute() {
        System.out.println("Ligando tudo (cinema)");
        this.tvSamsung.setLigada(true);
        this.homeTheather.setLigado(1);
    }

    @Override
    public void undo() {
        System.out.println("Ligando tudo (cinema)");
        this.tvSamsung.setLigada(false);
        this.homeTheather.setLigado(0);
    }

}
