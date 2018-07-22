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
public class Triangulo implements Desenhavel {

    int l1, l2, l3;

    Triangulo(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public void desenhar() {
        System.out.println("Sou um triângulo de lados: L1 = " + l1 + ", L2 = " + l2 + ", L3 = " + l3);
    }

}
