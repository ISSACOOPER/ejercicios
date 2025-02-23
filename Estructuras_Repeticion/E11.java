package main.Estructuras_Repeticion;
/*2.40. Calcular la suma siguiente:
100 + 98 + 96 + 94 + . . . + 0 en este orden 
 */

public class E11 {
    public static void main(String[] args) {
        int suma = 0;

        // Bucle que va desde 100 hasta 0, restando 2 en cada iteración
        for (int i = 100; i >= 0; i -= 2) {
            suma += i; // Sumar el valor actual de i
        }

        // Imprimir el resultado
        System.out.println("✅ La suma de la serie es: " + suma);
    }
}
