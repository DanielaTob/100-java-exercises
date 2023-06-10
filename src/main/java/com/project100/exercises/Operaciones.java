package com.project100.exercises;

import java.util.Scanner;

public class Operaciones {

    /*
     Pida 2 numeros por consola y muestra su suma, resta, multiplicación y división
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Digita el primer numero");
        int firtsNumber = sc.nextInt();

        System.out.println("Digita el segundo numero");
        int secondNumber = sc.nextInt();

        int suma = firtsNumber + secondNumber;
        System.out.println("La suma es: " + suma);

        int resta = firtsNumber - secondNumber;
        System.out.println("La resta es: " + resta);

        int multi = firtsNumber * secondNumber;
        System.out.println("La multiplicacion es: " + multi);

        if (secondNumber == 0){
            System.out.println("No puedes dividir entre 0");
        }else{
            double division = (double) firtsNumber / secondNumber;
            System.out.println("La division es: " + division);
        }

    }
}
