package org.example;

import java.util.Scanner;

public class Estudiante_Evaluacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Nota_uno = 0;
        double Nota_dos = 0;
        double Nota_tres = 0;
        double Nota_cuatro = 0;

        double Porcenataje_Nota_uno = 0;
        double Porcenataje_Nota_dos = 0;
        double Porcenataje_Nota_tres = 0;
        double Porcenataje_Nota_cuatro = 0;

        double Promedio = 0;
        double Nota_Final = 0;
        double Diferencia_notas = 0;

        double Nota_Mas_Alta = 0;
        double Nota_Mas_Baja = 0;

        System.out.println("Ingrese el valor de Nota uno de 1 a 5");
        Nota_uno = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de la nota uno");
        Porcenataje_Nota_uno = sc.nextDouble();
        System.out.println("Ingrese el valor de la nota dos de 1 a 5");
        Nota_dos = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de la nota dos");
        Porcenataje_Nota_dos = sc.nextDouble();
        System.out.println("Ingrese el valor de la nota tres de 1 a 5");
        Nota_tres = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de la nota tres");
        Porcenataje_Nota_tres = sc.nextDouble();
        System.out.println("Ingrese el valor de la nota cuatro  de 1 a 5");
        Nota_cuatro = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de la nota cuatro");
        Porcenataje_Nota_cuatro = sc.nextDouble();

        Nota_Final = (Nota_uno * Porcenataje_Nota_uno/100) + (Nota_dos * Porcenataje_Nota_dos/100) + (Nota_tres * Porcenataje_Nota_tres/100) + (Nota_cuatro * Porcenataje_Nota_cuatro/100);
        Promedio = Nota_uno + Nota_dos + Nota_tres + Nota_cuatro / 4 ;

        if (Nota_uno >= Nota_dos && Nota_uno >= Nota_tres && Nota_uno >= Nota_cuatro) {
            Nota_Mas_Alta = Nota_uno;
        } else if (Nota_dos >= Nota_tres && Nota_dos >= Nota_cuatro) {
            Nota_Mas_Alta = Nota_dos;
        } else if (Nota_tres >= Nota_cuatro) {
            Nota_Mas_Alta = Nota_tres;
        } else {
            Nota_Mas_Alta = Nota_cuatro;
        }

        if (Nota_uno <= Nota_dos && Nota_uno <= Nota_tres && Nota_uno <= Nota_cuatro) {
            Nota_Mas_Baja = Nota_uno;
        } else if (Nota_dos <= Nota_tres && Nota_dos <= Nota_cuatro) {
            Nota_Mas_Baja = Nota_dos;
        } else if (Nota_tres <= Nota_cuatro) {
            Nota_Mas_Baja = Nota_tres;
        } else {
            Nota_Mas_Baja = Nota_cuatro;
        }

        double diferencia = Nota_Mas_Alta - Nota_Mas_Baja;

        System.out.println("La nota mas alta es " + Nota_Mas_Alta);
        System.out.println("La nota mas baja es " + Nota_Mas_Baja);
        System.out.println("La diferencia es " + diferencia);
        System.out.println("La nota finla es :" + Nota_Final);
        System.out.println("El promedio es " + Promedio);
        if (Nota_Final >= 3.0){
            System.out.println("El estudiante aprobo");
        }
        else {
            System.out.println("El estudiante reprobo");
        }

    }
}
