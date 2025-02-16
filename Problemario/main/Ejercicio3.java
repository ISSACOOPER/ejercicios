package main;
import java.util.Scanner;


//1.3. Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de ambos. Mostrar los resultados por pantalla


public class Ejercicio3 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que ingrese un primer número
        System.out.print("Ingresa un número entero: ");  
        int numero1 = scanner.nextInt();  
        
        // Verificamos si el número es positivo
        if (numero1 > 0) {  
            // Si es positivo, pedimos un segundo número
            System.out.print("Ingresa otro número entero: ");  
            int numero2 = scanner.nextInt();  
            
            // Calculamos la suma, resta y producto de ambos números
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int producto = numero1 * numero2;
            
            // Mostramos los resultados por pantalla
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
            System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
            System.out.println("El producto de " + numero1 + " y " + numero2 + " es: " + producto);
        } else {  
            // Si el primer número no es positivo, mostramos un mensaje
            System.out.println("El número ingresado no es positivo. No se realizarán cálculos.");
        }  
        
        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}



    

