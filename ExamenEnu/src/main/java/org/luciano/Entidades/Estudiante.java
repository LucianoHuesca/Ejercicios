package org.luciano.Entidades;

public class Estudiante extends Persona{

    private String carrera;

    @Override
    public String mostrarInformacion() {
        return "Persona\n" + "Id: " + this.getId() + "\nNombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nCarrera: " + this.carrera;
    }

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, int edad, String carrera) {
        super(id, nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
