package com.project100.exercises.arrays;

import java.util.Scanner;

public class DigitosArray {

    /*
        Crea una funcion que dado un numero natural me devuelva sus digitos
        en un array.
     */

    public static void main(String[] args) {

        int numero = validaNumero(0, Integer.MAX_VALUE);

        int[] numeros = devolverArray(numero);

        mostrarArray(numeros);

    }

    public static int validaNumero(int minimo, int maximo){

        Scanner sc = new Scanner(System.in);

        if (minimo > maximo){
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        int numero;
        do {
            System.out.println("Escribe un numero");
            numero = sc.nextInt();

            if (!(numero >= minimo && numero <= maximo)){
                System.out.println("Debes escribir un numero entre " + minimo + " y " + maximo);
            }
        }while(!(numero >= minimo && numero <= maximo));

        return numero;
    }

    public static int[] devolverArray(int numero){

        int numCifras = 0;

        final int DIVISOR = 10;

        for (int i = numero; i > 0; i /= DIVISOR) {
            numCifras++;
        }
        
        int[] digitos = new int[numCifras];

        /*
        //De derecha a izquierda
        for (int i = numero, j = 0; i > 0; i /= DIVISOR) {
            digitos[j] = i % DIVISOR;
        }
        */

        for (int i = numero, j = numCifras - 1; i > 0; i /= DIVISOR, j--) {
            digitos[j] = i % DIVISOR;
        }


        return digitos;
    }

    public static void mostrarArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
