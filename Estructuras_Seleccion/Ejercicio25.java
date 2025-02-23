package main.Estructuras_Seleccion;

import java.util.Scanner;
/*1.25. Realizar un programa que solicite dos números enteros, los ordene en forma ascendente y los imprima. */

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Ordenar los números en forma ascendente
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Mostrar los números ordenados
        System.out.println("📌 Números ordenados en forma ascendente: " + num1 + ", " + num2);

        scanner.close();
    }
}
