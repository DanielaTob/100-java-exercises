package com.project100.exercises;

import java.util.Scanner;

public class RecorreCadena {
    /* Pide una cadena por consola y muestra sus caracteres de uno a uno
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Inserta una frase");
        String cadena = sc.next();


        // h o l a
        // 0 1 2 3

        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            System.out.println(caracter);
        }

    }
}
