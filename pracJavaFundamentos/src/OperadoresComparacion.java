

/**
 * Clase que explica los operadores de comparación en Java
 * Incluye ejemplos prácticos de cada operador
 */
public class OperadoresComparacion {

    // Descripciones detalladas de cada operador
    private static final String IGUAL_A = 
        "Operador: == (igual a) \n" +
        "Descripción: Compara si dos valores son iguales \n" +
        "Tipo de datos aplicable: Todos los primitivos, objetos (pero cuidado con objetos) \n" +
        "Ejemplo: \n" +
        "   int a = 5, b = 5; \n" +
        "   boolean resultado = (a == b); // resultado = true \n" +
        "Precaución: Para objetos, compara referencias, no contenido. Usar equals() para objetos como String.";

    private static final String DIFERENTE_DE = 
        "Operador: != (diferente de) \n" +
        "Descripción: Compara si dos valores son diferentes \n" +
        "Tipo de datos aplicable: Todos los primitivos, objetos \n" +
        "Ejemplo: \n" +
        "   int a = 5, b = 3; \n" +
        "   boolean resultado = (a != b); // resultado = true";

    private static final String MAYOR_QUE = 
        "Operador: > (mayor que) \n" +
        "Descripción: Evalúa si el valor izquierdo es mayor que el derecho \n" +
        "Tipo de datos aplicable: byte, short, int, long, float, double, char \n" +
        "Ejemplo: \n" +
        "   double precio = 15.99; \n" +
        "   boolean caro = (precio > 10.00); // caro = true";

    private static final String MENOR_QUE = 
        "Operador: < (menor que) \n" +
        "Descripción: Evalúa si el valor izquierdo es menor que el derecho \n" +
        "Tipo de datos aplicable: byte, short, int, long, float, double, char \n" +
        "Ejemplo: \n" +
        "   int edad = 17; \n" +
        "   boolean menorEdad = (edad < 18); // menorEdad = true";

    private static final String MAYOR_O_IGUAL_QUE = 
        "Operador: >= (mayor o igual que) \n" +
        "Descripción: Evalúa si el valor izquierdo es mayor o igual al derecho \n" +
        "Tipo de datos aplicable: byte, short, int, long, float, double, char \n" +
        "Ejemplo: \n" +
        "   int puntuacion = 75; \n" +
        "   boolean aprobado = (puntuacion >= 70); // aprobado = true";

    private static final String MENOR_O_IGUAL_QUE = 
        "Operador: <= (menor o igual que) \n" +
        "Descripción: Evalúa si el valor izquierdo es menor o igual al derecho \n" +
        "Tipo de datos aplicable: byte, short, int, long, float, double, char \n" +
        "Ejemplo: \n" +
        "   float temperatura = 36.5f; \n" +
        "   boolean normal = (temperatura <= 37.5f); // normal = true";

    private static final String INSTANCE_OF = 
        "Operador: instanceof \n" +
        "Descripción: Verifica si un objeto es instancia de una clase/interfaz \n" +
        "Tipo de datos aplicable: Objetos \n" +
        "Ejemplo: \n" +
        "   String texto = \"Hola\"; \n" +
        "   boolean esString = (texto instanceof String); // esString = true \n" +
        "Uso común: En herencia y polimorfismo para verificar tipos en tiempo de ejecución";

    /**
     * Muestra información detallada de todos los operadores de comparación
     */
    public static void mostrarTodosOperadores() {
        System.out.println("OPERADORES DE COMPARACIÓN EN JAVA\n");
        System.out.println(IGUAL_A + "\n");
        System.out.println(DIFERENTE_DE + "\n");
        System.out.println(MAYOR_QUE + "\n");
        System.out.println(MENOR_QUE + "\n");
        System.out.println(MAYOR_O_IGUAL_QUE + "\n");
        System.out.println(MENOR_O_IGUAL_QUE + "\n");
        System.out.println(INSTANCE_OF + "\n");
    }

    /**
     * Obtiene información específica sobre un operador
     * @param operador El operador como string (ej: "==", ">=", "instanceof")
     * @return String con la información detallada
     */
    public static String obtenerInfoOperador(String operador) {
        switch(operador) {
            case "==": return IGUAL_A;
            case "!=": return DIFERENTE_DE;
            case ">": return MAYOR_QUE;
            case "<": return MENOR_QUE;
            case ">=": return MAYOR_O_IGUAL_QUE;
            case "<=": return MENOR_O_IGUAL_QUE;
            case "instanceof": return INSTANCE_OF;
            default: return "Operador no reconocido. Operadores disponibles: " +
                    "==, !=, >, <, >=, <=, instanceof";
        }
    }

    /**
     * Ejemplos prácticos de uso de operadores de comparación
     */
    public static void demostrarEjemplos() {
        System.out.println("\nDEMOSTRACIÓN PRÁCTICA DE OPERADORES:\n");
        
        // == y !=
        int a = 10, b = 20;
        System.out.println(a + " == " + b + ": " + (a == b)); // false
        System.out.println(a + " != " + b + ": " + (a != b)); // true
        
        // >, <, >=, <=
        System.out.println(a + " > " + b + ": " + (a > b));  // false
        System.out.println(a + " < " + b + ": " + (a < b));  // true
        System.out.println(a + " >= 10: " + (a >= 10));     // true
        System.out.println(b + " <= 20: " + (b <= 20));      // true
        
        // instanceof
        String texto = "Ejemplo";
        System.out.println("texto instanceof String: " + (texto instanceof String)); // true
    }

    public static void main(String[] args) {
        // Mostrar toda la información
        mostrarTodosOperadores();
        
        // Mostrar ejemplos prácticos
        demostrarEjemplos();
        
        // O obtener información de un operador específico
        // System.out.println(obtenerInfoOperador(">="));
    }
}