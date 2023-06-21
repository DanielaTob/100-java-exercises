package com.project100.exercises;

import java.util.Scanner;

public class Ecuacion2Grado {

     /*
    Pide 3 números por consola y realiza una ecuación de segundo grado.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe el primer numero");
        int a = sc.nextInt();

        System.out.println("Escribe el segundo numero");
        int b= sc.nextInt();

        System.out.println("Escribe el tercer numero");
        int c = sc.nextInt();

        double discriminante = (Math.sqrt(Math.pow(b, 2) - 4 * a * c));

        double x1;
        double x2;

        if (discriminante > 0 ){
            x1 = -b + (Math.sqrt(discriminante)) / (2 * a);

            x2 = -b - (Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las soluciones son: " + x1 + " " + x2);


        } else if (discriminante == 0) {

            x1 = -b / (2 * a);

            System.out.println("Su unica solucion es " + x1);

        }else {
            System.out.println("No tiene solucion");
        }


    }
}
