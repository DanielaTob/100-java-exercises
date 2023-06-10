package com.project100.exercises;

public class Pares {
    /* Mostrar los numeros pares que hay entre el 1 y 10 (while y for)
    */
    public static void main(String[] args) {

        //while
        int i = 1;
        while (i <= 10){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++; //i = i + 1
        }

        System.out.println("-------------");


        //for
        for (int j = 1; j <= 10; j++){
            if (j % 2 == 0){
                System.out.println(j);
            }
        }

    }
}
