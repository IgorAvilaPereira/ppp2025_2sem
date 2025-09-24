package apresentacao;

import java.time.LocalDate;

import negocio.FernandoLiborio;
import negocio.Lukas;
import negocio.PreSave;

public class Main {
    public static void main(String[] args) {
        PreSave korn = new PreSave();
        korn.setNomeArtista("Korn");
        korn.setDataLancamento(LocalDate.now());
        korn.setSinopse("Novo lançamento do Korn");
        korn.registerObserver(new Lukas());
        FernandoLiborio fernandoLiborio = new FernandoLiborio();
        korn.registerObserver(fernandoLiborio);
        korn.setDisponivel(true);

        

    }
}