package negocio;

public class TvSamsungCommand implements Command {
    private TvSamsung tvSamsung;

    public TvSamsungCommand(TvSamsung tvSamsung) {
        this.tvSamsung = tvSamsung;
    }
    @Override
    public void execute() {
        System.out.println("Tv ligada");
        this.tvSamsung.setLigada(true);
    }

    @Override
    public void undo() {
        System.out.println("Tv Desligada");
        this.tvSamsung.setLigada(false);
    }

}
