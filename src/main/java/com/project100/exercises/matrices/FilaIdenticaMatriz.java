package com.project100.exercises.matrices;

public class FilaIdenticaMatriz {

    /*
        Crear una matriz de numeros 3x3 tu mismo.
        Crea una funcion que pasandole la matriz y la fila a revisar,
        debe indicar si los valores de esa fila son identicos.
    */

    public static void main(String[] args) {

        int[][] matriz =
                {
                        {1,2,3},
                        {4,4,4},
                        {7,8,9}


                };

        System.out.println(filaIdenticaMatriz(matriz,  2));
    }

    public static boolean filaIdenticaMatriz(int[][] matriz, int fila){
        if (fila >= 0 && fila < matriz.length){

            int primerValor = matriz[fila][0];

            for (int j = 1; j < matriz.length; j++) {
                if (primerValor != matriz[fila][j]){
                    return false;
                }
            }

            return true; //sale totalmente

        }else {
            return false; //sale totalmente
        }
    }
}
