package com.hackerrank.warmup;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("*    Bienvenido a Suma-Simple     *");
        System.out.println("*************************************");
        System.out.println("Este programa toma dos números enteros y calcula su suma.");

        System.out.print("Por favor, introduce el primer número: ");
        int a = in.nextInt();

        System.out.print("Gracias. Ahora, introduce el segundo número: ");
        int b = in.nextInt();

        int sum = solveMeFirst(a, b);

        System.out.println("Calculando...");
        System.out.println("La suma de " + a + " y " + b + " es: " + sum);

        System.out.println("¡Gracias por usar Suma-Simple!");
    }

}