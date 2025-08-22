/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class RelatorioFinancas extends Relatorio {

    @Override
    protected void exibirConteudo() {
        System.out.println("Faturamento: R$ 1.000.000");
        System.out.println("Custos operacionais: R$ 1.000.000");
        System.out.println("Lucro: R$ 0");
    }
    
    @Override
    protected void exibirRodapeOpcional() {
        System.out.println("COloquei algo a mais abaixo do rodape!");
    }

}
