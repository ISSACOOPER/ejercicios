package main.Estructuras_Repeticion;

import java.util.Scanner;

/*2.4. Leer 10 números y obtener su cubo y su cuarta. */
public class E4 {
    public static void main (String[]args){

        //creamos un objeto scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //definimos el número total de valores a leer
        final int TOTAL_NUMEROS = 10;

        //Bucle para imprimir su cubo y su cuarta potencia
        for(int i = 1; i<=TOTAL_NUMEROS; i++){
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble(); //Leer el número ingresado por el usuario

            //calcular el cubo y la cuarta potencia
            double cubo =Math.pow(numero, 3);
            double cuarta =Math.pow(numero, 4);

            //Mostrar los resultados
            System.out.println("Número " + numero);
            System.out.println("-----------------------------");
            System.out.println("Cubo " + cubo);
            System.out.println("-----------------------------");
            System.out.println("Cuarta " + cuarta);
            System.out.println("-----------------------------");

            //cerrar el scanner para evitar fugas de recursos
            scanner.close();



        }


    }
}

