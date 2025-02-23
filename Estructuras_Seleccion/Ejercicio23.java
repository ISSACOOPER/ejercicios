package main.Estructuras_Seleccion;
/*1.23. La fecha del domingo de Pascua corresponde al primer domingo después de la primera luna llena que sigue al
equinoccio de primavera. Dado un año, los cálculos que permiten conocer esta fecha son:
• A = año %19
• B = año % 4
• C = año % 7
• D = (19 * A + 24) % 30
• E = (2 * B + 4 * C + 6 * D + 5) % 7
• N = (22 + D + E)
Donde N indica el número del día del mes de marzo (o abril si N es superior a 31) correspondiente al domingo de
Pascua. Escribir un programa que lea un año y muestre el día y el mes en el que se celebró o se celebrará el
domingo de Pascua ese año. Utilizar una función a la que se le pase como parámetro el año y retorne el valor de
N. El programa principal realiza el resto del proceso.  */
import java.util.Scanner;

public class Ejercicio23 {

    // Función para calcular el día de Pascua según el año ingresado
    public static int calcularPascua(int año) {
        int A = año % 19;
        int B = año % 4;
        int C = año % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E; // Día de Pascua
        
        return N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el año al usuario
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();
        
        // Calcular la fecha de Pascua
        int diaPascua = calcularPascua(año);
        
        // Determinar el mes (marzo o abril)
        String mes = (diaPascua > 31) ? "abril" : "marzo";
        if (diaPascua > 31) {
            diaPascua -= 31; // Ajustar el día para abril
        }

        // Mostrar el resultado
        System.out.println("📅 En el año " + año + ", el Domingo de Pascua es el " + diaPascua + " de " + mes + ".");

        scanner.close();
    }
}
