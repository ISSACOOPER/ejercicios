package main.Estructuras_Seleccion;
/*1.12. Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es
necesario:
• El año debe ser mayor que cero.
• El mes debe estar entre 1 y 12.
• Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que tienen 31 días
son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año
bisiesto que es 29 días.  */



// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio12 {  
    public static void main(String[] args) {  
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);  
        
        // Pedimos al usuario que ingrese la fecha en formato dd:mm:aaaa
        System.out.print("Ingresa una fecha en formato dd:mm:aaaa (ejemplo 16:02:2025): ");  
        String fecha = scanner.nextLine();  
        
        // Dividimos la cadena en día, mes y año usando ":"
        String[] partes = fecha.split(":");
        
        // Verificamos que tenga exactamente 3 partes
        if (partes.length != 3) {  
            System.out.println("Formato incorrecto. Debes ingresar la fecha como dd:mm:aaaa.");  
        } else {  
            // Convertimos las partes a enteros
            int dia = Integer.parseInt(partes[0]);  
            int mes = Integer.parseInt(partes[1]);  
            int anio = Integer.parseInt(partes[2]);  
            
            // Verificamos si el año es válido
            if (anio <= 0) {  
                System.out.println("Fecha incorrecta: El año debe ser mayor que 0.");  
            }  
            // Verificamos si el mes es válido
            else if (mes < 1 || mes > 12) {  
                System.out.println("Fecha incorrecta: El mes debe estar entre 1 y 12.");  
            }  
            else {  
                // Determinamos el número de días permitidos en el mes
                int diasEnMes;
                switch (mes) {  
                    case 4: case 6: case 9: case 11: diasEnMes = 30; break;  
                    case 2: 
                        // Verificamos si el año es bisiesto
                        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {  
                            diasEnMes = 29;  // Año bisiesto
                        } else {  
                            diasEnMes = 28;  // Año no bisiesto
                        }  
                        break;  
                    default: diasEnMes = 31; // Meses con 31 días  
                }  

                // Verificamos si el día es válido
                if (dia < 1 || dia > diasEnMes) {  
                    System.out.println("Fecha incorrecta: El día no es válido para este mes.");  
                } else {  
                    System.out.println("La fecha ingresada es válida: " + fecha);  
                }  
            }  
        }  

        // Cerramos el Scanner para liberar recursos
        scanner.close();  
    }  
}
