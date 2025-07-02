package pracJavaFundamentos.estructurasdecontrol;

public class CicloForAnidado {
    
    public static void main(String[] args) {
        // Ciclo for anidado para imprimir una tabla de multiplicar
        System.out.println("Tabla de multiplicar del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println(); // Línea en blanco entre tablas
        }
    }

}
