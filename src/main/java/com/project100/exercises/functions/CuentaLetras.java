package com.project100.exercises.functions;

public class CuentaLetras {

    /*
        Crea una funcion que dado dos parametros, siendo el primero un String
        y el segundo un boolean, cuente las letras minusculas y mayusculas,
        segun el valor del segundo parametro.

        true = mayusculas, false = minusculas
     */

    public static void main(String[] args) {
        System.out.println(cuentaLetras("Hello World", false));
    }

    public static int cuentaLetras(String frase, boolean mayus){
        int min, max, contador = 0;

        if (mayus){
            min = 65;
            max = 90;
        }else{
            min = 97;
            max = 122;
        }

        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (caracter >= min && caracter <= max){
                contador++;
            }
        }

        return contador;
    }


}
