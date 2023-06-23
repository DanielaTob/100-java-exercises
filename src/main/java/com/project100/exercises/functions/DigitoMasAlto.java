package com.project100.exercises.functions;

public class DigitoMasAlto {

    /*
        Crea una funcion que dado un numero, decir cual es el digito
        mas alto que tiene.
     */

    public static void main(String[] args) {
        System.out.println(digitoMasAlto(5918));
    }

    public static int digitoMasAlto(int numero){

        final int DIVISOR = 10;

        int mayor = 0;

        for (int i = numero; i > 0 ; i /= DIVISOR) {

            if (i % DIVISOR > mayor){
                mayor = i % DIVISOR;
            }

        }

        return mayor;
    }
}
