package apresentacao;

import java.time.LocalDate;

import negocio.Dvd;
import negocio.GerenteMaluco;
import negocio.Liquidacao;
import negocio.Livro;
import negocio.Regular;

public class Main {
    public static void main(String[] args) {
        Dvd dvd = new Dvd();
        dvd.setNome("Hanson");
        dvd.setDataLancamento(LocalDate.now());
        dvd.setPreco(1.99);
        dvd.setPromocao(new Regular());
        System.out.printf("%.2f",dvd.calcPreco());
        System.out.println();
        System.out.println("Veio uma promoção");
        dvd.setPromocao(new Liquidacao());
        System.out.printf("%.2f",dvd.calcPreco());
        System.out.println();
        dvd.setPromocao(new GerenteMaluco());
        System.out.printf("%.2f",dvd.calcPreco());
        System.out.println();

        System.out.println("=================");

        Livro livro = new Livro();
        livro.setAutor("Igor");
        livro.setEdicao(1);
        livro.setPreco(2.00);
        System.out.println(livro.calcPreco());

    }
}