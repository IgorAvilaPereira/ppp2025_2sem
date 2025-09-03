package negocio;

public class NoCommand implements Command {

    @Override
    public String execute() {
        return "<b style='color:red'>Url invalida. Not found 404</b>";
    }

}
