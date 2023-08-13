package com.project100.exercises.matrices;

import java.util.Scanner;

public class BuscaMinas {

    /*
        Teniendo una matriz 6 x 7 de char con 10 minas colocadas
        aleatoriamente (no repetidas). Pide al usuario fila y columna
        (solo zonas que no se hayan explorado), el jugador gana cuando
        no pisa ninguna mina durante 5 turnos seguidos.
        Si pisa una mina, el juego termina.
        Estos son los valores que debemos mostrar:
        - V = Vacio
        - M = Mina
        - X = Mo explorado
    */

    public static void main(String[] args) {
        final char VACIO = 'V';
        final char MINA = 'M';
        final int LONG_COL_MATRIZ = 6;
        final int LONG_FIL_MATRIZ = 7;
        final int TURNOS_SIN_MINA = 5;

        Scanner sc = new Scanner(System.in);

        char[][] campoMinas = new char[LONG_FIL_MATRIZ][LONG_COL_MATRIZ];
        boolean[][] mostrarCasilla = new boolean[LONG_FIL_MATRIZ][LONG_COL_MATRIZ];

        rellenarMatriz(campoMinas, VACIO);

        int fila, columna, minasRestantes = 10;
        while (minasRestantes > 0) {
            fila = generarNumeroAleatorio(0, LONG_FIL_MATRIZ - 1);
            columna = generarNumeroAleatorio(0, LONG_COL_MATRIZ - 1);

            if (campoMinas[fila][columna] == VACIO) {
                campoMinas[fila][columna] = MINA;
                minasRestantes--;
            }
        }

        int turnoSinMinas = 0;
        boolean minaPisada = false;

        while (turnoSinMinas != TURNOS_SIN_MINA && !minaPisada) {
            mostrarMatriz(campoMinas, mostrarCasilla);

            System.out.println("Elige una fila");
            fila = sc.nextInt();

            System.out.println("Elige una columna");
            columna = sc.nextInt();

            if (fila >= 0 && fila < LONG_FIL_MATRIZ && columna >= 0 && columna < LONG_COL_MATRIZ) {
                if (!mostrarCasilla[fila][columna]) {
                    char zona = campoMinas[fila][columna];

                    if (zona == MINA) {
                        minaPisada = true;
                    } else {
                        turnoSinMinas++;
                    }

                    mostrarCasilla[fila][columna] = true;
                } else {
                    System.out.println("Debes elegir una zona no explorada");
                }
            } else {
                System.out.println("Coordenadas inválidas. Inténtalo de nuevo.");
            }
        }

        mostrarMatriz(campoMinas, mostrarCasilla);

        if (minaPisada) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Te has salvado");
        }
    }

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }

    public static void mostrarMatriz(char[][] matriz, boolean[][] visible) {
        final char NO_EXPLORADO = 'X';
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (visible[i][j]) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print(NO_EXPLORADO + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void rellenarMatriz(char[][] matriz, char simbolo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = simbolo;
            }
        }
    }


}
