package com.project100.exercises.arrays;

import java.util.Scanner;

public class MiniAhorcado {

    /*
        Vamos a hacer un pequeño ahorcado.
        Tendremos un pequeño array con palabras que tu elijas, crealo tu mismo.
        Debes mostrar la palabra escogida con guiones e ir pidiendo letras.
        El usuario gana cuando la palabra esté completa.
        Si falla 6 veces, el usuario pierde.
     */

    public static void main(String[] args) {

        final int NUMFALLOS_MAX = 6;

        String[] PALABRAS = {
            "chiste",
            "elefante",
            "alberto",
            "coche",
            "llaves",
            "naranja",
        };

        Scanner sc = new Scanner(System.in);

        String palabraAdivinar = PALABRAS[generarNumeroAleatorio(0, PALABRAS.length - 1)];

        char[] caracteres = palabraAdivinar.toCharArray();
        boolean[] acertados = new boolean[caracteres.length];
        int numeroFallos = 0;
        boolean ganaUsuario = false;

        char caracter;
        while (!palabraAcertada(acertados) && numeroFallos < NUMFALLOS_MAX){

            mostrarCaracteres(caracteres, acertados);
            System.out.println("Escribe una letra");
            caracter = sc.next().toLowerCase().charAt(0);

            if (revelarCaracteres(caracter, caracteres, acertados) > 0){
                System.out.println("Has acertado con el caracter");
            }else{
                numeroFallos++;
                if (numeroFallos!=NUMFALLOS_MAX){

                    System.out.println("Has fallado te quedan " + (NUMFALLOS_MAX - numeroFallos) + " fallos");

                }
            }
        }

        if (palabraAcertada(acertados)){
            System.out.println("Has ganado");
        }else {
            System.out.println("Has perdido");
        }


        mostrarCaracteres(caracteres, acertados);


    }

    public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static void mostrarCaracteres(char[] caracteres, boolean[] acertados){
        for (int i = 0; i < caracteres.length; i++) {
            if (acertados[i]){
                System.out.print(caracteres[i] + " ");
            }else{
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }

    public static boolean palabraAcertada(boolean[] acertados){
        for (int i = 0; i < acertados.length; i++) {
            if (!acertados[i]){
                return false;
            }
        }
        return true;
    }

    public static int revelarCaracteres(char caracter, char[] caracteres, boolean[] acertados){

        int acertadas = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == caracter){
                acertados[i]=true;
                acertadas++;
            }
        }
        return acertadas;
    }
}
