package com.project100.exercises.matrices;

public class DiagonalMatriz {

    /*
        Crear una matriz de numeros 3x3 tu mismo.
       y recorre su diagonal principal y su diagonal inversa.
    */

    public static void main(String[] args) {

        int[][] matriz =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

        // Recorrer y mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Diagonal Principal
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }

        // Diagonal Inversa
        System.out.println("Diagonal Inversa:");
        for (int i = 0, j = matriz[0].length - 1; i < matriz.length; i++, j--) {
            System.out.println(matriz[i][j]);
        }

        //recorreMatrizDiagonal(matriz, 1);

    }
    /*public static void recorreMatrizDiagonal(int[][] matriz, int diagonal){
        for (int i = 0; i < matriz.length ; i++) {
            System.out.println(matriz[i][i]);
        }
    }
*/

}
