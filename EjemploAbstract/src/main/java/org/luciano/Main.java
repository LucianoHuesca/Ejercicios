package org.luciano;

import org.luciano.Entidades.Abogado;
import org.luciano.Entidades.Medico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciamos abogado
        Abogado abogado = new Abogado("Juan", "Perez", 25, 123456789, "UNAM", 1, "Litigante", "Despacho 3", 2500);
        System.out.println(abogado);
        abogado.trabajar();
        abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());

        //Instanciamiento Medico
        Medico medico = new Medico("Jose", "Gutierrez", 45, 987654321, "BUAP", 8, "Otorrinolaringolo", "Consultorio 10", 1000);
        System.out.println(medico);
        medico.trabajar();
        medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());



    }
}