package org.luciano;

public class Main {

    public static String frase1 = "Miembro estatico";

    //Constantes o variables final: Se asocia a una clase
    public final String frase2 = "Variable final constante";

    //Constante estatica: No cambia despues de la inicializacion
    public static final String frase3 = "Variable final estatica";

    public static void main(String[] args) {
        System.out.println(frase1);
        System.out.println(frase3);


        //Ejemplo variables estaticas calculando el area de un circulo
        float radio = 5;
        double area = calcularAreaCirculo(radio);
        System.out.println("El area del circulo con radio: "+ radio + " es: " + area);

    }

    private static float calcularAreaCirculo(float radio) {
        return (float) (Math.PI * (radio*radio));
    }
}