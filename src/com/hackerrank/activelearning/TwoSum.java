package com.hackerrank.activelearning;

import java.util.Arrays;

/**
 * <h3>Nivel 1: Problema Clásico de Arrays</h3>
 *
 * <p><b>Nombre del Problema: "Two Sum" (Suma de Dos)</b></p>
 *
 * <p>Este es, probablemente, uno de los problemas de entrevista más comunes que existen.</p>
 *
 * <p><b>Enunciado:</b></p>
 *
 * <p>Dado un array de números enteros nums y un número entero target, tu tarea es devolver los índices de los dos números en el array que suman target. Puedes asumir que siempre habrá exactamente una solución.</p>
 *
 * <p><b>Ejemplo:</b></p>
 *
 * <ul>
 *   <li><b>Input:</b> <code>nums = [2, 7, 11, 15]</code>, <code>target = 9</code></li>
 *   <li><b>Output:</b> <code>[0, 1]</code> (Porque <code>nums[0]</code> + <code>nums[1]</code> es <code>2 + 7 = 9</code>)</li>
 * </ul>
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

    // Método principal para probar la soluciónn
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Caso de prueba 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Caso de prueba 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(result1)); // Esperado: [0, 1]
        System.out.println();

        // Caso de prueba 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Caso de prueba 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + Arrays.toString(result2)); // Esperado: [1, 2]
        System.out.println();

        // Caso de prueba 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Caso de prueba 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Output: " + Arrays.toString(result3)); // Esperado: [0, 1]
        System.out.println();
    }
}
