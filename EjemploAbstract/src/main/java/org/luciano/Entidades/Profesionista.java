package org.luciano.Entidades;

public abstract class Profesionista {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int cedula;
    protected String universidad;
    protected int experiencia;

    //Metodo abstracto
    public abstract void trabajar();

    //metodo concreto
    public void cobrar(String trabajo, double sueldo){
        System.out.println("Trabajo como: "+trabajo + " y me pagan: " + sueldo);
    }

    public Profesionista() {
    }

    public Profesionista(String nombre, String apellido, int edad, int cedula, String universidad, int experiencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.universidad = universidad;
        this.experiencia = experiencia;
    }
}
