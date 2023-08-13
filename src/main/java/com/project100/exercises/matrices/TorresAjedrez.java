package com.project100.exercises.matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TorresAjedrez {

    /*
        Teniendo una matriz de char 8 x 8 simular el movimiento de una torre de ajedrez.
        Pudiendose mover en diagonal dentro del tablero.
        Debes mostrar donde se encuentra en cada momento.
        Su posicion inicial será aleatoria.
        Usar un menú.
    */

    public static void main(String[] args) {


        final char VACIO = 'X';
        final char TORRE = 'O';

        char[][] matriz = new char[8][8];

        rellenarMatriz(matriz, VACIO);

        int posicionActualAlfilX = generarNunmeroAleatorio(0, matriz.length - 1); //fila
        int posicionActualAlfilY = generarNunmeroAleatorio(0, matriz[0].length - 1); //columna


        int posicionAntiguaAlfilX, dirX = 0;
        int posicionAntiguaAlfilY, dirY = 0;

        matriz[posicionActualAlfilX][posicionActualAlfilY] = TORRE;


        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardar la opcion del usuario

        while (!salir){

            mostrarMatriz(matriz);

            System.out.println("¿A donde quieres moverte?");

            System.out.println("1. Mover arriba");
            System.out.println("2. Mover derecha");
            System.out.println("3. Mover abajo");
            System.out.println("4. Mover izquierda");
            System.out.println("5. Salir");

            try{
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                posicionAntiguaAlfilX = posicionActualAlfilX;
                posicionAntiguaAlfilY = posicionActualAlfilY;


                switch (opcion){
                    case 1:
                        dirX = - 1;
                        dirY = 0;
                        break;
                    case 2:
                        dirX = - 1;
                        dirY = 1;
                        break;
                    case 3:
                        dirX = 1;
                        dirY = 0;
                        break;
                    case 4:
                        dirX = 0;
                        dirY = 1;
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 y 9");
                }

                while (limiteMatriz(matriz.length, matriz[0].length,
                        posicionActualAlfilX + dirX,
                        posicionActualAlfilY + dirY)){
                    posicionActualAlfilX += dirX;
                    posicionActualAlfilY += dirY;
                }

                matriz[posicionAntiguaAlfilX][posicionAntiguaAlfilY] = VACIO;
                matriz[posicionActualAlfilX][posicionActualAlfilY] = TORRE;


            }catch (InputMismatchException e){
                System.out.println("Debes insertar un numero");
            }
        }
    }

    public static void mostrarMatriz(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenarMatriz(char[][] matriz, char simbol){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 'X';
            }

        }
    }

    //Metodo
    public static boolean limiteMatriz(int longFilas, int longColum, int x, int y){

        if (x >= 0 && x < longFilas && y >= 0 && y < longColum){
            return true;
        }else{
            return false;
        }


    }

    public static int generarNunmeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

}


