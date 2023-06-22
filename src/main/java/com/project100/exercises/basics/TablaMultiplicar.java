package com.project100.exercises.basics;

import java.util.Scanner;

public class TablaMultiplicar {

    /* Pedir un numero por consola y mostrar la tabla del 10
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escribe un numero");
        int numero = sc.nextInt();

        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
