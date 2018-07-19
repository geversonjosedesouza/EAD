/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class OficinaArray {

    public static void arrayUnidimensional() {
        /* Array declaração*/
        char primeiro[];
        primeiro = new char[8];
        /* Adicionando elementos ao array*/
        primeiro[0] = 'G';
        primeiro[1] = 'E';
        primeiro[2] = 'V';
        primeiro[3] = 'E';
        primeiro[4] = 'R';
        primeiro[5] = 'S';
        primeiro[6] = 'O';
        primeiro[7] = 'N';
        /* Imprimindo array */
        for (int i = 0; i < 8; i++) {
            System.out.print(primeiro[i]);
        }
        System.out.println();
    }

    public static void arrayBidimensional() {
        int segundo[][] = new int[3][8];
        //preenche
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite um número e aperte enter: ");
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                segundo[i][j] = num;
            }

        }
        //imprime
        System.out.print("Array bidimensional: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(segundo[i][j]);
            }

        }
        System.out.println();
    }
}
