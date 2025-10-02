package pracJavaFundamentos.ejerciciosProgramacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneradorContraseñaSegura {

    // Se recomienda usar un único objeto Random estático y final.
    private static final Random RANDOM = new Random();
    
    // Se definen las constantes de caracteres
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    
    private static final String TODOS_CARACTERES = MAYUSCULAS + MINUSCULAS + NUMEROS + SIMBOLOS;


    public static void main(String[] args) {
        int longitud = 12;
        try {
            String contraseñaSegura = generarContraseñaSegura(longitud);
            System.out.println("Contraseña segura generada (Longitud " + longitud + "): " + contraseñaSegura);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String generarContraseñaSegura(int longitud) {
        
        // 1. Validación de longitud mínima (ahora 4)
        if (longitud < 4) {
            throw new IllegalArgumentException("La longitud de la contraseña debe ser de al menos 4 para incluir todos los tipos de caracteres.");
        }

        // Usamos una lista de caracteres para construir la contraseña, lo que facilita la mezcla.
        List<Character> passwordChars = new ArrayList<>();

        // Método auxiliar que obtiene un char aleatorio de un String dado
        java.util.function.Function<String, Character> getRandomChar = (String s) -> s.charAt(RANDOM.nextInt(s.length()));

        // 2. Asegurar los requisitos mínimos
        passwordChars.add(getRandomChar.apply(MAYUSCULAS));
        passwordChars.add(getRandomChar.apply(MINUSCULAS));
        passwordChars.add(getRandomChar.apply(NUMEROS));
        passwordChars.add(getRandomChar.apply(SIMBOLOS));

        // 3. Rellenar el resto de la contraseña
        int remainingLength = longitud - 4;
        for (int i = 0; i < remainingLength; i++) {
            passwordChars.add(getRandomChar.apply(TODOS_CARACTERES));
        }

        // 4. Mezclar los caracteres usando el método optimizado de Java
        Collections.shuffle(passwordChars);

        // 5. Convertir la lista de caracteres a String
        StringBuilder sb = new StringBuilder();
        for (Character c : passwordChars) {
            sb.append(c);
        }

        return sb.toString();
    }
    
}