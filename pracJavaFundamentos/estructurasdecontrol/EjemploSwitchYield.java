package pracJavaFundamentos.estructurasdecontrol;

public class EjemploSwitchYield {

    /*
        * Explicación de la palabra reservada yield en Java
    El yield es una palabra clave introducida en Java 13 como característica de preview y se estabilizó en Java 14 como parte de las expresiones switch. Es una adición importante al lenguaje que cambia fundamentalmente cómo podemos usar las estructuras switch.

    ¿Qué es yield?
    yield se utiliza dentro de un switch expression (no en switch statements tradicionales) para devolver un valor desde un caso particular del switch.
    */
    
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO DE SWITCH CON YIELD ===");
        int dia = 3; // Representa el día de la semana (1=Domingo, 2=Lunes, ..., 7=Sábado)

        String mensaje = switch (dia) {
            case 1 -> "Hoy es Domingo";
            case 2 -> "Hoy es Lunes";
            case 3 -> "Hoy es Martes";
            case 4 -> "Hoy es Miércoles";
            case 5 -> "Hoy es Jueves";
            case 6 -> "Hoy es Viernes";
            case 7 -> "Hoy es Sábado";
            default -> "Día no válido"; // Manejo de caso por defecto
        };

        System.out.println(mensaje);

        /*
        ¿Cuándo usar yield?
        Cuando necesitas lógica adicional en un caso antes de devolver el valor:

        java
        case 3, 4, 5 -> {
            System.out.println("Es primavera!");
            yield "Primavera";
        }
        Cuando usas la sintaxis tradicional (con :) en un switch expresión:

        java
        case 3: case 4: case 5:
            System.out.println("Es primavera!");
            yield "Primavera";
        */


        // Ejemplo de uso de yield
        int mes = 5; // Representa el mes (1=Enero, 2=Febrero, ..., 12=Diciembre)
        String estacion = switch (mes) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes inválido";
        };

        System.out.println("La estación del mes " + mes + " es: " + estacion);



            /**
         * Este método demuestra el uso de la palabra clave 'yield' en un switch expresión.
         * 'yield' se utiliza para devolver un valor desde un bloque de código dentro de un case.
         * 
         */

        Object valor = null; // Puede ser un Integer, String o null;

        Object resultado = switch (valor) {
        case Integer i -> i * 2;
        case String s -> s.toUpperCase();
        case null -> {
            System.out.println("Valor nulo detectado");
            yield "DEFAULT";
        }
        default -> throw new IllegalStateException("Tipo no soportado: " + valor);
        };

        System.out.println("Resultado del switch con yield: " + resultado);
    }
}
