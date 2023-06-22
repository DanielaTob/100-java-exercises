package com.project100.exercises.functions;

public class GenerarNumAleatorio {

    /*
       Crea una funcion que genere un numero aleatorio entre dos numeros
       pasados por parametro.
    */


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(generador(1, 10));
        }
    }

    public static int generador(int maximo, int minimo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));

    }

}
