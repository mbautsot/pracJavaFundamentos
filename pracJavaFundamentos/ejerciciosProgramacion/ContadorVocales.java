package pracJavaFundamentos.ejerciciosProgramacion;

import java.util.HashSet;
import java.util.Set;

public class ContadorVocales {


    public static void main(String[] args) {
        String frase = "Hola, ¿cómo estás? Espero que bien.";
        System.out.println("Frase: " + frase);
        System.out.println("Número de vocales: " + contarVocales(frase));
    }

    public static int contarVocales(String frase) {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }

        /*
        List<Character> vocales = List.of('a', 'e', 'i', 'o', 'u',
                                          'A', 'E', 'I', 'O', 'U');
        */
        Set<Character> vocales = new HashSet<>(
            Set.of('a', 'e', 'i', 'o', 'u',
                   'A', 'E', 'I', 'O', 'U')
        );

        int contador = 0;

        for (char c : frase.toCharArray()) {
            if (vocales.contains(c)) {
                contador++;
            }
        }

        return contador;
    }    
}
