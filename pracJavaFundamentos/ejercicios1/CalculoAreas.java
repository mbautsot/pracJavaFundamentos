package pracJavaFundamentos.ejercicios1;

public class CalculoAreas {

    ///ESTE ES EL METODO DE INSTANCIA. por lo tato para acceder a el en l metodo main
    ///necesito crear un objeto de la clase para utulizarlo
    public Double areaCuadrado(double lado){
        
        return Math.pow(lado, 2); ///Area = lado^2
    }

    ///Si cramos un mtodo estatico (NO NECESITAMOS CREAR EL OBJETO DE LA INTANCIA PARA LLAMARLO)
     public static Double areaCuadradoEstatico(double lado){

        return Math.pow(lado, 2); ///Area = lado^2;

    }

    public Double areaCirculo(double radio){
        //System.out.println("valor de PI : " + Math.PI);
        //System.out.println("valor Radio a l cuadrado :" + Math.pow(radio, 2));
        return Math.PI * (Math.pow(radio, 2));
    }

    public Double areaRectangulo(double base , double altura){

        return (base * altura);

    }

     public Double areaTriangulo(double base , double altura){

        return  (base * altura) / 2;
    }

    public static void main(String[] args) {
        
        ///Calcular Area Cauadrado
        //TODO: El método areaCuadrado es de instancia (no estático), por lo que necesitas crear un objeto de la clase para usarlo
        CalculoAreas calculoAreas = new CalculoAreas();

        double areaCuadrado = calculoAreas.areaCuadrado(9.5);
        System.out.println("El area del CADRADO es: " +areaCuadrado);

        //TODO: El método areaCuadradoEstatico NO REQUIRE SE CREE UN OBJETO DE LA CLASE para utilizarlo
        double areaCuadradoEstatico = areaCuadradoEstatico(8.6);
        System.out.println("EL area del CUADRADO MTDO ESTATICO: " + areaCuadradoEstatico);

       // double areaC = 9.5*9.5;
       // System.out.println("Alternativo :" + areaC);

       double areaCirculo = calculoAreas.areaCirculo(5.0);
        System.out.println("El area del CIRCULO es: " + areaCirculo);

       double areaRectangulo = calculoAreas.areaRectangulo(8.3, 4.5);
       System.out.println("El area del RECTANGULO es: " + areaRectangulo);

       double areaTriangulo = calculoAreas.areaTriangulo(4.0, 5.6);
       System.out.println("El area del TRIANGULO : " + areaTriangulo);

    }

}
