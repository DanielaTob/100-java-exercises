package com.project100.exercises.arrays;

import java.util.Arrays;

public class MayorMenorArray {

    /*
        Mostrar el menor y mayor de un array de numeros creado por ti mismo.
     */

    public static void main(String[] args) {

        int[] array = { 4, 70, 3, 90, 102, 5};

        System.out.println("Version 1");
        mayorMenorArray(array);

        System.out.println("Version 2");
        mayorMenorArrayV2(array);

    }

    public static void mayorMenorArray(int[] array){

        int mayor = array[0];
        int menor = array[0];

        for (int i = 0; i < array.length; i++) {


            if (array[i] > mayor){
                mayor = array[i];
            }

            if (array[i] < menor){
                menor = array[i];
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

    //versión 2 del codigo
    public static void mayorMenorArrayV2(int[] array){

        Arrays.sort(array); //Ordena de menor a mayor

        int mayor = array[array.length-1]; //acceder a -1 posicion
        int menor = array[0];

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

    }

}
