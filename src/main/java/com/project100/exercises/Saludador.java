package com.project100.exercises;

import java.util.Scanner;

public class Saludador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre + " bienvenida");

    }
}
