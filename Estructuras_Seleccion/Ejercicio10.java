package main.Estructuras_Seleccion;
//1.10. Pedir un mes (número) y mostrar el nombre del mes. 

// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio10 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);  
        
        // Pedimos al usuario que ingrese un número de mes
        System.out.print("Ingresa un número de mes (1-12): ");  
        int mes = scanner.nextInt();  
        
        // Usamos una estructura switch para determinar el nombre del mes
        String nombreMes;  
        switch (mes) {  
            case 1:  nombreMes = "Enero"; break;  
            case 2:  nombreMes = "Febrero"; break;  
            case 3:  nombreMes = "Marzo"; break;  
            case 4:  nombreMes = "Abril"; break;  
            case 5:  nombreMes = "Mayo"; break;  
            case 6:  nombreMes = "Junio"; break;  
            case 7:  nombreMes = "Julio"; break;  
            case 8:  nombreMes = "Agosto"; break;  
            case 9:  nombreMes = "Septiembre"; break;  
            case 10: nombreMes = "Octubre"; break;  
            case 11: nombreMes = "Noviembre"; break;  
            case 12: nombreMes = "Diciembre"; break;  
            default: nombreMes = "Número de mes inválido";  
        }  

        // Mostramos el resultado
        System.out.println("El mes correspondiente es: " + nombreMes);  

        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}

