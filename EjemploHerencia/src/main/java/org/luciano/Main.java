package org.luciano;

import org.luciano.Entidades.Mamifero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mamifero ani1 = new Mamifero("Ballena", "Oceano", true, false, "Peces y moluscos");
        Mamifero ani2 = new Mamifero("Mono", "Selva", false, true, "Hervivoro");
        System.out.println("Animal 1: " + ani1 + " Animal 2: " + ani2);

        ani2.setProtegida(true);
        System.out.println("Animal: " + ani2 + " ha sido modificado");


    }
}