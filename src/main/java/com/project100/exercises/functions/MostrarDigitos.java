package com.project100.exercises.functions;

public class MostrarDigitos {

    /*
        Crea un metodo que dado un numero, muestre sus digitos.
     */

    public static void main(String[] args) {
        muestraDigitos(123);
    }

    public static void muestraDigitos(int numero){

        final int DIVISOR = 10;

        for (int i = numero; i > 0; i /= DIVISOR) {
            System.out.print(i % DIVISOR + " ");
        }



    }
}
