package pracJavaFundamentos.ejerciciosEstructurasControl;

import java.util.stream.LongStream;

public class FactorialNumero {

    public static void main(String[] args) {
        int numero = 3; // Cambia este valor para calcular el factorial de otro número
        long factorial = calcularFactorial(numero);
        long factorialStream = factorialStream(numero); // Usando el método con streams

        System.out.printf("El factorial de %d es: %d%n", numero, factorial);
        System.out.printf("El factorial de %d usando bucle es: %d%n", numero, factorialStream);

    }

    /*
     

      
     */

    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /*
        * Método usando Streams de Java 8 
     ¿Cómo funciona?

        LongStream.rangeClosed(1, n): Crea un stream de números del 1 al n

        .reduce(1, (a, b) -> a * b): Multiplica todos los números del stream

        1: Valor inicial

        (a, b) -> a * b: Función que multiplica los elementos
     * 
     */

    public static long factorialStream(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número no válido");
        }
        return LongStream.rangeClosed(1, n)
                        .reduce(1, (a, b) -> a * b);
    }
}
