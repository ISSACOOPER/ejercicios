package main.Estructuras_Seleccion;
/*1.13. Escribir un programa que permita determinar la cantidad total a pagar por una llamada telefónica de N minutos
(introducido por el usuario), teniendo en cuenta lo siguiente:
• Las llamadas de 5 minutos o menos tienen un coste de 10 BsF.
• Cada minuto adicional a partir de los 5 primeros cuesta 2 BsF.  */
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio13 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);  
        
        // Pedimos al usuario que ingrese la duración de la llamada en minutos
        System.out.print("Ingresa la duración de la llamada en minutos: ");  
        int minutos = scanner.nextInt();  
        
        // Variable para almacenar el costo total de la llamada
        int costoTotal;  
        
        // Verificamos si la llamada dura 5 minutos o menos
        if (minutos <= 5) {  
            costoTotal = 10;  // Costo fijo de 10 BsF
        } else {  
            // Costo de los primeros 5 minutos
            costoTotal = 10;  
            // Costo adicional por cada minuto extra (2 BsF por minuto extra)
            costoTotal += (minutos - 5) * 2;  
        }  

        // Mostramos el costo total de la llamada
        System.out.println("El costo total de la llamada es: " + costoTotal + " BsF");  

        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}

