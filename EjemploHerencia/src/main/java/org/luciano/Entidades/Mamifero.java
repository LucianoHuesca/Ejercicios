package org.luciano.Entidades;

public class Mamifero extends Animal {
    private boolean terrestre;
    private String alimentacion;

    public Mamifero() {
    }

    public Mamifero(String nombre, String habitat, boolean protegida, boolean terrestre, String alimentacion) {
        super(nombre, habitat, protegida);
        this.terrestre = terrestre;
        this.alimentacion = alimentacion;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "terrestre=" + terrestre +
                ", alimentacion='" + alimentacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", habitat='" + habitat + '\'' +
                ", protegida=" + protegida +
                '}';
    }
}
