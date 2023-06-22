package com.project100.exercises.basics;


public class GeneraNumAleatorios {

    /*
    Genera 10 numeros aleatorios entre 1 y 10
    */

    public static void main(String[] args) {

        int maximo = 10;
        int minimo = 0;

        //0 * (10 - 1 + 1) + (1) = 1
        //1 * (10 - 1 + 1) + (1) = 11

        int aleatorio;
        for (int i = 0; i < 10; i++) {

            aleatorio = (int) (Math.random() * (maximo - minimo + 1) + (minimo));
            System.out.println(aleatorio);

        }

    }
}
