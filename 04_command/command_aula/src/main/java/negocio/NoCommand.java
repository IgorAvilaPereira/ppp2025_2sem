package negocio;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Slot Vazio = Nenhum Equipamento alocado");
        // throw new UnsupportedOperationException("Slot Vazio");
    }

    @Override
    public void undo() {
        System.out.println("Slot Vazio = Nenhum Equipamento alocado");
        // throw new UnsupportedOperationException("Slot Vazio");
    }

}
