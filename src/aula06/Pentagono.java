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
public class Pentagono implements Desenhavel {

    int l1, l2, l3, l4, l5;

    Pentagono(int l1, int l2, int l3, int l4, int l5) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        this.l5 = l5;
    }

    @Override
    public void desenhar() {
        System.out.println("Sou um pentágono de lados: L1 = " + l1 + ", L2 = " + l2 + ", L3 = " + l3 + ", L4 = " + l4 + ", L5 = " + l5);
    }

}
