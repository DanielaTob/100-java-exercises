package com.project100.exercises.functions;

public class InvertirPalabraPalindromo {

    /*
        Crea una funcion que indique si una frase o una palabra pasada
        por parametro es un palindromo.
     */

    public static void main(String[] args) {

        if (esPalindromo("alola")){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }

    }

    public static String invertirString(String frase){
        String invertida = "";

        char caracter;
        for (int i = frase.length() - 1; i >= 0; i--) {
            caracter = frase.charAt(i);
            invertida += caracter;
        }

        return invertida;
    }

    public static boolean esPalindromo(String frase){

        frase = frase.toLowerCase().trim();

        String invertida = invertirString(frase);

        if (frase.equals(invertida)){
            return true;
        }else {
            return false;
        }

    }
}
