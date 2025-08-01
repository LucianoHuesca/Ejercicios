package org.luciano;

import org.luciano.Entidades.Hijo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hijo hijo1 = new Hijo("Luciano", "Huesca", 25, 1.65, "Mexicana", "Cafes", "Atletico");
        System.out.println(hijo1);

        hijo1.setEdad(26);
        hijo1.setEstatura(1.67);
        System.out.printf("Edad y estatura actualizada: " + hijo1);

        hijo1.trabajar();
    }

}