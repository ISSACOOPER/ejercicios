package main.Estructuras_Seleccion;

//1.1. Escribir un programa que solicite un valor entero al usuario y determine si es par o impar. 
// Importamos la clase Scanner para poder leer la entrada del usuario desde la consola
import java.util.Scanner;

public class Ejercicio1 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Mostramos un mensaje en consola pidiendo al usuario un número entero
        System.out.print("Ingresa un número entero: ");  
        
        // Leemos el número ingresado por el usuario y lo guardamos en la variable "numero"
        int numero = scanner.nextInt();  
        
        // Verificamos si el número es par o impar usando el operador módulo (%)
        if (numero % 2 == 0) {  // Si el residuo de la división entre 2 es 0, significa que es par
            System.out.println("El número " + numero + " es par.");  
        } else {  // Si el residuo no es 0, significa que es impar
            System.out.println("El número " + numero + " es impar.");  
        }  
        
        // Cerramos el objeto Scanner para liberar recursos
        scanner.close();  
    }  
}

