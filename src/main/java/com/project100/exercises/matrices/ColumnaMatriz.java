package com.project100.exercises.matrices;

public class ColumnaMatriz {

     /*
        Crear una matriz de numeros 3x3 tu mismo.
        Crea una funcion que pasandole una matriz y una columna(numero)
        muestre solo esa columna.
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

    public static void muestraFilaMatriz(int[][] matriz, int colum){

        if (colum >= 0 && colum < matriz[0].length){
            for (int i = 0; i < matriz.length ; i++) {
                System.out.println(matriz[i][colum]);
            }
        }else {
            System.out.println("La columna no es correcta");
        }

    }
}
