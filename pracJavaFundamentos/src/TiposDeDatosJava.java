public class TiposDeDatosJava {
    public static void main(String[] args) {
        System.out.println("=== TIPOS DE DATOS EN JAVA ===");
        
        // Tipos de datos primitivos
        
        // Números enteros
        byte numero8Bits = 127;
        short numero16Bits = 32767;
        int numero32Bits = 2147483647;
        long numero64Bits = 9223372036854775807L;
        
        // Números decimales
        float numeroDecimal32 = 3.14f;
        double numeroDecimal64 = 3.14159265359;
        
        // Carácter
        char caracter = 'A';
        
        // Booleano
        boolean verdadero = true;
        boolean falso = false; /// valor default 
        
        // Mostrar los valores
        System.out.println("\n--- NÚMEROS ENTEROS ---");
        System.out.println("byte (8 bits): " + numero8Bits);
        System.out.println("short (16 bits): " + numero16Bits);
        System.out.println("int (32 bits): " + numero32Bits);
        System.out.println("long (64 bits): " + numero64Bits);
        
        System.out.println("\n--- NÚMEROS DECIMALES ---");
        System.out.println("float (32 bits): " + numeroDecimal32);
        System.out.println("double (64 bits): " + numeroDecimal64);
        
        System.out.println("\n--- OTROS TIPOS ---");
        System.out.println("char: " + caracter);
        System.out.println("boolean verdadero: " + verdadero);
        System.out.println("boolean falso: " + falso);
        
        // Tipos de datos de referencia
        String texto = "Hola mundo desde Java";
        System.out.println("\n--- TIPOS DE REFERENCIA ---");
        System.out.println("String: " + texto);
        
        // Mostrar rangos de valores
        System.out.println("\n--- RANGOS DE VALORES ---");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
    }
}
