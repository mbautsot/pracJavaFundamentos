package pracJavaFundamentos.ejerciciosProgramacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JuegoAhorcado {

    //Intentos
    private int intentos = 6;
    //Lista de palabras para el juego
    private ArrayList<String> palabras = new ArrayList<>(
        Arrays.asList("java", "python", "javascript", 
                            "html", "css", "react", "angular", 
                            "node", "spring", "hibernate")
        );


    public String palabraAleatoria() {
        int indice = (int) (Math.random() * palabras.size());
        return palabras.get(indice);
    }

    public String ocultarPalabra(String palabra) {
        return "_".repeat(palabra.length());
    }

    public static void main(String[] args) {

        //#Iniciamos juego
        JuegoAhorcado juego = new JuegoAhorcado();
        String palabra = juego.palabraAleatoria().toUpperCase();
       // System.out.println("Palabra seleccionada (para pruebas): " + palabra);
        String palabraOculta = juego.ocultarPalabra(palabra);
        //System.out.println("Palabra a adivinar: " + palabraOculta);
        System.out.println("=== JUEGO DEL AHORCADO ===");
        System.out.println("Palabra a adivinar: " + palabraOculta);
        System.out.println("Tienes " + juego.intentos + " intentos para adivinar la palabra.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una letra:");
        
        String letra = scanner.nextLine().toUpperCase();
        
        while (juego.intentos > 0 && palabraOculta.contains("_")) {
            if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
                if (palabra.contains(letra)) {
                    // Actualizar palabra oculta
                    StringBuilder nuevaPalabraOculta = new StringBuilder(palabraOculta);
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra.charAt(0)) {
                            nuevaPalabraOculta.setCharAt(i, letra.charAt(0));
                        }
                    }
                    palabraOculta = nuevaPalabraOculta.toString();
                    System.out.println("¡Correcto! La letra " + letra + " está en la palabra.");
                } else {
                    juego.intentos--;
                    System.out.println("Incorrecto. La letra " + letra + " no está en la palabra.");
                    System.out.println("Te quedan " + juego.intentos + " intentos.");
                }
                System.out.println("Palabra actual: " + palabraOculta);
                
                if (!palabraOculta.contains("_")) {
                    System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                    break;
                }
                
                if (juego.intentos == 0) {
                    System.out.println("Has perdido. La palabra era: " + palabra);
                    break;
                }

                System.out.println("Introduce otra letra:");
                letra = scanner.nextLine().toUpperCase();

            } else {

                System.out.println("Entrada inválida. Por favor, introduce una sola letra.");
                System.out.println("Introduce una letra:");
                letra = scanner.nextLine().toUpperCase();
            }
            scanner.close();
        }
    
    }

}


