package com.project100.exercises.basics;

import java.util.Scanner;

public class Menor {

    /*
        Pide 2 numeros por consola e indica cual es el menor de los 2 numeros.
        En caso de que sean iguales, tambien lo debes indicar
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Digita el primer numero");
        int one = sc.nextInt();

        System.out.println("Digita el segundo numero");
        int two = sc.nextInt();

        if (one < two ){
            System.out.println("El primer numero es menor que el segundo numero");
        } else if (two < one) {
            System.out.println("El segundo numero es menor que el primer numero");
        } else if (one == two) {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
