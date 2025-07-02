package pracJavaFundamentos.estructurasdecontrol;

import java.util.List;
import java.util.stream.IntStream;

public class EjemploAvanzado {
    public static void main(String[] args) {
        // Iteración con rangos usando IntStream (Java 8+)
        System.out.println("Números pares del 1 al 10:");
        IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        
        // Iteración con índice en colecciones (Java 9+)
        List<String> frutas = List.of("Manzana", "Banana", "Naranja");
        System.out.println("\nFrutas con índice:");
        IntStream.range(0, frutas.size())
                .mapToObj(i -> (i+1) + ". " + frutas.get(i))
                .forEach(System.out::println);
    }
}
