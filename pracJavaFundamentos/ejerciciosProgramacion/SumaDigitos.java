package pracJavaFundamentos.ejerciciosProgramacion;

public class SumaDigitos {

    public static void main(String[] args) {
        int numero = 12345; // Cambia este valor para probar con otros números
        int suma = sumarDigitos(numero);
        System.out.printf("La suma de los dígitos del número %d es %d.%n", numero, suma);
   
        int sumaStream = sumarDigitosStream(numero);
        System.out.printf("La suma de los dígitos del número %d usando Stream es %d.%n", numero, sumaStream);
    }

    /*
        El método convierte el número a una cadena para iterar sobre cada carácter,
        convirtiéndolo de nuevo a un entero y sumándolo al total.
     */

    public static int sumarDigitos(int n) {
        int suma = 0;
        String numeroStr = Integer.toString(n);
        for (int i = 0; i < numeroStr.length(); i++) {
            suma += Character.getNumericValue(numeroStr.charAt(i));
        }
        return suma;
    }   
    

    public static int sumarDigitosStream(int n) {
        return Integer.toString(n)
                      .chars() // Convierte la cadena en un IntStream de códigos de caracteres
                      .map(Character::getNumericValue) // Convierte cada código de carácter a su valor numérico
                      .sum(); // Suma todos los valores numéricos
    }
    
}
