package main;

//1.7. Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es
//menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura. 

// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio7 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que ingrese la temperatura del agua
        System.out.print("Ingresa la temperatura del agua en grados Celsius: ");  
        int temperatura = scanner.nextInt();  
        
        // Determinamos el estado del agua según la temperatura ingresada
        if (temperatura < 0) {  
            System.out.println("El agua está en estado SÓLIDO (hielo). ❄️");  
        } else if (temperatura < 100) {  
            System.out.println("El agua está en estado LÍQUIDO. 💧");  
        } else {  
            System.out.println("El agua está en estado GASEOSO (vapor). ☁️");  
        }  
        
        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}
