package persistence;

import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

public class PessoaDAO {

    public List<Pessoa> listar(){
        List<Pessoa> vet = new ArrayList<Pessoa>();
        vet.add(new Pessoa(1, "Igor"));
        vet.add(new Pessoa(2, "Marcio"));
        return vet;
        
    }

    public boolean adicionar(Pessoa pessoa) {
        System.out.println("adicionando no bd a pessoa");
        return true;
    }

}
