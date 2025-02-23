package main.Estructuras_Seleccion;
//1.9. Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto. 

public class Ejercicio9 {  
    public static void main(String[] args) {  
        // Definimos la fecha actual
        int dia = 16, mes = 2, anio = 2025;  
        
        // Sumamos un día
        dia++;  

        // Verificamos si el mes tiene un número de días mayor al permitido
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {  
            dia = 1;  
            mes++;  
        } else if (mes == 2 && dia > 28) {  // Febrero tiene 28 días (no es año bisiesto)
            dia = 1;  
            mes++;  
        } else if (dia > 31) { // Meses con 31 días
            dia = 1;  
            mes++;  
        }

        // Si el mes pasa de diciembre, aumentamos el año
        if (mes > 12) {  
            mes = 1;  
            anio++;  
        }  
        
        // Mostramos la fecha del día siguiente
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);  
    }  
}
