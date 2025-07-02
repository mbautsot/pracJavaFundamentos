package pracJavaFundamentos.estructurasdecontrol;

/**
 * Esta clase demuestra las principales estructuras de control en Java
 * con ejemplos prácticos y comentarios explicativos.
 */
public class EstructurasControlJava {

    public static void main(String[] args) {
        System.out.println("=== ESTRUCTURAS DE CONTROL EN JAVA ===");
        demostrarCondicionales();
        demostrarBucles();
        demostrarSwitch();
        demostrarControlFlujo();
    }

    /**
     * Demuestra estructuras condicionales: if, if-else, if-else if
     */
    public static void demostrarCondicionales() {
        System.out.println("\n--- CONDICIONALES ---");
        
        int edad = 18;
        
        // 1. IF simple
        if (edad >= 18) {
            System.out.println("Eres mayor de edad (if simple)");
        }
        
        // 2. IF-ELSE
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad (if-else)");
        }
        
        // 3. IF-ELSE IF-ELSE
        int puntuacion = 85;
        if (puntuacion >= 90) {
            System.out.println("Excelente!");
        } else if (puntuacion >= 70) {
            System.out.println("Buen trabajo (if-else if)");
        } else {
            System.out.println("Necesitas mejorar");
        }
        
        // 4. Operador ternario
        String resultado = (puntuacion >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Resultado (ternario): " + resultado);
    }

    /**
     * Demuestra estructuras de bucle: for, while, do-while
     */
    public static void demostrarBucles() {
        System.out.println("\n--- BUCLES ---");
        
        // 1. Bucle FOR
        System.out.print("Conteo con for: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        // 2. Bucle WHILE
        System.out.print("\nConteo con while: ");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        
        // 3. Bucle DO-WHILE
        System.out.print("\nConteo con do-while: ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        
        // 4. Bucle FOR mejorado (for-each)
        System.out.print("\nFor-each con arreglo: ");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    /**
     * Demuestra la estructura switch (tradicional y con expresiones)
     */
    public static void demostrarSwitch() {
        System.out.println("\n\n--- SWITCH ---");
        
        String dia = "Martes";
        
        // Switch tradicional
        System.out.print("Switch tradicional: ");
        switch (dia) {
            case "Lunes":
                System.out.println("Inicio de semana");
                break;
            case "Martes":
                System.out.println("Día productivo (switch tradicional)");
                break;
            case "Miércoles":
                System.out.println("Mitad de semana");
                break;
            default:
                System.out.println("Otro día");
        }
        
        // Switch con expresiones (Java 14+)
        System.out.print("Switch con expresión: ");
        String mensaje = switch (dia) {
            case "Lunes", "Viernes" -> "Días especiales";
            case "Martes", "Jueves" -> {
                yield "Días de trabajo (switch expresión)";
            }
            default -> "Día normal";
        };
        System.out.println(mensaje);
    }

    /**
     * Demuestra palabras clave para control de flujo
     */
    public static void demostrarControlFlujo() {
        System.out.println("\n--- CONTROL DE FLUJO ---");
        
        // 1. BREAK
        System.out.print("Uso de break: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Sale del bucle
            }
            System.out.print(i + " ");
        }
        
        // 2. CONTINUE
        System.out.print("\nUso de continue: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Salta la iteración actual
            }
            System.out.print(i + " ");
        }
        
        // 3. RETURN
        System.out.println("\nResultado de método: " + obtenerMensaje());
    }
    
    private static String obtenerMensaje() {
        return "Este mensaje se devuelve con return";
    }
}
