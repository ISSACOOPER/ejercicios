package main.Estructuras_Seleccion;
import java.util.Scanner;

//1.2. Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo. 
public class Ejercicio2 {
    // Importamos la clase Scanner para leer la entrada del usuario

    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");  
        
        // Leemos el número ingresado y lo guardamos en la variable "numero"
        int numero = scanner.nextInt();  
        
        // Verificamos si el número es positivo, negativo o cero
        if (numero > 0) {  // Si el número es mayor que 0, es positivo
            System.out.println("El número " + numero + " es positivo.");  
        } else if (numero < 0) {  // Si el número es menor que 0, es negativo
            System.out.println("El número " + numero + " es negativo.");  
        } else {  // Si el número es 0, mostramos un mensaje especial
            System.out.println("El número es cero.");  
        }  
        
        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}


