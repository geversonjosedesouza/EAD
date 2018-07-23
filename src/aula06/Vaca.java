/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author geverson
 */
public class Vaca implements Animal {

    @Override
    public void andar() {
        System.out.println("Vaca andando...");
    }

    @Override
    public void parar() {
        System.out.println("Vaca parando...");        
    }

}
