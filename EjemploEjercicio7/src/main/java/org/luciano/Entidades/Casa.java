package org.luciano.Entidades;

public class Casa extends Hogar{
    private int noPisos;

    public String mostrarDatos() {
        return "Hogar\n" + "direccion: " + this.direccion + "\ncolonia: " + this.colonia + "\ncp: " + this.cp + "\npisos: " + this.noPisos;
    }

    public Casa() {
    }

    public Casa(String direccion, String colonia, int cp, int noPisos) {
        super(direccion, colonia, cp);
        this.noPisos = noPisos;
    }

    public int getNoPisos() {
        return noPisos;
    }

    public void setNoPisos(int noPisos) {
        this.noPisos = noPisos;
    }
}
