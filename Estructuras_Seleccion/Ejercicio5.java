package main.Estructuras_Seleccion;
//1.5. Calcular el mayor de tres números enteros introducidos por teclado. 

// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio5 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que ingrese los tres números
        System.out.print("Ingresa el primer número entero: ");  
        int numero1 = scanner.nextInt();  
        
        System.out.print("Ingresa el segundo número entero: ");  
        int numero2 = scanner.nextInt();  
        
        System.out.print("Ingresa el tercer número entero: ");  
        int numero3 = scanner.nextInt();  
        
        // Inicializamos una variable para almacenar el mayor número
        int mayor = numero1; // Suponemos que el primero es el mayor
        
        // Comparamos con el segundo número
        if (numero2 > mayor) {  
            mayor = numero2;  
        }  
        
        // Comparamos con el tercer número
        if (numero3 > mayor) {  
            mayor = numero3;  
        }  
        
        // Mostramos el número mayor
        System.out.println("El número mayor es: " + mayor);  
        
        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}

