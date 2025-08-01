package org.luciano.Entidades;

public class Departamento extends Hogar{
    private int piso;

    public String mostrarDatos() {
        return "Hogar\n" + "direccion: " + this.direccion + "\ncolonia: " + this.colonia + "\ncp: " + this.cp + "\npiso: " + this.piso;
    }

    public Departamento() {
    }

    public Departamento(String direccion, String colonia, int cp, int piso) {
        super(direccion, colonia, cp);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
}
