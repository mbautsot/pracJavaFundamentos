package pracJavaFundamentos.ejerciciosProgramacion;

public class NumeroPrimo {

    public static void main(String[] args) {
        int numero = 29; // Cambia este valor para probar con otros números
        boolean esPrimo = esNumeroPrimo(numero);
        System.out.printf("El número %d %s un número primo.%n", numero, esPrimo ? "es" : "no es");
   
        boolean esPrimoStream = esNumeroPrimoStream(numero);
        System.out.printf("El número %d %s un número primo con Stream.%n", numero, esPrimoStream ? "es" : "no es");


    }

    /*
        Un número primo es un número mayor que 1 que solo tiene dos divisores: 1 y él mismo.
        El método verifica si un número es primo comprobando si es divisible por algún número
        desde 2 hasta la raíz cuadrada del número.
     */

    public static boolean esNumeroPrimo(int n) {
        if (n <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Solo necesitamos verificar hasta la raíz cuadrada de n
            if (n % i == 0) {
                return false; // Si n es divisible por i, no es primo
            }
        }
        return true; // Si no encontramos divisores, n es primo
    }   
    

    public static boolean esNumeroPrimoStream(int n) {
        if (n <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n))
                                         .noneMatch(i -> n % i == 0);
    }
}
