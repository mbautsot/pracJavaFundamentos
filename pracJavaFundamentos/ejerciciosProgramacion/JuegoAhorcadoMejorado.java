package pracJavaFundamentos.ejerciciosProgramacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JuegoAhorcadoMejorado {

    private final List<String> palabras;
    private final Random random;
    private int intentos = 6;
    private final Set<Character> letrasIntentadas = new HashSet<>();

    public JuegoAhorcadoMejorado() {
        // Inicialización de la lista de palabras
        palabras = new ArrayList<>(
            Arrays.asList("java", "python", "javascript", 
                            "html", "css", "react", "angular", 
                            "node", "spring", "hibernate")
        );
        random = new Random();
    }

    // Método para obtener una palabra aleatoria
    public String palabraAleatoria() {
        int indice = random.nextInt(palabras.size());
        return palabras.get(indice).toUpperCase();
    }

    // Método para convertir el array de chars (palabra oculta) en un String
    private String palabraOcultaToString(char[] palabraOculta) {
        return new String(palabraOculta);
    }
    
    // Método principal que encapsula toda la lógica del juego
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = palabraAleatoria(); // Ya está en mayúsculas
        char[] palabraOculta = new char[palabraSecreta.length()];
        Arrays.fill(palabraOculta, '_'); // Rellena con '_'

        System.out.println("=== JUEGO DEL AHORCADO ===");
        
        // Bucle principal del juego
        while (intentos > 0 && palabraOcultaToString(palabraOculta).contains("_")) {
            System.out.println("\n-------------------------------------------");
            System.out.println("Palabra: " + palabraOcultaToString(palabraOculta));
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Letras intentadas: " + letrasIntentadas);
            System.out.print("Introduce una letra: ");

            // --- Lógica de Entrada y Validación ---
            String entrada = scanner.nextLine().toUpperCase().trim();
            char letra;
            
            // Validación robusta (solo una letra, alfabética)
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("⚠️ Entrada inválida. Por favor, introduce una única letra (A-Z).");
                continue; // Vuelve al inicio del bucle sin perder intento
            }
            
            letra = entrada.charAt(0);

            // Validación: ¿Letra ya intentada?
            if (letrasIntentadas.contains(letra)) {
                System.out.println("❌ Ya has intentado la letra '" + letra + "'. Intenta otra.");
                continue; // Vuelve al inicio del bucle sin perder intento
            }
            
            // Añadir la letra a la lista de intentadas
            letrasIntentadas.add(letra);

            // --- Lógica de Adivinación ---
            if (palabraSecreta.contains(String.valueOf(letra))) {
                // Actualizar palabra oculta
                boolean acierto = false;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        palabraOculta[i] = letra;
                        acierto = true;
                    }
                }
                if (acierto) {
                    System.out.println("✅ ¡Correcto! La letra está en la palabra.");
                }
            } else {
                // Fallo
                intentos--;
                System.out.println("❌ Incorrecto. La letra no está en la palabra.");
            }
        } // Fin del bucle principal
        
        // --- Mensaje Final ---
        System.out.println("\n===========================================");
        if (intentos > 0) {
            System.out.println("🏆 ¡FELICIDADES! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("💀 ¡HAS PERDIDO! La palabra era: " + palabraSecreta);
        }
        System.out.println("===========================================");
        
        // 🚨 Cerrar el scanner al final de la ejecución
        scanner.close(); 
    }

    public static void main(String[] args) {
        JuegoAhorcadoMejorado juego = new JuegoAhorcadoMejorado();
        juego.iniciarJuego();
    }
}