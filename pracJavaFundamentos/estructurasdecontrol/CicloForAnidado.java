package pracJavaFundamentos.estructurasdecontrol;

public class CicloForAnidado {
    
    public static void main(String[] args) {
    
       // imprimirTablaConTags();
        System.out.println("======================================"); // Línea en blanco entre tablas
       // imprimirTablaConTags();
        imprimirTablaSinTags();
        System.out.println("======================================"); // Línea en blanco entre tablas
    }
    
   //Crear un ciclo for anidado el cual tenga tags
    public static void imprimirTablaConTags() {

        System.out.println("Tabla de multiplicar con etiquetas:");
       forexterno:  for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabla del %d:%n", i);
            
            // Ciclo interno con etiqueta
           forinterno: for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
                break forinterno; // Salta al siguiente valor de i

            }
        }
    }


       //Crear un ciclo for anidado el cual tenga tags
    public static void imprimirTablaSinTags() {
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
