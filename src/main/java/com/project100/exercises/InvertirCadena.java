package com.project100.exercises;

import java.util.Scanner;

public class InvertirCadena {

    /*
    Pide una frase o palabra por consola e inviertela
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escribe una frase o palabra");
        String frase = sc.next();

        String invertida = "";

        char caracter;
        for (int i = frase.length() - 1; i >= 0; i--) {
            caracter = frase.charAt(i);
            invertida += caracter;
        }

        System.out.println("Palabra Invertda: " + invertida);
    }
}
