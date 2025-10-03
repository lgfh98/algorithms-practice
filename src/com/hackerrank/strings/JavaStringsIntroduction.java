package com.hackerrank.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        System.out.println("Este programa toma dos palabras como entrada y realiza las siguientes acciones:");
        System.out.println("1. Calcula la suma de las longitudes de ambas palabras.");
        System.out.println("2. Determina si la primera palabra es lexicográficamente mayor que la segunda.");
        System.out.println("3. Pone en mayúscula la primera letra de cada palabra y las imprime.");
        System.out.println("Por favor, ingrese la primera palabra:");

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println("Por favor, ingrese la segunda palabra:");
        String B = sc.next();

        System.out.println("Suma de longitudes: " + (A.length() + B.length()));

        if (A.compareTo(B) > 0) {
            System.out.println("¿La primera palabra es mayor lexicográficamente?: Yes");
        } else {
            System.out.println("¿La primera palabra es mayor lexicográficamente?: No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println("Palabras con mayúscula inicial: " + capitalizedA + " " + capitalizedB);
    }
}
