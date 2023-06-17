package com.project100.exercises;

import java.util.Scanner;

public class ConcatenaPalabras {

    /* Pedir palabras al usuario hasta que el usuario escriba una cadena vacia.
        Muestra la concatenacion de esas oalabras al final
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escribe una cadena de texto");
        String textoUsuario = sc.next();

        String concatenar = "";


        while (!textoUsuario.isEmpty()) {     //textoUsuario.equals("")

            concatenar += textoUsuario;       //concatenar = concatenar + textoUsuario;

            System.out.println("Escribe una cadena de texto");
            textoUsuario = sc.next();
        }

        System.out.println(concatenar);
    }
}
