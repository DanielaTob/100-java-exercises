package com.project100.exercises;

import java.util.Scanner;

public class AdivinaNumero {

    /*
    Vamos a jugar un pequeño juego.
    Vamos a generar un numero aleatorio entre 1 y 100.
    Debes pedir al usuario numeros que estén entre estos 2 numeros.
    Si el usuario falla, debes indicarle si el numero que introdujo es mayor
    o menor que el que debe acertar.
    El programa termina cuando el usuario acierta. No hay limite de intentos.
    */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int maximo = 100;
        int minimo = 1;

        int numeroAcertar = (int) (Math.random() * (maximo - minimo + 1) + (minimo));

        int numeroUsuario;

        boolean fin = false;

        while (!fin){

            do {
                System.out.println("Escribe un numero entre 1 y 100");
                numeroUsuario = sc.nextInt();

                if (!(numeroUsuario >= minimo && numeroUsuario <= maximo)){
                    System.out.println("Debes escribir un numero entre 1 y 100");
                }

            }while(!(numeroUsuario >= minimo && numeroUsuario <= maximo));

            if (numeroUsuario < numeroAcertar){
                System.out.println("Es mayor que el que escribiste");
            } else if (numeroUsuario > numeroAcertar) {
                System.out.println("Es menor que el que escribiste");
            }else{
                System.out.println("¡Haz acertado! El numero era " + numeroAcertar);
                fin = true;
            }

        }
    }
}
