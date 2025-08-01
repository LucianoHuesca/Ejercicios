package org.luciano.Entidades;

public class Animal {
    protected String nombre;
    protected String habitat;
    protected boolean protegida;

    public Animal() {
    }

    public Animal(String nombre, String habitat, boolean protegida) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.protegida = protegida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isProtegida() {
        return protegida;
    }

    public void setProtegida(boolean protegida) {
        this.protegida = protegida;
    }

}
