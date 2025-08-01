package org.luciano.Entidades;

public class Padre {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double estatura;
    protected String nacionalidad;

    public Padre() {
    }

    public Padre(String nombre, String apellido, int edad, double estatura, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void trabajar(){
        System.out.println("Trabajando... de 8 AM a 4 PM");
    }

    @Override
    public String toString() {
        return "Padre{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
