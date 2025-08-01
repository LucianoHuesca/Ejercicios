package org.luciano.Entidades;

public class Hogar {
    protected String direccion;
    protected String colonia;
    protected int cp;

    public String mostrarDatos() {
        return "Hogar\n" + "direccion: " + this.direccion + "\ncolonia: " + this.colonia + "\ncp: " + this.cp;
    }

    public Hogar() {
    }

    public Hogar(String direccion, String colonia, int cp) {
        this.direccion = direccion;
        this.colonia = colonia;
        this.cp = cp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
}
