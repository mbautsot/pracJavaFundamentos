package pracJavaFundamentos.estructurasdecontrol;

import java.util.Arrays;
import java.util.List;

public class CicloForAvanzado {
    
    public static void main(String[] args) {
        
        // 1. For tradicional
        System.out.println("For tradicional:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }
        
        // 2. For mejorado (enhanced for) - introducido en Java 5
        System.out.println("\nFor mejorado (enhanced for):");
        String[] nombres = {"Ana", "Juan", "María", "Carlos"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // 3. For con expresiones lambda (Java 8+)
        System.out.println("\nIteración con forEach y lambda:");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(num -> System.out.println("Número: " + num));
        
        // 4. For con referencia a método (Java 8+)
        System.out.println("\nIteración con referencia a método:");
        numeros.forEach(System.out::println);
        
        // 5. For con múltiples variables
        System.out.println("\nFor con múltiples variables:");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
        
        // 6. For infinito (no recomendado)
        // for (;;) {
        //     System.out.println("Esto se ejecutará para siempre");
        // }
        
        // 7. For con break y continue
        System.out.println("\nFor con break y continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue; // Salta esta iteración
            if (i == 7) break;     // Termina el ciclo
            System.out.println("i: " + i);
        }
        
        // 8. For con streams (Java 8+)
        System.out.println("\nIteración con streams:");
        numeros.stream()
              .filter(n -> n % 2 == 0)
              .forEach(System.out::println);

      
    }
}