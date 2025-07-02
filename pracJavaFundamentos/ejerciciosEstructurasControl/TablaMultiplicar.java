package pracJavaFundamentos.ejerciciosEstructurasControl;

import java.util.stream.IntStream;

public class TablaMultiplicar {

    public static void main(String[] args) {
       // imprimirTablas1_20();
       // imprimirTablaNum_Par();
       imprimirTablaNum_ParStreams();
    }

    // Crear un ciclo for anidado el cual tenga tags
    public static void imprimirTablas1_20() {

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Tabla del %d:%n", i);
            for (int j = 1; j <= 20; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println(); // Línea en blanco entre tablas
        }
    }

        // Crear un ciclo for anidado el cual tenga tags
        public static void imprimirTablaNum_Par() {
            // Ciclo for anidado para imprimir una tabla de multiplicar

        forxterno: for (int i = 1; i <= 20; i++) {
                // Verificar si el número es par 
                if (i % 2==0) {
                System.out.printf("Tabla del %d:%n", i);

                fornterno: for (int j = 1; j <= 20; j++) {
                    // Verificar si el resultado de la multiplicación es par
                    if ((i * j) % 2 == 0) {
                        System.out.printf("%d x %d = %d%n", i, j, i * j);
                    }
                }                
                System.out.println(); // Línea en blanco entre tablas
            }
        }
    }

    public static void imprimirTablaNum_ParStreams() {
    IntStream.rangeClosed(1, 20)
        .filter(i -> i % 2 == 0)
        .forEach(i -> {
            System.out.printf("Tabla del %d:%n", i);
            
            IntStream.rangeClosed(1, 10)
                .filter(j -> (i * j) % 2 == 0)
                .forEach(j -> System.out.printf("%d x %d = %d%n", i, j, i * j));
            
            System.out.println();
        });
}
}
