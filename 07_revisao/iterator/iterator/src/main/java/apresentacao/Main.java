package apresentacao;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void percorreCanal(Iterator<Canal> iterator){
        while (iterator.hasNext()) {
            Canal canal = iterator.next();
            System.out.println(canal.nome);            
        }
    }

    public static void main(String[] args) {
        ArrayList<Canal> arrayListDeCanais = new ArrayList<Canal>();
        Canal mtv = new Canal();
        mtv.nome = "mtv";
        mtv.nro = 24;
        arrayListDeCanais.add(mtv);
        
        percorreCanal(arrayListDeCanais.iterator());
        percorreCanal(new MatrizCanalIterator());
      
    }
}