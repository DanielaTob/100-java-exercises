package com.project100.exercises;

import java.util.Scanner;

public class Palindromo {

    /*
    Pide una frase por consola e indica si es palindromo.
    Es palindromo cuando se lee una frase igual de izquierda a derecha
    que de derecha a izquierda. Por ejemplo alola
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escribe una palabra");
        String palabra = sc.next().trim(); //trim elimina los espacios de adelante y atras, no los del medio.

        String invertida = "";

        char caracter;
        for (int i = palabra.length() -1; i >= 0 ; i--) {
            caracter = palabra.charAt(i);
            invertida += caracter;
        }

        if (palabra.equals(invertida)){
            System.out.println("La palabara o frase es palindromo");
        }else{
            System.out.println("La palabara o frase no es palindromo");
        }

    }
}
