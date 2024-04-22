/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_burbuja;

import java.util.Scanner;

/**
 *
 * @author KAREN
 */
public class Algoritmo_burbuja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cartas en su mano: ");
        int numCartas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt()

        String[] manoDeCartas = new String[numCartas];

        System.out.println("Ingrese las cartas en su mano:");
        for (int i = 0; i < numCartas; i++) {
            System.out.print("Carta " + (i + 1) + ": ");
            manoDeCartas[i] = scanner.nextLine();
        }

        System.out.println("Mano de cartas antes de ordenar:");
        imprimirMano(manoDeCartas);

        ordenamientoBurbuja(manoDeCartas);

        System.out.println("\nMano de cartas después de ordenar:");
        imprimirMano(manoDeCartas);

        scanner.close();
    }

    public static void ordenamientoBurbuja(String[] mano) {
        int n = mano.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compararCartas(mano[j], mano[j + 1]) > 0) {
                    // Intercambiar cartas
                    String temp = mano[j];
                    mano[j] = mano[j + 1];
                    mano[j + 1] = temp;
                }
            }
        }
    }

    // Método para comparar dos cartas
    public static int compararCartas(String carta1, String carta2) {
        // Comparar por valor primero
        char valor1 = carta1.charAt(0);
        char valor2 = carta2.charAt(0);
        if (valor1 != valor2) {
            return valor1 - valor2;
        }
        // Si los valores son iguales, comparar por palo
        char palo1 = carta1.charAt(1);
        char palo2 = carta2.charAt(1);
        return palo1 - palo2;
    }

    public static void imprimirMano(String[] mano) {
        for (String carta : mano) {
            System.out.print(carta + " ");
        }
        System.out.println();
    
    }
}
