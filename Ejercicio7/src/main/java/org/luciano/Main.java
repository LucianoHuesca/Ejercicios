package org.luciano;

import org.luciano.Entidades.Automovil;
import org.luciano.Entidades.Deportivo;
import org.luciano.Entidades.PickUp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //arreglo de automovil
        Automovil[] ves = new Automovil[4];

        ves[0] = new Automovil("Honda", "Civic", "2002");
        ves[1] = new Deportivo("Ford", "GT", "2003", 8);
        ves[2] = new Deportivo("Mercedes-Benz", "Sprinter", "2024", 20);
        ves[3] = new PickUp("Toyota", "Tahoma", "2015", 30);

        for (Automovil auto : ves) {
            System.out.println(auto.mostrarDatos());
            System.out.println(auto);
        }
    }
}