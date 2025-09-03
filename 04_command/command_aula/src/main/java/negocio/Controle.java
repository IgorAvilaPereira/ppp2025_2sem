package negocio;

public class Controle {
    private Command slots[];

    public Controle(){
        this.slots = new Command[7];
        for(int i = 0; i < this.slots.length; i++){
            this.slots[i] = new NoCommand(); 
        }
    }

    public void alocaDispositivo(int nroSlot, Command dispositivoCommand) {
        this.slots[nroSlot] = dispositivoCommand;
    }

    public void apertarBotaoOn(int nroSlot) {
        this.slots[nroSlot].execute();
    }

    public void apertarBotaoOff(int nroSlot){
        this.slots[nroSlot].undo();
    }

    public void apertarUndoGeral(){
        for (Command slotCommand : slots) {
            slotCommand.undo();
        }
    }

}
