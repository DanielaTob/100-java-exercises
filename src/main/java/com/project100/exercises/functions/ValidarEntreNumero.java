package com.project100.exercises.functions;

import java.util.Scanner;

public class ValidarEntreNumero {

    /*
        Crea una funcion que valide un numero entre dos numeros.
        Necesitas dos parametros numericos.
     */

    public static void main(String[] args) {

        System.out.println(validacionNumero(0, 20));


    }

    public static int validacionNumero(int minimo, int maximo){

        Scanner sc = new Scanner(System.in);

        if (minimo > maximo){
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        int numero;

        do {

            System.out.println("Escribe un numero");
            numero = sc.nextInt();

            if ( !(numero >= minimo && numero <= maximo) ){
                System.out.println("Digita un numero entre" + minimo + " y " + maximo);
            }

        }while( !(numero >= minimo && numero <= maximo) );

        return numero;

    }


}
