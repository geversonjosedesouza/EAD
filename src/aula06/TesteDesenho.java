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
public class TesteDesenho {

    public static void main(String[] args) {
        Desenhavel[] listaDesenhos = new Desenhavel[10];

        listaDesenhos[0] = new Triangulo(2, 10, 8);

        listaDesenhos[1] = new Triangulo(5, 20, 15);

        listaDesenhos[2] = new Pentagono(25, 30, 50, 50, 20);

        listaDesenhos[3] = new Pentagono(2, 3, 7, 2, 1);
        listaDesenhos[4] = new Pentagono(2, 3, 7, 2, 1);
        listaDesenhos[5] = new Pentagono(2, 3, 7, 2, 1);
        listaDesenhos[6] = new Pentagono(2, 3, 7, 2, 1);
        listaDesenhos[7] = new Pentagono(2, 3, 7, 2, 1);
        listaDesenhos[8] = new Pentagono(2, 3, 7, 2, 1);

        //...
        listaDesenhos[9] = new Triangulo(10, 20, 30);

        for (int i = 0; i < listaDesenhos.length; i++) {

            listaDesenhos[i].desenhar();

        }
    }

}
