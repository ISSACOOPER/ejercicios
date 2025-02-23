package main.Estructuras_Seleccion;
//1.8. Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un
//año y devuelva si es bisiesto o no. 

// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio8 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que ingrese un año
        System.out.print("Ingresa un año: ");  
        int anio = scanner.nextInt();  
        
        // Verificamos si el año es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {  
            System.out.println("El año " + anio + " es bisiesto. ✅");  
        } else {  
            System.out.println("El año " + anio + " NO es bisiesto. ❌");  
        }  
        
        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}
