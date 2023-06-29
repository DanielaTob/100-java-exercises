package com.project100.exercises.calcula_salario;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {

     /*
        Pide un salario base por consola y su puesto por consola.
        Calcula su sueldo sabiendo lo siguiente:

        Si es vendedor, cobra 500 euros más.
        Si es director, cobra 1000 euros más.
        Si es conserge, cobra 100 euros más.

        Utiliza un enumerado para almacenar los tipos de puestos de trabajo.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        System.out.println("Escribe un salario");
        double salarioBase = sc.nextDouble();

        System.out.println("Escribe un puesto");
        String puesto = sc.next().toUpperCase().trim();


        boolean existe = false;

        for (PuestoTrabajo p:PuestoTrabajo.values()) {
            if (puesto.equals(p.name())){
                existe = true;
            }
        }

        if (existe){

            double salarioFinal = salarioBase;
            PuestoTrabajo p = PuestoTrabajo.valueOf(puesto);

            switch (p){
                case VENDEDOR:
                    salarioFinal += 500;
                    break;

                case DIRECTOR:
                    salarioFinal += 1000;
                    break;

                case CONSERJE:
                    salarioFinal += 100;
                    break;
            }

            System.out.println("El salario final es: " + salarioFinal);


        }else{
            System.out.println("Ese puesto no existe");
        }


    }
}
