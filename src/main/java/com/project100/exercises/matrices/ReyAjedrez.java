package com.project100.exercises.matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReyAjedrez {

    /*
        Teniendo una matriz de char 8 x 8 simular el movimiento de un rey de ajedrez.
        Pudiendose mover una posicion dentro del tablero.
        Debes mostrar donde se encuentra en cada momento.
        Usar un menú.
    */

    public static void main(String[] args) {


        final char VACIO = 'X';
        final char REY = 'O';

        char[][] matriz = new char[8][8];

        rellenarMatriz(matriz, VACIO);

        int posicionActualReyX = 0; //fila
        int posicionAntiguaReX = 0;
        int posicionActualReyY = 0; //columna
        int posicionAntiguaReY = 0;

        matriz[posicionActualReyX][posicionActualReyY] = REY;
        
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardar la opcion del usuario

        while (!salir){

            mostrarMatriz(matriz);

            System.out.println("¿A donde quieres moverte?");

            System.out.println("1. Mover arriba");
            System.out.println("2. Mover arriba - derecha");
            System.out.println("3. Mover derecha");
            System.out.println("4. Mover abajo - derecha");
            System.out.println("5. Mover abajo");
            System.out.println("6. Mover abajo - izquierda");
            System.out.println("7. Mover izquierda");
            System.out.println("8. Mover arriba - izquierda");
            System.out.println("9. Salir");

            try{
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                posicionAntiguaReX = posicionActualReyX;
                posicionAntiguaReY = posicionActualReyY;


                switch (opcion){
                    case 1:
                        posicionActualReyX --;
                        break;
                    case 2:
                        posicionActualReyX --;
                        posicionActualReyY ++;
                        break;
                    case 3:
                        posicionActualReyY ++;
                        break;
                    case 4:
                        posicionActualReyX ++;
                        posicionActualReyY ++;
                        break;
                    case 5:
                        posicionActualReyX ++;
                        break;
                    case 6:
                        posicionActualReyX ++;
                        posicionActualReyY --;
                        break;
                    case 7:
                        posicionActualReyY --;
                        break;
                    case 8:
                        posicionActualReyX --;
                        posicionActualReyY --;
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 y 9");
                }

                if (limiteMatriz(matriz.length, matriz[0].length, posicionActualReyX, posicionActualReyY)){
                    matriz[posicionActualReyX][posicionActualReyY] = REY;
                    matriz[posicionAntiguaReX][posicionAntiguaReY] = VACIO;
                }else{
                    System.out.println("Posicion fuera del juego");
                    posicionActualReyX = posicionAntiguaReX ;
                    posicionActualReyY = posicionAntiguaReY;
                }



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
}
