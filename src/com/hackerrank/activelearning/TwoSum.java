package com.hackerrank.activelearning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Nivel 1: Problema Clásico de Arrays
 * Nombre del Problema: "Two Sum" (Suma de Dos)
 * Este es, probablemente, uno de los problemas de entrevista más comunes que existen.
 * Enunciado:
 * Dado un array de números enteros nums y un número entero target, tu tarea es devolver los índices de los dos números en el array que suman target. Puedes asumir que siempre habrá exactamente una solución.
 * Ejemplo:
 *   - Input: nums = [2, 7, 11, 15], target = 9
 *   - Output: [0, 1] (Porque nums[0] + nums[1] es 2 + 7 = 9)
 */
public class TwoSum {

    // Solución al problema "Two Sum"
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            // No se encontró solución, aunque el problema asume que siempre hay una.
            return new int[]{};
        }
    }

    // Method principal para probar la solución
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el valor del objetivo (target):");
        int target = scanner.nextInt();

        int[] result = solution.twoSum(nums, target);

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));

        scanner.close();
    }
}
