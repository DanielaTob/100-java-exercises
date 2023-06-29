package com.project100.exercises.arrays;

public class PersonaMayor {

    /*
        Teniendo un array de String con el nombre de personas y otro de
        numeros con su edad, indicar quien es la persona mayor.
     */


    public static void main(String[] args) {

        String[] nombres = {"Fernando", "Jaime", "Alberto", "Pepito"};
        int[] edad = {28, 31, 20, 10};

        int edadMayor = edad[0];
        int posicionMayor = 0;

        for (int i = 0; i < edad.length; i++) {
            if (edad[i] > edadMayor){
                edadMayor = edad[i];
                posicionMayor = i;
            }
        }

        System.out.println("La persona mayor es: " + nombres[posicionMayor] + " con " + edadMayor + " años");


    }
}
