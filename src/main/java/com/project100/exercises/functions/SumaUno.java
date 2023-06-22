package com.project100.exercises.functions;

public class SumaUno {

    /*
       Crear una funcion que me devuelva la suma del 1 al numero pasado
       por parametro (este incluido)
    */

    public static void main(String[] args) {

        //2-Llamado de la funcion
        int n = 10;

        int resultado = suma1N(n);

        System.out.println(resultado);

    }

    //1-Definir funcion
    public static int suma1N(int n){

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;
    }
}
