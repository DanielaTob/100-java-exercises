package com.project100.exercises.arrays;

import java.util.Arrays;

public class ArraysIguales {

    /*
        Crea dos arrays e indica si son iguales.
     */

    public static void main(String[] args) {

        int[] arrayUno = { 2, 6, 5};
        int[] arrayDos = { 2, 6, 8};

        if (Arrays.equals(arrayUno, arrayDos)){
            System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Los arrays no son iguales");
        }
    }
}
