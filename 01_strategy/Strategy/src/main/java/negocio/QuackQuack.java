/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class QuackQuack implements Som {

    @Override
    public void grasnar(Pato pato) {
        System.out.println("O pato "+pato.getNome()+" está fazendo quack quack!");
    }
    
}
