package pracJavaFundamentos.ejerciciosEstructurasControl;

public class FactorialNumero {

    public static void main(String[] args) {
        int numero = 3; // Cambia este valor para calcular el factorial de otro número
        long factorial = calcularFactorial(numero);
        System.out.printf("El factorial de %d es: %d%n", numero, factorial);
    }

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
}
