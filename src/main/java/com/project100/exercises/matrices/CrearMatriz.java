package com.project100.exercises.matrices;

import java.util.Scanner;

public class CrearMatriz {

    /*
        Crear una matriz de numeros 3x3, pidiendo cada numero.
        Al final recorre la matriz y muestrala.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        //rellenar
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion i: " + i + " " + j );
                matriz[i][j] = sc.nextInt();
            }

        }

        //mostrar
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println("");

        }

    }
}
