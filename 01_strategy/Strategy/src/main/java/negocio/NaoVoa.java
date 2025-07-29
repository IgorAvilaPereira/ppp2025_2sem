/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class NaoVoa implements Voo {

    @Override
    public void voar() {
        System.out.println("Deu ruim! Não voo mais! Deu xabum!");
    }
    
}
