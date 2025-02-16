package main;

//1.4. Calcular el mayor de dos números enteros introducidos por teclado. 
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio4 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número entero: ");  
        int numero1 = scanner.nextInt();  
        
        // Pedimos al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número entero: ");  
        int numero2 = scanner.nextInt();  
        
        // Comparamos los dos números para determinar cuál es mayor
        if (numero1 > numero2) {  
            System.out.println("El número mayor es: " + numero1);  
        } else if (numero2 > numero1) {  
            System.out.println("El número mayor es: " + numero2);  
        } else {  
            System.out.println("Ambos números son iguales.");  
        }  
        
        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}
