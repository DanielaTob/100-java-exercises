package com.project100.exercises.arrays;

import java.util.Scanner;

public class Letradni {

    /*
        Dado un array de caracteres (te lo doy yo) y tu numero de DNI, debes
        sacar la letra de tu DNI.
        Para obtenerla solo debe sacar el modulo de 23 y ese sera el indice
        del array.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char letrasNIF[] = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        System.out.println("Escribe tu numero de DNI");
        int dni = sc.nextInt();

        final int DIVISOR = 23;

        int indiceLetra = dni % DIVISOR;

        System.out.println(dni + " " + letrasNIF[indiceLetra]);

    }
}
