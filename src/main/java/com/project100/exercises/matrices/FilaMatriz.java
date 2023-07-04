package com.project100.exercises.matrices;

public class FilaMatriz {

    /*
        Crear una matriz de numeros 3x3 tu mismo.
        Crea una funcion que pasandole una matriz y una fila(numero)
        muestre solo esa fila.
    */

    public static void main(String[] args) {

        int[][] matriz =
        {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        muestraFilaMatriz(matriz, 0);

    }

    public static void muestraFilaMatriz(int[][] matriz, int fila){

        if (fila >= 0 && fila < matriz.length){
            for (int i = 0; i < matriz[0].length ; i++) {
                System.out.println(matriz[fila][i]);
            }
        }else {
            System.out.println("La fila no es correcta");
        }



    }


}
