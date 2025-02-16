package main;
//1.11. Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. La letra inicial puede ser
//mayúscula o minúscula. Usar la x para el miércoles.
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio11 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);  
        
        // Pedimos al usuario que ingrese la inicial del día de la semana
        System.out.print("Ingresa la inicial del día de la semana (Usa 'x' para miércoles): ");  
        char inicial = scanner.next().toLowerCase().charAt(0); // Convertimos a minúscula para evitar errores
        
        // Usamos una estructura switch para determinar el nombre del día
        String nombreDia;  
        switch (inicial) {  
            case 'l': nombreDia = "Lunes"; break;  
            case 'm': nombreDia = "Martes"; break;  
            case 'x': nombreDia = "Miércoles"; break;  
            case 'j': nombreDia = "Jueves"; break;  
            case 'v': nombreDia = "Viernes"; break;  
            case 's': nombreDia = "Sábado"; break;  
            case 'd': nombreDia = "Domingo"; break;  
            default: nombreDia = "Inicial inválida";  
        }  

        // Mostramos el resultado
        System.out.println("El día correspondiente es: " + nombreDia);  

        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}
