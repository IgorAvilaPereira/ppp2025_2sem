package apresentacao;

import java.util.Iterator;

public class MatrizCanalIterator implements Iterator<Canal>{

    private Canal[] matrizDeCanais;
    private int tamanho;
    private int pos;

    public MatrizCanalIterator() {
        matrizDeCanais = new Canal[5];
        Canal tvCom = new Canal();
        tvCom.nome = "tvcom";
        tvCom.nro = 36;
        matrizDeCanais[0] = tvCom;
        this.tamanho = 1;
        this.pos = 0;
      
    }

    @Override
    public boolean hasNext() {
        return pos < tamanho;
    }

    @Override
    public Canal next() {
        Canal c = this.matrizDeCanais[pos];
        pos++;
        return c;
    }

}
