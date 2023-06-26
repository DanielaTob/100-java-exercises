package com.project100.exercises.arrays;

import java.util.Scanner;

public class CrearArray {

    /*
        Crea un array de 3 posiciones, rellenalo pidiendo los numeros al
        usuario y recorrelo para mostrarlo.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        int numero;

        System.out.println("Insertando numeros");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserta un numero en la posicion " + i);
            numero = sc.nextInt();
            numeros[i] = numero;
        }

        System.out.println("Mostrar Array: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
