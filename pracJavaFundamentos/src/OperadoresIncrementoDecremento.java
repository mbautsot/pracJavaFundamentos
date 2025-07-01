public class OperadoresIncrementoDecremento {
    
    public static void main(String[] args) {
        System.out.println("=== OPERADORES DE INCREMENTO Y DECREMENTO EN JAVA ===");
        System.out.println("Estos operadores modifican el valor de una variable en 1 unidad.");
        
        // Ejemplo 1: Operador de incremento (++)
        System.out.println("\n--- Incremento (++) ---");
        int a = 5;
        System.out.println("Valor inicial de a: " + a); // 5
        
        // Incremento postfijo (a++)
        System.out.println("\nPost-incremento (a++):");
        System.out.println("Valor durante la operación: " + a++); // Muestra 5 (valor actual), luego incrementa
        System.out.println("Valor después del incremento: " + a); // 6
        
        // Reiniciamos el valor para el siguiente ejemplo
        a = 5;
        
        // Incremento prefijo (++a)
        System.out.println("\nPre-incremento (++a):");
        System.out.println("Valor durante la operación: " + ++a); // Incrementa primero, luego muestra 6
        System.out.println("Valor después del incremento: " + a); // 6
        
        // Ejemplo 2: Operador de decremento (--)
        System.out.println("\n--- Decremento (--) ---");
        int b = 8;
        System.out.println("Valor inicial de b: " + b); // 8
        
        // Decremento postfijo (b--)
        System.out.println("\nPost-decremento (b--):");
        System.out.println("Valor durante la operación: " + b--); // Muestra 8, luego decrementa
        System.out.println("Valor después del decremento: " + b); // 7
        
        // Reiniciamos el valor para el siguiente ejemplo
        b = 8;
        
        // Decremento prefijo (--b)
        System.out.println("\nPre-decremento (--b):");
        System.out.println("Valor durante la operación: " + --b); // Decrementa primero, luego muestra 7
        System.out.println("Valor después del decremento: " + b); // 7
        
        // Ejemplo 3: Operadores de asignación compuesta
        System.out.println("\n=== OPERADORES DE ASIGNACIÓN COMPUESTA ===");
        System.out.println("Combinan una operación aritmética con una asignación.");
        
        int c = 10;
        System.out.println("\nValor inicial de c: " + c); // 10
        
        // Suma y asignación (+=)
        c += 3; // Equivalente a c = c + 3
        System.out.println("Después de c += 3: " + c); // 13
        
        // Resta y asignación (-=)
        c -= 5; // Equivalente a c = c - 5
        System.out.println("Después de c -= 5: " + c); // 8
        
        // Multiplicación y asignación (*=)
        c *= 2; // Equivalente a c = c * 2
        System.out.println("Después de c *= 2: " + c); // 16
        
        // División y asignación (/=)
        c /= 4; // Equivalente a c = c / 4
        System.out.println("Después de c /= 4: " + c); // 4
        
        // Módulo y asignación (%=)
        c %= 3; // Equivalente a c = c % 3
        System.out.println("Después de c %= 3: " + c); // 1 (4 % 3 = 1)
        
        // Ejemplo 4: Caso práctico con bucles
        System.out.println("\n=== CASO PRÁCTICO CON BUCLES ===");
        System.out.println("Uso común de incremento en bucles for:");
        
        System.out.println("\nBucle for con incremento:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }
        
        System.out.println("\nBucle for con decremento:");
        for(int j = 5; j > 0; j--) {
            System.out.println("Iteración: " + j);
        }
    }
}