package com.project100.exercises.basics;

import java.util.Scanner;

public class Bisiesto {

    /*
        Pide un año por teclado (numero) e indica si es bisisesto o no.
       Es bisiesto cuando divisible entre 4 y no divisible entre 100 o si es divisible entre 400
     */

    /* && y
        v & v = v
        v & f = f
        f & v = f
        f & f = f
     */

    /* || or
        v | v = v
        v | f = v
        f | v = v
        f | f = f
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int bisiesto = sc.nextInt();

        if ( bisiesto % 4 == 0 && bisiesto % 100 != 0 || bisiesto % 400 == 0){
            System.out.println("Es año bisiesto");
        }else{
            System.out.println("No es año bisiesto");
        }
    }
}
