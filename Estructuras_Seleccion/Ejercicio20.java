package main.Estructuras_Seleccion;
/*1.20. Construir un programa que calcule y presente por pantalla el signo del zodiaco a partir de la introducción por
teclado del día y mes de nacimiento como números enteros.

Signo                      Rango de Fecha

Capricornio                del 22 de diciembre al 20 de enero
Acuario                    del 21 de enero al 19 de febrero
Piscis                     del 20 de febrero al 20 de marzo
Aries                      del 21 de marzo al 19 de abril
Tauro                      del 20 de abril al 20 de mayo
Géminis                    del 21 de mayo al 21 de junio
Cáncer                     del 22 de junio al 21 de julio
Leo                        del 22 de julio al 21 de agosto
Virgo                      del 22 de agosto al 22 de septiembre
Libra                      del 23 de septiembre al 22 de octubre
Escorpio                   del 23 de octubre al 21 de noviembre
Sagitario                  del 22 de noviembre al 21 de diciembre 
 */
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        String signo = "";

        // Determinar el signo zodiacal
        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 21)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 21)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 22) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            signo = "Capricornio";
        } else {
            signo = "Fecha inválida";
        }

        // Mostrar resultado
        System.out.println("✨ Tu signo del zodiaco es: " + signo + " ✨");

        scanner.close();
    }
}
