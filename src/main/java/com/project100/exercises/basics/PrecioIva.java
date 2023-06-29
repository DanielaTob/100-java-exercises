package com.project100.exercises.basics;

import java.util.Locale;
import java.util.Scanner;

public class PrecioIva {

    /*
        Pide un numero real que represente a un precio
        y muestra el precio con IVA. El IVA esde 21%
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double IVA = 0.21; //final = constante

        System.out.println("Ingresa un precio");
        double precioSinIva = sc.nextInt();

        //double precioIva = precioSinIva + (precioSinIva * IVA);
        double precioIva = precioSinIva * (1 + IVA);

        System.out.println("El precio final es de " + precioIva);
    }
}
