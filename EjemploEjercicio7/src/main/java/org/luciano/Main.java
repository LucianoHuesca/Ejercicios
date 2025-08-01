package org.luciano;

import org.luciano.Entidades.Casa;
import org.luciano.Entidades.Departamento;
import org.luciano.Entidades.Hogar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hogar[] hog = new Hogar[2];


        hog[0] = new Departamento("Honorio Rdgz", "Francisco", 91026, 10);
        hog[1] = new Casa("Jimenez 34", "Xalapa 2000", 91033, 2);

        for (Hogar hogar : hog) {
            System.out.println(hogar.mostrarDatos());
            System.out.println(hogar);
        }
    }
}