/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author iapereira
 */
public abstract class Relatorio {
    private String titulo;
    private LocalDateTime dataHoraCriacao;
    
    // nenhuma fila mexe com final   
    public final void gerarRelatorio(String titulo){
        this.titulo = titulo;
        // fixo
        exibirCabecalho();
        // mutável
        exibirConteudo();
        // fixo
        exibirRodape();
        
        exibirRodapeOpcional();
    }

    // fixo - ninguem mexe!
    private void exibirCabecalho() {
        System.out.println("David Carnaval Eventos Company!!\n"+this.titulo);
    }

    // obrigatorio as filhas mexerem
    protected abstract void exibirConteudo();

    // filhas mexem se quiser!
    protected void exibirRodape() {
        this.dataHoraCriacao = LocalDateTime.now();
        System.out.println("telefone para contato: ! venha fazer seu carnaval fora de epoca!!! david :) ==> "+this.dataHoraCriacao.toString());
    }

    protected void exibirRodapeOpcional() {
    }
    
}
