package main.Estructuras_Repeticion;
/*2.1. Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas */
public class E1 {
    public static void main(String[] args) {
        // Definimos una cadena con todas las letras del alfabeto en mayúsculas
        String alfabetoMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        // Convertimos todas las letras a minúsculas utilizando el método toLowerCase()
        String alfabetoMinusculas = alfabetoMayusculas.toLowerCase();

        // Imprimimos el alfabeto original en mayúsculas
        System.out.println("Alfabeto en mayúsculas: " + alfabetoMayusculas);
        
        // Imprimimos el alfabeto convertido en minúsculas
        System.out.println("Alfabeto en minúsculas: " + alfabetoMinusculas);
    }
}

