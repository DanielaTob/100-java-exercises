package com.project100.exercises.basics;

import java.util.Scanner;

public class Horas {

    /*
        Pide un numero de segundos e indica cuantas horas, minutos
        y segundos equivalen
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SEG_HORAS = 3600;

        System.out.println("Escribe el numero de segundos");
        int segundos = sc.nextInt();

        int horas = segundos / SEG_HORAS;

        int segundos_restantes = segundos % SEG_HORAS;

        int minutos = segundos_restantes / 60;

        segundos = segundos_restantes % 60;

        System.out.println("Son " + horas + " hora/s, " + minutos + " minuto/s, "+ segundos + " segundo/s");
    }
}
