package apresentacao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import negocio.IteratorMenuItem;
import negocio.PanquecariaMenuDeTrasPraFrenteIterator;
import negocio.PanquecariaMenuIterator;
import negocio.RestauranteMenuIterator;
import negocio.RestauranteMenuMalucoIterator;
import persistencia.Teste;

public class Main {

    private static void percorreIterator(IteratorMenuItem iterator) {
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) throws SQLException {
        // RestauranteMenuIterator iterator1 = new RestauranteMenuIterator();
        RestauranteMenuMalucoIterator iterator3 = new RestauranteMenuMalucoIterator();
        // PanquecariaMenuIterator iterator2 = new PanquecariaMenuIterator();
        PanquecariaMenuDeTrasPraFrenteIterator iterator4 = new PanquecariaMenuDeTrasPraFrenteIterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }

        percorreIterator(iterator3);
        // percorreIterator(iterator2);

        
       
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("exemplo1", "igor");
        mapa.put("exemplo2", List.of("igor", "betito", "marcio"));

        Iterator i = mapa.entrySet().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        new Teste().teste();
    }

}
