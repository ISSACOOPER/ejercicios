package main.Estructuras_Repeticion;
/*2.8. Calcular de la suma y la media aritmética de N números reales. Solicitar el valor de N al usuario y cada uno de los
N números reales.  */
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números a ingresar
        System.out.print("Ingrese la cantidad de números reales (N): ");
        int N = scanner.nextInt(); // Leer el valor de N

        // Validar que N sea mayor que 0
        if (N <= 0) {
            System.out.println("El valor de N debe ser mayor que 0.");
        } else {
            double suma = 0; // Variable para almacenar la suma de los números

            // Bucle para leer los N números y sumarlos
            for (int i = 1; i <= N; i++) {
                System.out.print("Ingrese el número real " + i + ": ");
                double numero = scanner.nextDouble(); // Leer cada número real
                suma += numero; // Acumular la suma
            }

            // Calcular la media aritmética
            double media = suma / N;

            // Mostrar los resultados
            System.out.println("La suma de los números es: " + suma);
            System.out.println("La media aritmética es: " + media);
        }

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}
