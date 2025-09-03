package negocio;

public class HomeTheatherCommand implements Command {

    private HomeTheather homeTheather;

    public HomeTheatherCommand(HomeTheather homeTheather) {
        this.homeTheather = homeTheather;
    }

    @Override
    public void execute() {
        System.out.println("ok");
        this.homeTheather.setLigado(1);
    }

    @Override
    public void undo() {
        System.out.println("off");
        this.homeTheather.setLigado(0);
    }

}
