package com.project100.exercises.functions;

public class GenerarPassword {

    /*
        Crea una funcion que genere una password aleatoriamente con letras
        mayusculas, minusculas y numeros.
        Pasale por parametro la longitud del password.
     */

    public static void main(String[] args) {
        System.out.println(generarPassword(8));
    }

    public static int generarNunmeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static char generarMayusAleatoria(){
        return (char) generarNunmeroAleatorio(65,90);
    }

    public static char generarMinusAleatoria(){
        return (char) generarNunmeroAleatorio(97,122);
    }

    public static String generarPassword(int longitud){

        String password = "";

        int eleccion;

        for (int i = 0; i < longitud; i++) {

            eleccion = generarNunmeroAleatorio(1, 3);

            switch (eleccion){
                case 1: //numero
                    password += generarNunmeroAleatorio(0, 9);
                    break;

                case 2: //mayuscula
                    password +=  generarMayusAleatoria();
                    break;

                case 3: //minuscula
                    password += generarMinusAleatoria();
                    break;
            }


        }

        return password;

    }
}
