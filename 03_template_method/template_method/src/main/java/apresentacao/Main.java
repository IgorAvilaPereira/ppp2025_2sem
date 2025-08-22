/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Relatorio;
import negocio.RelatorioBloquinhos;
import negocio.RelatorioFinancas;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Relatorio rBloco = new RelatorioBloquinhos();
        rBloco.gerarRelatorio("Carnaval 2025 - Inesquecível!");
        
        System.out.println("==============");
        
        Relatorio rFinancas = new RelatorioFinancas();
        rFinancas.gerarRelatorio("Finanças 2025");
    }
}
