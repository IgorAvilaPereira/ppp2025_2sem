/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.Pato;
import negocio.Som;

/**
 *
 * @author iapereira
 */
public class SemSom implements Som {


    @Override
    public void grasnar(Pato pato) {
        System.out.println("o pato está mudo!");
    }
    
}
